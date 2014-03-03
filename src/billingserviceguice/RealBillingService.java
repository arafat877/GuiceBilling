/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package billingserviceguice;

import com.google.inject.Inject;

/**
 *
 * @author juanc
 */
public class RealBillingService implements BillingService{
    private final CreditCardProcessor processor;
    private final TransactionLog transactionLog;
    
    
    
    @Inject
    public RealBillingService(CreditCardProcessor processor,TransactionLog transactionLog) {
        this.processor = processor;
        this.transactionLog = transactionLog;
  }
    
    
    

    @Override
    public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
    try {
      ChargeResult result = processor.charge(creditCard, order.getAmount());
      transactionLog.logChargeResult(result);

      return result.wasSuccessful()
          ? Receipt.forSuccessfulCharge(order.getAmount())
          : Receipt.forDeclinedCharge(result.getDeclineMessage());
     } catch (UnreachableException e) {
      transactionLog.logConnectException(e);
      return Receipt.forSystemFailure(e.getMessage());
    }
  }
    
}

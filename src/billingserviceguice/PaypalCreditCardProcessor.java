/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package billingserviceguice;


/**
 *
 * @author juanc
 */
public class PaypalCreditCardProcessor implements CreditCardProcessor {
    ChargeResult result;
    
    
    
    @Override
    public ChargeResult charge(CreditCard creditCard, int cost) throws UnreachableException {
            if (creditCard == null){
                throw new UnreachableException();
            }
            return result;
    }
}

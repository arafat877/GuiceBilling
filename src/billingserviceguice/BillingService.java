/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package billingserviceguice;

/**
 *
 * @author juanc
 */
public interface BillingService {
    Receipt chargeOrder(PizzaOrder order, CreditCard creditCard);
    
}

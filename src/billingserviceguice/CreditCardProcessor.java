/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package billingserviceguice;

/**
 *
 * @author juanc
 */
interface CreditCardProcessor {
    
    
    public ChargeResult charge (CreditCard creditCard, int cost)throws UnreachableException;
}

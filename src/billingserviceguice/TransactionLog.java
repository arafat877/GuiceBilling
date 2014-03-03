/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package billingserviceguice;

/**
 *
 * @author juanc
 */
public interface TransactionLog {

    void logChargeResult(ChargeResult result);

    public void logConnectException(UnreachableException e);
    
}

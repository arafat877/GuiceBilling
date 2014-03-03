/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package billingserviceguice;

/**
 *
 * @author juanc
 */
public class DatabaseTransactionLog implements TransactionLog {

    @Override
    public void logChargeResult(ChargeResult result) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void logConnectException(UnreachableException e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package billingserviceguice;

/**
 *
 * @author juanc
 */
class Receipt {
    
    static Receipt forSuccessfulCharge(int amount) {
        Receipt newReceipt = new Receipt();
        return newReceipt;
    }
    
    static Receipt forDeclinedCharge(int amount){
         Receipt newReceipt = new Receipt();
        return newReceipt;
         
    }

    static Receipt forSystemFailure(String message) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
}

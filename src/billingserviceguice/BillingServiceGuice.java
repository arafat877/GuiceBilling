/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package billingserviceguice;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 *
 * @author juanc
 */
public class BillingServiceGuice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BillingModule());
        BillingService billingService = injector.getInstance(BillingService.class);
       
    }
}

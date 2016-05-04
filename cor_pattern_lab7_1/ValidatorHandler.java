package cor_pattern_lab7_1;

import cor_pattern_lab7_1.recordInfo.CallRecord;
import cor_pattern_lab7_1.recordInfo.Customer;

/**
 * Created by 984938 on 5/2/2016.
 */
public class ValidatorHandler extends AHandler {
    @Override
    public void handleRequest(CallRecord req) {
        System.out.println("ValidatorHandler");
        if (req.getCustomer() != null ) {
            Customer customer = req.getCustomer();
            if (customer.getEmail() != null
                    && customer.getPhone() != null
                    && customer.getAddress() != null) {
                req.setValid(true);
            }
        }

        if (req.isValid()) {
            if (this.nextHandler != null) {
                this.nextHandler.handleRequest(req);
            }
        } else {
            //TODO save to a discarded-requests file.
            return;
        }
    }
}

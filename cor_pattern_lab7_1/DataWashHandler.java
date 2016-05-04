package cor_pattern_lab7_1;

import cor_pattern_lab7_1.recordInfo.CallRecord;

/**
 * Created by 984938 on 5/2/2016.
 */
public class DataWashHandler extends AHandler {
    @Override
    public void handleRequest(CallRecord req) {
        System.out.println("DataWashHandler");
        req.setASalesLead(true);
        this.nextHandler.handleRequest(req);
    }
}

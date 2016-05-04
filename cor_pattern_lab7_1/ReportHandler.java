package cor_pattern_lab7_1;

import cor_pattern_lab7_1.recordInfo.CallRecord;

/**
 * Created by 984938 on 5/2/2016.
 */
public class ReportHandler extends AHandler {
    @Override
    public void handleRequest(CallRecord req) {
        System.out.println("ReportHandler");
        System.out.println(req);
    }
}

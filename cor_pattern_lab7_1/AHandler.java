package cor_pattern_lab7_1;

import cor_pattern_lab7_1.recordInfo.CallRecord;

/**
 * Created by 984938 on 5/2/2016.
 */
public abstract class AHandler {
    protected AHandler nextHandler;
    abstract public void handleRequest(CallRecord req);
}

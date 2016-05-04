package cor_pattern_lab7_1;

import cor_pattern_lab7_1.recordInfo.CallRecord;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 984938 on 5/2/2016.
 */
public class Client {
    List<CallRecord> callRecords = new ArrayList<>();

    private ChainBuilder chainBuilder = new ChainBuilder(); //can be injected or received from a constructor

    public void sendRequest(CallRecord request) {
        for (CallRecord c : callRecords) {
            chainBuilder.getHandler().handleRequest(request);
        }
    }
}


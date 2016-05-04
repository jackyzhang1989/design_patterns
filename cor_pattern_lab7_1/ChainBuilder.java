package cor_pattern_lab7_1;

/**
 * Created by 984938 on 5/2/2016.
 */
public class ChainBuilder {
    public ChainBuilder() {
        buildChain();
    }
    private AHandler handler;
    private void buildChain(){
        AHandler validatorHandler = new ValidatorHandler();
        AHandler dataWashHandler = new DataWashHandler();
        AHandler reportHandler = new ReportHandler();
        validatorHandler.nextHandler = dataWashHandler;
        dataWashHandler.nextHandler = reportHandler;
        handler = validatorHandler;
    }

    public AHandler getHandler() {
        return handler;
    }
}

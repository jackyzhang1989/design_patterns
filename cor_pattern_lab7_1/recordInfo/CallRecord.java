package cor_pattern_lab7_1.recordInfo;

/**
 * Created by 984938 on 5/2/2016.
 */
public class CallRecord {
    private Customer customer;
    private Agent agent;
    private String requestInformation;
    private boolean isValid = false;
    private boolean isASalesLead = false;
    @Override
    public String toString() {
        return "customer = [" + customer + "]" +
                "agent = [" + agent + "]" +
                "requestInformation = [" + requestInformation + "]" +
                "isValid = [" + isValid + "]" +
                "isASalesLead = [" + isASalesLead + "]";
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public String getRequestInformation() {
        return requestInformation;
    }

    public void setRequestInformation(String requestInformation) {
        this.requestInformation = requestInformation;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public boolean isASalesLead() {
        return isASalesLead;
    }

    public void setASalesLead(boolean ASalesLead) {
        isASalesLead = ASalesLead;
    }
}


package builder_pattern_lab10_1;

public class Request {
	private String name;
	
	public Request(String name) {
		super();
		this.name = name;
	}
	private String reqId;
	private Customer requester;
	private Agent agent;
	private String reqContent;
	private String respContent;
	private boolean isAnswered;
	private boolean isSaleLead;
	private boolean needCallBack;

	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
	public void setRequester(Customer requester) {
		this.requester = requester;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	public void setReqContent(String reqContent) {
		this.reqContent = reqContent;
	}
	public void setRespContent(String respContent) {
		this.respContent = respContent;
	}
	public void setAnswered(boolean isAnswered) {
		this.isAnswered = isAnswered;
	}
	public void setSaleLead(boolean isSaleLead) {
		this.isSaleLead = isSaleLead;
	}
	public void setNeedCallBack(boolean needCallBack) {
		this.needCallBack = needCallBack;
	}
	
}

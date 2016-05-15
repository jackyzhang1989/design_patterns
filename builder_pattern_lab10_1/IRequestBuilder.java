package builder_pattern_lab10_1;

public interface IRequestBuilder {
	public default boolean customerExists(String no){
		return false;
	}
	
	public void buildCallInfo(Call call);

	public void buildCustomer(String No);

	public void buildReqContent(String reqContent);
	
	public void buildRespContent(String respContent);
	
	public void buildStatu();
//	private boolean isAnswered;
//	private boolean isSaleLead;
//	private boolean needCallBack;
	
//	1. When a call is connected, the request id and agent information becomes available.
//	2. The agent will ask for the caller's phone number to retrieve the caller's information from
//	the database (or if it is a new customer, agent will create user profile)
//	3. Agent will get/collect what the caller is requesting during the call (as request content)
//	4. Agent will answer the questions for the request (as response content)
//	5. Agent will set 'isAnswered' and 'needCallback' accordingly and close the call (saving all
//	information in the database)

	public Request getRequest();
}

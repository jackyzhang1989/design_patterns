package builder_pattern_lab10_1;

public class RequestDirector {
	private IRequestBuilder requestBuilder = null; // or multiple builders

	public RequestDirector(IRequestBuilder requestBuilder) {
		this.requestBuilder = requestBuilder;
	}

	public void constructRequest() {
		Call call = new Call();
		call.callPop(new Agent("Alice"));
		requestBuilder.buildCallInfo(call);
		requestBuilder.buildCustomer("1234567");
		requestBuilder.buildReqContent("content of request");
		requestBuilder.buildRespContent("solved");
		requestBuilder.buildStatu();
	}

	public Request getRequest() {
		return requestBuilder.getRequest();
	}
}

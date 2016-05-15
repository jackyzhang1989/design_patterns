package builder_pattern_lab10_1;

public class CallCenterRequestBuilder implements IRequestBuilder{
	private Request request;
	
	public CallCenterRequestBuilder() {
		this.request = new Request("CallCenterRequest");
	}

	@Override
	public void buildCallInfo(Call call) {
		request.setReqId(call.getRequestId());
		request.setAgent(call.getAgent());
	}

	@Override
	public void buildCustomer(String No) {
		Customer customer = null;
		if (!customerExists(No)) {
			customer = new Customer("name", "123");
		} else {
			//TODO get from DB
		}
		request.setRequester(customer);
	}

	@Override
	public void buildReqContent(String reqContent) {
		request.setReqContent(reqContent);
	}

	@Override
	public void buildRespContent(String respContent) {
		request.setRespContent(respContent);
	}

	@Override
	public void buildStatu() {
		request.setSaleLead(false);
		request.setAnswered(true);
		request.setNeedCallBack(false);
	}

	@Override
	public Request getRequest() {
		return request;
	}
}

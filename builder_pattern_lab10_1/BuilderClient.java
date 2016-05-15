package builder_pattern_lab10_1;

public class BuilderClient {
	public static void main(String[] args) {
		RequestDirector rd = new RequestDirector(new CallCenterRequestBuilder());
		rd.constructRequest();
		Request request = rd.getRequest();
		System.out.println(request);
	}
}

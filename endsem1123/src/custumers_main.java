import java.util.ArrayList;
import java.util.List;


public class custumers_main implements Employee{
	String memberType;
	List<String> task = new ArrayList<String>();
	@Override
	public void init() {
		// TODO Auto-generated method stub
		this.memberType = "Customer";
	}

}

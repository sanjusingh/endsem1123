import java.util.ArrayList;
import java.util.List;


public class ScrumMaster implements Employee{

	String memberType;
	List<String> task = new ArrayList<String>();
	@Override
	public void init() {
		// TODO Auto-generated method stub
		this.memberType="ScrumMaster";
	}

}

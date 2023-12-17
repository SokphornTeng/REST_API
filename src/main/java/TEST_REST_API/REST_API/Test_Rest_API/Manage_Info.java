package TEST_REST_API.REST_API.Test_Rest_API;

import java.util.ArrayList;
import java.util.List;

public class Manage_Info {

	private List<Class_Info> namage;

	public List<Class_Info> getNamage() {
		if(namage == null) {
			namage = new ArrayList<Class_Info>();
		}
		return namage;
	}

	public void setNamage(List<Class_Info> namage) {
		this.namage = namage;
	}
	
}

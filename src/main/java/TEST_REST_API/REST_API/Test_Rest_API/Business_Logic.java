package TEST_REST_API.REST_API.Test_Rest_API;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class Business_Logic {

	private static Manage_Info info = new Manage_Info();
	
	static {
		info.getNamage().add(new Class_Info(1, "Sokphorn", 25, "sokphorn.teng@gmail.com"));
		info.getNamage().add(new Class_Info(2, "Vuthe", 19, "vuthe.teng@gmail.com"));
		info.getNamage().add(new Class_Info(3, "Tida", 20, "Tida.teng@gmail.com"));
		info.getNamage().add(new Class_Info(4, "Tola", 29, "Tola.teng@gmail.com"));
		info.getNamage().add(new Class_Info(5, "Soklin", 30, "Soklin.teng@gmail.com"));
		info.getNamage().add(new Class_Info(6, "Bunneth", 23, "Bunneth.teng@gmail.com"));
		info.getNamage().add(new Class_Info(7, "Navong", 28, "vuthe.teng@gmail.com"));
	}
	
	public Manage_Info listInfo() {
		return info;
	}
	
	public void business(Class_Info bookInfo) {
		info.getNamage().add(bookInfo);
	}
}

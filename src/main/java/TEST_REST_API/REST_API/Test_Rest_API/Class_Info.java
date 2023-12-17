package TEST_REST_API.REST_API.Test_Rest_API;

public class Class_Info {

	private int id;
	private String name;
	private int age;
	private String eamil;
	
	public Class_Info(int id, String name, int age, String eamil) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.eamil = eamil;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEamil() {
		return eamil;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
	
	
}

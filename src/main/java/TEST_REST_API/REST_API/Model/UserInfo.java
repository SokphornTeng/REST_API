package TEST_REST_API.REST_API.Model;

public class UserInfo {

	private Integer id;
	private String name;
	private Integer age;
	private String email;
	private String job;
	
	public UserInfo(Integer id, String name, Integer age, String email, String job) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.job = job;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
}
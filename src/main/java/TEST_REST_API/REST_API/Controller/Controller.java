package TEST_REST_API.REST_API.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TEST_REST_API.REST_API.Model.UserInfo;

@RestController
@RequestMapping("/api")
public class Controller {

	private static final Integer Integer = null;
	private static final String String = null;
	// Create object with List
	List<UserInfo> info = new ArrayList<>();
	
	public Controller() {
		info = List.of(
				new UserInfo(1, "Sokphorn1", 24, "sokphorn1.teng@gmail.com", "bank"),
				new UserInfo(2, "Sokphorn2", 25, "sokphorn2.teng@gmail.com", "bank"),
				new UserInfo(3, "Sokphorn3", 26, "sokphorn3.teng@gmail.com", "bank"),
				new UserInfo(4, "Sokphorn4", 27, "sokphorn4.teng@gmail.com", "bank"),
				new UserInfo(5, "Sokphorn5", 28, "sokphorn5.teng@gmail.com", "bank"),
				new UserInfo(6, "Sokphorn6", 29, "sokphorn6.teng@gmail.com", "bank"),
				new UserInfo(7, "Sokphorn7", 30, "sokphorn7.teng@gmail.com", "bank"),
				new UserInfo(8, "Sokphorn8", 31, "sokphorn8.teng@gmail.com", "bank")
				);
	}
	
	@GetMapping("/list")
	public List<UserInfo> listInfo(){
		return info;
	}
	
	// Find id with param of id  
	@GetMapping("/show")
	public UserInfo findById(Integer id) {
		for(Integer i = 0; i < info.size(); i++) {
		   if(info.get(i).getId() == (id)) {
			   return info.get(i);
		   }
		}
		return null;
	}
	
	//Search by param name
	@GetMapping("/search")
	public List<UserInfo> search(String name) {
		return info.stream().filter(x ->x.getName().toLowerCase().startsWith(name)).collect(Collectors.toList());
	}
	
	@DeleteMapping
	public String  delete(Integer id) {
		if(info.removeIf(x->x.getId()==id)) {
			return "Already delete";
		}
		 
		 return null;
	}
	
	public UserInfo update(UserInfo listInfo) {
		int a = 0;
		int id = 0;
		for(Integer i=0; i<info.size(); i++) {
			if(info.get(i).getId() == listInfo.getId()) {
				id = listInfo.getId();
				a = i;
				break;
			}
		}
		UserInfo info1 = new UserInfo();
		info1.setId(id);
		info1.setName(listInfo.getName());
		info1.setAge(listInfo.getAge());
		info1.setEmail(listInfo.getEmail());
		info1.setJob(listInfo.getJob());
		info.set(id, info1);
		return info1;
	}
}

package TEST_REST_API.REST_API.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TEST_REST_API.REST_API.Model.UserInfo;

@RestController
@RequestMapping("/api")
public class Controller {
  
  //test create object static with Map
//  private static Map<String, UserInfo> information = new HashMap<String, UserInfo>();
//	 static {
//		information.put("1", new UserInfo(12, "Sokphorn1", 24, "sokphorn1.teng@gmail.com", "bank"));
//		information.put("11", new UserInfo(13, "Sokphorn1", 24, "sokphorn1.teng@gmail.com", "bank"));
//		information.put("12", new UserInfo(14, "Sokphorn1", 24, "sokphorn1.teng@gmail.com", "bank"));
//		information.put("14", new UserInfo(16, "Sokphorn1", 24, "sokphorn1.teng@gmail.com", "bank"));
//		information.put("13", new UserInfo(18, "Sokphorn1", 24, "sokphorn1.teng@gmail.com", "bank"));
//	}
	
	
	
// List Object with create static of Map
//	private static Map<String, UserInfo> information = new HashMap<String, UserInfo>();
//	
//	static {
//		UserInfo newInfo = new UserInfo();
//		newInfo.setName("Sokphorn");
//		newInfo.setAge(22);
//		newInfo.setJob("bank");
//		newInfo.setEmail("sokphorn.teng@gmail.com");
//		newInfo.setId("01");
//		information.put(newInfo.getId(), newInfo);
//		
//		UserInfo newList = new UserInfo();
//		newList.setName("Vuthe");
//		newList.setAge(19);
//		newList.setJob("student");
//		newList.setEmail("Vuthe.teng@gmail.com");
//		newList.setId("03");
//		information.put(newList.getId(), newList);
//	}
//	
//	@RequestMapping("/user")
//	public ResponseEntity<Object> getUserInfo(){
//		return new ResponseEntity<Object>(information.values(), HttpStatus.OK);
//	}
	
	private static Map<String, UserInfo> information = new HashMap<String, UserInfo>();
	
	@PostMapping("/add")
	public ResponseEntity<Object> createInfo(@RequestBody UserInfo infoU){
		information.put(infoU.getId(), infoU);
		return new ResponseEntity<Object>("create successfull", HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Object> update(@PathVariable("id") String id, @RequestBody UserInfo myList){
		information.remove(id);
		myList.setId(id);
		information.put(id, myList);
		return new ResponseEntity<Object>("update success", HttpStatus.OK);
	}
	
	@DeleteMapping("/deletes/{id}")
	public ResponseEntity<Object> delete(@PathVariable("id") String id){
		information.remove(id);
		return new ResponseEntity<Object>("delete success", HttpStatus.OK);
	}
}

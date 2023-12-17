package TEST_REST_API.REST_API.Test_Rest_API;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/api/rest")
public class Business_Controller {

	private final Business_Logic logic;
    @Autowired
	public Business_Controller(Business_Logic logic) {
		super();
		this.logic = logic;
	}
	@GetMapping
    public Manage_Info listing(){
		return this.logic.listInfo();
	}
	@PostMapping(consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> createInfo(@RequestBody Class_Info myInfo){
		
		Integer id = this.logic.listInfo()
				               .getNamage()
				               .size() + 1;
				    
		logic.business(myInfo);
		
//		System.out.print("This is sokphorn test"+ myInfo.getId());
//		return ResponseEntity.ok(myInfo.getId() + myInfo.getName() + myInfo.getAge() + myInfo.getEamil());
//		return ResponseEntity.ok(myInfo);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				                                  .path("/{id}")
				                                  .buildAndExpand(myInfo.getId())
				                                  .toUri();
		return ResponseEntity.created(location).build();
	}
}

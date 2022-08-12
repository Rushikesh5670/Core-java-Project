package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserList {
	
	UserInformation user1 = new UserInformation("Adarsh", 12345, 1234);
	UserInformation user2 = new UserInformation("Rushikesh", 26458, 5670);
	UserInformation user3 = new UserInformation("Ashish", 42858, 2547);
	UserInformation user4 = new UserInformation("Rutwik", 75827, 8364);

//	public Map<Integer, Integer> getListOfUsers() {
//			
//		Map<Integer, Integer> user = new HashMap<Integer, Integer>();
//		
//		user.put(user1.getAtm_number(), user1.getAtm_pin());
//		user.put(user2.getAtm_number(), user2.getAtm_pin());
//		user.put(user3.getAtm_number(), user3.getAtm_pin());
//		user.put(user4.getAtm_number(), user4.getAtm_pin());
//		return user;
//
//	}
	
	public List<UserInformation> getListOfUsers() {
		
		List<UserInformation> user = new ArrayList<UserInformation>();
		user.add(user1);
		user.add(user2);
		user.add(user3);
		user.add(user4);
		return user;
	}

}

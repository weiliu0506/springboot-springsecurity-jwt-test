package com.v;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/users")
	public Object getUsers() {
		List<Map<String, String>> users = new ArrayList<>();
		Map<String, String> user = new HashMap<>();
		user.put("firstname", "abc");
		user.put("lastname", "123");
		users.add(user);
		return users;
	}
}

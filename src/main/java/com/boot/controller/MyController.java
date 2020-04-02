package com.boot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.config.PropertiesConfig;
import com.boot.model.Account;
import com.boot.model.Example;


@RestController
public class MyController {

	@Autowired
	Environment env;

	@Value("#{${myMap}}")
	private HashMap<String, String> myMapUsingValue;

	@GetMapping("/hello")
	public String hello() throws Exception {
		System.out.println("myMapUsingValue : " + myMapUsingValue);

		/*String myRawMap = env.getProperty("myMap");
		myRawMap = myRawMap.substring(1, myRawMap.length() - 1);
		System.out.println("After removal: " + myRawMap);
		String[] keyValuePairs = myRawMap.split(",");
		Map<String, String> myMap = new HashMap();
		for (String pair : keyValuePairs) {
			String[] entry = pair.split(":");
			myMap.put(entry[0].trim(), entry[1].trim());
		}
		System.out.println("myMap : " + myMap);*/

		if(true)
		{
			throw new Exception("Manual Exception...");
		}
		
		return "Hello World";
	}
	
	@Autowired
	PropertiesConfig propConfig;
	
	@PostMapping("/courseDetails")
	public Example getCourseDetails(@RequestBody Example example) {
		String courseDetails = propConfig.getName() +" ----- "+ propConfig.getRating();
		
		Account acc1 = new Account();
		acc1.getBalance().setAmount(20.00);
		Account acc2 = new Account();
		acc1.getBalance().setAmount(30.00);
		Account acc3 = new Account();
		acc1.getBalance().setAmount(40.00);
		List<Account> myAccounts = new ArrayList<Account>();
		myAccounts.add(acc1);
		myAccounts.add(acc2);
		myAccounts.add(acc3);
		
		Example ex = new Example();
		ex.setAccount(myAccounts);
		return ex;
	}
	
	/*@GetMapping("/hello")
	public String hello(@RequestBody AddressSchema address) {
		return "Hello World";
	}*/
}

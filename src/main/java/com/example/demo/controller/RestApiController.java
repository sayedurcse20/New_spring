package com.example.demo.controller;

import org.json.JSONArray;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class RestApiController {
	@CrossOrigin(origins = {"http://localhost:4200"})
	
	//@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
		@RequestMapping(value="/data", method = RequestMethod.GET, produces="application/json" )
		public String getHome() {
			JSONArray arr= new JSONArray();
			JSONObject obj = new JSONObject();
			obj.put("id", 2);
			obj.put("name","sayedur");
			arr.put(obj);
			return arr.toString();
			
		}
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
		@RequestMapping(value="/insert", method = RequestMethod.POST )
		public String insertData(@RequestBody String s) {
			System.out.println("name is : "+s);
			return "insert success";
			
		}
	
}

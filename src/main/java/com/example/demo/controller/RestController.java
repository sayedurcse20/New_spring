package com.example.demo.controller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@RequestMapping(value="/data",method=RequestMethod.GET,produces="application/json")
	public String getHome(){
		JSONArray arra=new JSONArray();
		JSONObject obj=new JSONObject();
		obj.put("id", 2);
		obj.put("name", "saidur");
		arra.put(obj);
		JSONObject obj1=new JSONObject();
		obj1.put("id", 3);
		obj1.put("name", "faruk");
		arra.put(obj1);
		
		return arra.toString();
	}
}

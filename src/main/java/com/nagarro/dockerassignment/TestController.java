package com.nagarro.dockerassignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@ResponseBody
	@RequestMapping("/index")
	public Map<String , Object> getValues() {
		Map<String , Object> values=new HashMap<String, Object>();
		values.put("msg","api is working fine" );
		values.put("language",Arrays.asList("Java", "python", "angular") );
		values.put("code",1176 );
		return values;
		
}
}
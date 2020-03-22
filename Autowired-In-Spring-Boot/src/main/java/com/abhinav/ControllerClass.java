package com.abhinav;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@Qualifier("C")
	@Autowired
	Vehicle vehicle;
	
	@GetMapping(value = "/action")
	public void controllerMethod(HttpServletResponse response) throws IOException{
		
		vehicle.drive();
		
		PrintWriter out = response.getWriter(); 
		out.println("Autowired Executed");
		 
		System.out.println("Autowired Executed");
	}

}

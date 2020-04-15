package services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	public String hello(String name){
		String text = "Hello, " + name +"!";
		System.out.println(text);
//		throw new RuntimeException("Booo!");
		return text;
	}
}

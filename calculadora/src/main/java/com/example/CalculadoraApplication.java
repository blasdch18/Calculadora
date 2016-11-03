package com.example;

import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@SpringBootApplication
public class CalculadoraApplication {
	@RequestMapping("/")
    @ResponseBody
	String home() {
        return "Hello World! " + new Date();
	}
	@RequestMapping("/calc")
	@ResponseBody
	String calc(@RequestParam String a , @RequestParam String b , @RequestParam String op)
	{
		Integer calc1=null;
		Integer a1 = Integer.valueOf(a);
		Integer b1 = Integer.valueOf(b);
		//System.out.print("El resultado es : ");
		switch(op)
		{
			case "+":
				calc1=a1+b1;
				break;
			case "-":
				calc1=a1-b1;
				break;
			case "*":
				calc1=a1*b1;
				break;
			case "/":
				calc1=a1/b1;
				break;
		}
		String resultado=String.valueOf(calc1);
		return resultado;
	}

	public static void main(String[] args) throws Exception{
		SpringApplication.run(CalculadoraApplication.class, args);
	}
}

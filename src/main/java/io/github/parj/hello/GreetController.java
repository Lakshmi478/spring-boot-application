package io.github.parj.hello;

import java.util.Arrays;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping("/greet/{name}")
	public String greet(@PathVariable("name") String name) {
		return "Welcome to Spring Boot " + name + " and time is : " + new Date();
	}

	@GetMapping("/add")
	public String add(@RequestParam("number1") int number1, @RequestParam("number22") int number2) {
		return String.valueOf(number1 + number2);
	}

	@PostMapping("/add")
	public String add(@RequestBody Addition addition) {
		return String.valueOf(addition.getNumberOne() + addition.getNumberTwo());
	}

	@GetMapping("/add/{number1}/{number2}")
	public String addition(@PathVariable("number1") int number1, @PathVariable("number2") int number2) {
		int result = number1 + number2;
		return " Addition of " + number1 + " and " + number2 + " is " + result;
	}

	@GetMapping("/reverse/{number}")
	public String reverse(@PathVariable("number") int number) {
		int rev = 0;
		int rem = 0;
		int temp = number;
		while (number != 0) {
			rem = number % 10;
			number = number / 10;
			rev = rev * 10 + rem;
		}
		return "  Reverse of " + temp + " is " + rev;
	}

	@GetMapping("/sortedstring/{name}")
	public String sortedstring(@PathVariable("name") String name) {
		String str = name;
		char ch[] = str.toCharArray();
		Arrays.sort(ch);
		String newstr = new String(ch);
		return "  The sortedstring  of  " + name + " is " + newstr;

	}

	@GetMapping("/reversestring/{name}")
	public String reversestring(@PathVariable("name") String name) {
		String str = name;
		String rev = " ";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return "  The Reverse of the Given String  " + name + " is " + rev;

	}

	@GetMapping("/palindromenumber/{number}")
	public String palindromenumber(@PathVariable("number") int number) {
		int temp = number;
		int reverse = 0;
		int remainder = 0;
		while (number != 0) {
			remainder = number % 10;
			number = number / 10;
			reverse = reverse * 10 + remainder;
		}
		if (temp == reverse)
			return " The Given Number is " + temp + " and  its a palindrome number " + reverse;
		else
			return " The Given Number is " + temp + " and its not a palindrome number " + reverse;
	}
}

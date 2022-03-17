package com.learning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "com.learning" })
@EnableJpaRepositories({ "com.learning.dao" })
@EntityScan({ "com.learning.dao" })
public class DemoLearningApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoLearningApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//
//		String item = "Welcome to life of majo nice to meet you";
//		System.out.println("is Plaindrome - " + isPalindrome("sdfsdfsdf"));
//		System.out.println(Stream.of(item.split(" ")).collect(Collectors.groupingBy(i -> i, Collectors.counting())));

//		FInterface item = (a, b) -> a * b;
//		System.out.println(item.mulitply(2, 18));
	}

//	static boolean checkPrime(int n) {
//		return n > 1 && IntStream.range(2, n).peek(System.out::print).noneMatch(i -> n % i == 0);
//	}
//
//	static boolean isPalindrome(String s) {
//		int i = 0, j = s.length() - 1;
//
//		while (i <= j) {
//			if (s.charAt(i) != s.charAt(j)) {
//				return false;
//			}
//			i++;
//			j--;
//		}
//
//		return true;
//	}

}

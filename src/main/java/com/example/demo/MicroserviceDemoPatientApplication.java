package com.example.demo;

import com.sun.el.parser.ParseException;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.NumberFormat;
import java.util.stream.Stream;

@SpringBootApplication
public class MicroserviceDemoPatientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDemoPatientApplication.class, args);
	}



}

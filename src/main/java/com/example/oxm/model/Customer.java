package com.example.oxm.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString @AllArgsConstructor @EqualsAndHashCode
public class Customer {
	
	String name;
	int age;
	boolean flag;
	String address;

}

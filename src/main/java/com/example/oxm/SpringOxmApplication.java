package com.example.oxm;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.oxm.core.XMLConverter;
import com.example.oxm.model.Customer;

@SpringBootApplication
public class SpringOxmApplication {
	
	private static final String XML_FILE_NAME = "customer.xml";

	public static void main(String[] args) throws IOException {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("App.xml");
		XMLConverter converter = (XMLConverter) appContext.getBean("XMLConverter");
		
		Customer customer = new Customer();
		customer.setName("João Silva");
		customer.setAge(23);
		customer.setFlag(true);
		customer.setAddress("São Paulo");
		
		System.out.println("Convert Object to XML!");
		//from object to XML file
		converter.convertFromObjectToXML(customer, XML_FILE_NAME);
		System.out.println("Done \n");
		
		System.out.println("Convert XML back to Object!");
		//from XML to object
		Customer customer2 = (Customer)converter.convertFromXMLToObject(XML_FILE_NAME);
		System.out.println(customer2);
		System.out.println("Done");
	}

}

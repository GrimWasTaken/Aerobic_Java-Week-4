package com.example.jaxb.create;

import java.io.*;
import java.util.*;

import javax.xml.bind.*;

import com.example.dataprovider.DataProvider;
import com.example.jaxb.model.Customer;
import com.example.jaxb.model.Customers;

public class CreateXMLWithJAXB {

	public static void main(String[] args) throws IOException {

		List<Customer> data = DataProvider.getData(DataProvider.SMALL);
		
		Customers customers = new Customers();
		customers.setCustomers(data);
		
		try {
			JAXBContext context = JAXBContext.newInstance(Customers.class);
			Marshaller sheriff = context.createMarshaller();
			sheriff.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter sw = new StringWriter();
			sheriff.marshal(customers, sw);
			
			System.out.println(sw.toString());
			
			//File f = new File("./output/cheeseburger.xml");
			//sheriff.marshal(customers, f);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

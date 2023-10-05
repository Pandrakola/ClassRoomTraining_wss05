package readData;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;



public class Reading {

	


	public static void main(String[] args) throws IOException {
		
        //step 1: create file in put stream obj
		FileInputStream fis=new FileInputStream("C:\\Users\\mtech\\Music\\config.properties.txt");
		//step 2: create file obj
		Properties pro=new Properties();
		//step 3: call read method
		pro.load(fis);
		System.out.println("Ide used is: "+pro.get("IDE"));
		System.out.println("Java use :"+pro.get("Java"));
	
		System.out.println("Selenium used :"+pro.get("Selenium"));
		System.out.println(pro.get("Testing"));
	}

}

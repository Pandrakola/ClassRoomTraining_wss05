package readData;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



import org.testng.annotations.Test;

public class ReadDataFromPropertyFile {
	@Test
	public void getData() throws IOException {
		//FileInputStream fis=new FileInputStream("C:\\Users\mtech\eclipse-workspace\selenium\resource\\testData.properies");
		FileInputStream fis = new FileInputStream("./resource/testData.properies");
		//create file obj
	
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.get("name"));
		System.out.println(prop.get("Batch"));
	}
	
	

}

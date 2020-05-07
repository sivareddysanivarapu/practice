
package practice; 
import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import java.util.Properties;



public class DatafromPropertyfile {



public static void main(String[] args) throws IOException {

// TODO Auto-generated method stub



Properties prop=new Properties();

FileInputStream fis =new FileInputStream("C:\\Users\\Welcome\\Desktop\\practice\\practice\\data.properties");

prop.load(fis);

System.out.println(prop.getProperty("browser"));

System.out.println(prop.getProperty("url"));

prop.setProperty("browser", "firefox");//it updates the browser name

System.out.println(prop.getProperty("browser"));

FileOutputStream fos =new FileOutputStream("C:\\Users\\Welcome\\Desktop\\practice\\practice\\data.properties");

prop.store(fos, null);

}



}
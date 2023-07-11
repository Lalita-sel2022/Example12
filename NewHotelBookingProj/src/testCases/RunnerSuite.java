package testCases;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class RunnerSuite 
{
	public static <XmlClass> void main(String[] args)
	{
		
    TestNG testng= new TestNG();
    XmlSuite suite= new XmlSuite();
    suite.setName("My Suite");
    List<XmlSuite> allsuite= new ArrayList<XmlSuite>();
    allsuite.add(suite);
    
    XmlTest test= new XmlTest(suite);
    test.setName("My Test");
    
    List<XmlClass> clas= new ArrayList<XmlClass>();
    clas.add((XmlClass) new org.testng.xml.XmlClass("testCases.Login"));
    test.setXmlClasses((List<org.testng.xml.XmlClass>) clas);
    
    
    
    
    
    
    
    
    
    
	testng.run();
	
	
	}
}

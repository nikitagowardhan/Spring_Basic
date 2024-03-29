 
 import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

import model.Student;  
  
public class Test {  
public static void main(String[] args) { 
	
	//Resource resourse= new ClassPathResource("applicationContext.xml");
	//BeanFactory factory = new XmlBeanFactory(resourse);
	
	ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
	Student student= (Student) c.getBean("student");
	//Student student2= (Student) c.getBean("student");


	student.setName("nikita");
	System.out.println(student.getName());
	System.out.println(student);
	//System.out.println(student2);
	
	//student2.displayInfo();
	student.displayInfo();
	  
}  
}  
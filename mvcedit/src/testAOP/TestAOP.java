package testAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext ("bean.xml");
		Single single = (Single)context.getBean("proxy");
		single.write();
		single.writeB();

	}

}

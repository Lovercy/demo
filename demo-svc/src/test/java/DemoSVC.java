import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoSVC {
	
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("demo-context.xml");
		System.out.println("服务提供方启动完成");
		System.in.read();
	}
}

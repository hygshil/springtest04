package springzuoyeaop01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvTest {
    @Test
    public void test01(){
        String xml="springzuoyeaop01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        TvService tvService = ac.getBean("tvService", TvService.class);
        tvService.start();
        System.out.println("====================");
        tvService.stop();
        System.out.println("====================");
        tvService.zhuanMoney();
        System.out.println("====================");
        tvService.findNo();

    }
}

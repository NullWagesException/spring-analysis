package priv.zhengfa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import priv.zhengfa.service.UserService;
import priv.zhengfa.service.impl.UserServiceImpl;

/**
 * @Author: nullWagesException
 * @Date: 2020-08-11 22:25
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
        UserService user = (UserService) context.getBean("user");
        user.say();
    }

}

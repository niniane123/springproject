package bean;

import org.junit.Test;
import springframework.BeanDefinition;
import springframework.BeanFactory;

public class UserService {

    public void queryUserInfo(){
        System.out.println("查询用户信息");
    }


    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory  增
        BeanFactory beanFactory = new BeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
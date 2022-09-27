package springframework;

/*
    BeanDefinition，用于定义 Bean 实例化信息，现在的实现是以一个 Object 存放对象
*/
public class BeanDefinition {

    private Object bean;
    //1.增
    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    //2.查
    public Object getBean() {
        return bean;
    }

}
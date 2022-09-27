package springframework;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Spring Bean 容器的整个实现内容非常简单，也仅仅是包括了一个简单的 BeanFactory 和 BeanDefinition，这里的类名称是与 Spring 源码中一致，
 * 只不过现在的类实现会相对来说更简化一些，在后续的实现过程中再不断的添加内容
 * <p>
 * BeanFactory，代表了 Bean 对象的工厂，可以存放 Bean 定义到 Map 中以及获取。
 *
 *
 *
 *  在 Bean 工厂的实现中，包括了 Bean 的注册，这里注册的是 Bean 的定义信息。同时在这个类中还包括了获取 Bean 的操作。
 * 目前的 BeanFactory 仍然是非常简化的实现，
 * 但这种简化的实现内容也是整个 Spring 容器中关于 Bean 使用的最终体现结果，只不过实现过程只展示出基本的核心原理。在后续的补充实现中，这个会不断变得庞大。h
 */
public class BeanFactory {

    //依赖于BeanDefinition
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    //通过对象之间的组合关可以完成整个程序的调用链 ？这是我目前关注的主要东西
    //程序的运行过程落地在于对属性的增删改查
    //1.BeanDefinition和Bean的查找
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    //2.对BeanDefinition的增加元素；
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
# spring Bean装配方式：

1. ## 隐式的bean发现机制和自动化装配

   组件扫描(@ComponentScan)：Spring会自动发现应用上下文中所创建的bean

   自动装配（@Autowired） ： Spring自动满足bean之间的依赖

   实现示例：ImplicitConfiguration

2. ## 基于Java的显示配置

   配置规范（@Configuration注解的配置类）该类应该包含在Spring应用上下文中如何创建bean的细节

   @Bean注解会告诉Spring这个方法将会返回一个对象， 该对象要注册为Spring应用上下文中的bean

   自动装配（@Autowired） ： Spring自动满足bean之间的依赖

   实现示例：JavaConfiguration

3. ## 基于XML的显式配置 

   配置规范（XML配置规范）：声明一个bean

   实现示例：XmlConfiguration
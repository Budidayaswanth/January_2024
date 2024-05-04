package org.java.spring_jdbc.SimpleJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.java.spring_jdbc.SimpleJdbc")
public class ManagerForDao {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext(ManagerForDao.class);
        ProductDao productDao =context.getBean(ProductDao.class);
        productDao.showProducts();
        productDao.showProductCount();
    }
}

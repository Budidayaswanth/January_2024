package org.java.spring_jdbc.SimpleJdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
@Configuration
public class AppConfig {
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource obj =new DriverManagerDataSource();
        obj.setDriverClassName("com.mysql.cj.jdbc.Driver");
        obj.setUrl("jdbc:mysql://localhost:3306/yash_db?allowPublicKeyRetrieval=true&useSSL=false");
        obj.setUsername("dbyash");
        obj.setPassword("dbyash");
        return obj;
    }
@Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }
}

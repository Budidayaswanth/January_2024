package org.java.spring_jdbc.cbook;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
@Configuration
public class AppConfig {
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource =new DriverManagerDataSource();
        dataSource.setDriverClassName("com.java.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/yash_db?allowPublicKeyRetrieval=true&useSSL=false");
        dataSource.setUsername("dbyash");
        dataSource.setPassword("dbyash");
        return dataSource;
    }
@Bean
    public JdbcTemplate jdbcTemplate(){
      return  new  JdbcTemplate(getDataSource());
    }
    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(){
     return new NamedParameterJdbcTemplate(getDataSource());
    }
}

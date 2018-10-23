package com.niit.Configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;	
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import niit.model.Product;

@Configuration
@ComponentScan(basePackages={"com.niit.*","niit.model"})
public class DBconfiguration {
public DBconfiguration() {
	System.out.println("DBConfiguration bean is created");
}
@Bean(name="dataource")
public DataSource getDataSource() {
	System.out.println("Entering DataSource Bean creation method ");
	BasicDataSource dataSource = new BasicDataSource();
	dataSource.setDriverClassName("org.h2.Driver");
	dataSource.setUrl("jdbc:h2:tcp://localhost/~/test2");
	dataSource.setUsername("sa");
	dataSource.setPassword("sa");
	System.out.println("DataSource bean " +dataSource);
	return dataSource;
}

@Transactional
@Bean
public SessionFactory sessionFactory() {
	System.out.println("Entering sessionFactory creation method");
	LocalSessionFactoryBuilder Isf=new LocalSessionFactoryBuilder(getDataSource() );
    Properties hibernateProperties=new Properties() ;
    hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
	// hibernateProperties.setProperty("hibernate.show-sql", "true");
    Isf.addProperties(hibernateProperties);
    Class classes[]=new Class[]{Product.class};
    
    System.out.println("SessionFactory bean " + Isf);
    
    return Isf.addAnnotatedClasses(classes).buildSessionFactory();
}

@Transactional
@Bean
public HibernateTransactionManager hibernateTransactionManager() {
	System.out.println("hibernatemanager");
	return new HibernateTransactionManager(sessionFactory());
}

}
	
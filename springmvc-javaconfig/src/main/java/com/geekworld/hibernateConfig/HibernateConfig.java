package com.geekworld.hibernateConfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@Configuration
@EnableTransactionManagement
@PropertySource({ "classpath:persistence-mysql.properties" })
@ComponentScan({ "com.geekworld.*" })
public class HibernateConfig {
	

	   @Autowired
	   private Environment env;
	 
	   @Bean
	   public LocalSessionFactoryBean sessionFactory() {
	      LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	      sessionFactory.setDataSource(restDataSource());
	      sessionFactory.setPackagesToScan(
	        new String[] { "com.geekworld.models" });
	      sessionFactory.setHibernateProperties(hibernateProperties());
	 
	      return sessionFactory;
	   }
	 
	   @Bean
	   public DataSource restDataSource() {
	      DriverManagerDataSource dataSource = new DriverManagerDataSource();
	      dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
	      dataSource.setUrl(env.getProperty("jdbc.url"));
	      dataSource.setUsername(env.getProperty("jdbc.user"));
	      dataSource.setPassword(env.getProperty("jdbc.pass"));
	 
	      return dataSource;
	   }
	   
	   @Bean
	   @Autowired
	   public HibernateTransactionManager transactionManager(
	     SessionFactory sessionFactory) {
	  
	      HibernateTransactionManager txManager
	       = new HibernateTransactionManager();
	      txManager.setSessionFactory(sessionFactory);
	 
	      return txManager;
	   }
	 
	   @Bean
	   public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
	      return new PersistenceExceptionTranslationPostProcessor();
	   }
	 
	   @Bean
	   Properties hibernateProperties() {
	      return new Properties() {
	         {
	            setProperty("hibernate.hbm2ddl.auto",
	              env.getProperty("hibernate.hbm2ddl.auto"));
	            setProperty("hibernate.dialect",
	              env.getProperty("hibernate.dialect"));
	            setProperty("hibernate.globally_quoted_identifiers",
	             "true");
	         }
	      };
	   }

}

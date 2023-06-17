package org.spring6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("dbConfig.properties")
public class PrintProperties {
	@Value("${db.driverClassName}")
	private String driverClassName;
	@Value("${db.url}")
	private String dburl;
	@Value("${db.username}")
	private String username;
	@Value("${db.password}")
	private String password;
	
	@Autowired
	private Environment env;
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public String getDburl() {
		return dburl;
	}
	public void setDburl(String dburl) {
		this.dburl = dburl;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void displayProperties() {
        System.out.println("Using @Value:");
        System.out.println("Driver Class Name: " + driverClassName);
        System.out.println("URL: " + dburl);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println();
        System.out.println("Using Environment:");
        System.out.println("Driver Class Name: " + env.getProperty("db.driverClassName"));
        System.out.println("URL: " + env.getProperty("db.url"));
        System.out.println("Username: " + env.getProperty("db.username"));
        System.out.println("Password: " + env.getProperty("db.password"));
    }
	
}

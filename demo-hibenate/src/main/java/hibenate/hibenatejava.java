package hibenate;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import hibernatedemo.pojo.Catogory;

public class hibenatejava {
	private static final SessionFactory FACTORY;
	
	static {
		Configuration conf = new Configuration();
		Properties props = new Properties();
		
		props.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		props.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
		props.put(Environment.URL, "jdbc:mysql://localhost/demo");
		props.put(Environment.USER, "root");
		props.put(Environment.PASS, "1234");
		props.put(Environment.SHOW_SQL, "true");
		
		conf.setProperties(props);
		conf.addAnnotatedClass(Catogory.class);
		ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
		FACTORY = conf.buildSessionFactory(registry);
	}

	public static SessionFactory getFactory() {
		return FACTORY;
	}
	
	
}

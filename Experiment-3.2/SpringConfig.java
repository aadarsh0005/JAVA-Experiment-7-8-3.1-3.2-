import org.springframework.context.annotation.*; import org.springframework.orm.hibernate5.*; import org.springframework.transaction.annotation.EnableTransactionManagement;
import javax.sql.DataSource; import com.zaxxer.hikari.*;
@Configuration @EnableTransactionManagement @ComponentScan("")
public class SpringConfig{
@Bean public DataSource ds(){HikariDataSource ds=new HikariDataSource();
ds.setJdbcUrl("jdbc:mysql://localhost:3306/testdb"); ds.setUsername("root"); ds.setPassword("root"); return ds;}
@Bean public LocalSessionFactoryBean sf(){LocalSessionFactoryBean sf=new LocalSessionFactoryBean(); sf.setDataSource(ds());
sf.setAnnotatedClasses(Account.class); return sf;}
@Bean public HibernateTransactionManager txManager(){HibernateTransactionManager tx=new HibernateTransactionManager();
tx.setSessionFactory(sf().getObject()); return tx;}}
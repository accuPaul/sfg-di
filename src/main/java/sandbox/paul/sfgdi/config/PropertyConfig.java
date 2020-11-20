package sandbox.paul.sfgdi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import sandbox.paul.sfgdi.examplebeans.FakeDataSource;
import sandbox.paul.sfgdi.examplebeans.FakeJmsBroker;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})  // Replaced in Spring 4 by...
/*@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})*/
public class PropertyConfig {
/*
    @Autowired
    Environment env;
*/
    @Value("${sandbox.username}")
    String user;

    @Value("${sandbox.password}")
    String password;

    @Value("${sandbox.dbUrl}")
    String url;

    @Value("${sandbox.jms.username}")
    String jmsUser;

    @Value("${sandbox.jms.password}")
    String jmsPass;

    @Value("${sandbox.jms.dbUrl}")
    String jmsUrl;


    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPass(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker jmsBroker = new FakeJmsBroker();
        jmsBroker.setUser(jmsUser);
        jmsBroker.setPass(jmsPass);
        jmsBroker.setUrl(jmsUrl);
        return jmsBroker;
    }
/*
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

*/
}

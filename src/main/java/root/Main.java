package root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@ComponentScan("root")
//@ComponentScan("root.Services")
//@Import(DataConfig.class)
public class Main
{
    @Autowired

    public static void main(String[] args)
    {
        SpringApplication.run(new Class<?>[]{Main.class}, args);

    }
}

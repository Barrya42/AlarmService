package integrationTests;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

@Configuration
public class Config {
    @Bean
    public TransactionTemplate transactionTemplate(PlatformTransactionManager ptm) {
        TransactionTemplate transactionTemplate = new TransactionTemplate();
        transactionTemplate.setTransactionManager(ptm);
        return transactionTemplate;
    }
}

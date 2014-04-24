package webapp;

import domain.DomainConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import repository.RepositoryConfiguration;
import service.ServiceConfiguration;

import javax.sql.DataSource;


@Import(value = {DomainConfiguration.class, RepositoryConfiguration.class, ServiceConfiguration.class})
@Configuration
public class WebappApplicationConfig {

    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
    }
}
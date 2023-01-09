package example.micronaut;

import io.micronaut.context.annotation.ConfigurationProperties;
import jakarta.inject.Singleton;

@Singleton
@ConfigurationProperties("db")
public interface DbConfiguration {

  String getLogin();

  String getPassword();
}

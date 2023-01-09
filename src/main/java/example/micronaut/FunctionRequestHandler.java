package example.micronaut;

import io.micronaut.context.annotation.Value;
import io.micronaut.function.aws.MicronautRequestHandler;
import jakarta.inject.Inject;

public class FunctionRequestHandler extends MicronautRequestHandler<Object, String> {

  @Inject
  private DbConfiguration dbConfiguration;

  @Override
  public String execute(Object input) {
    return dbConfiguration.getLogin() + " " + dbConfiguration.getPassword();
  }
}

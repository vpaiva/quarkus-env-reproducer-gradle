package org.acme;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

@QuarkusMain
public class EnvTest implements QuarkusApplication {

  public static void main(String... args) {
    Quarkus.run(EnvTest.class, args);
  }

  @Override
  public int run(String... args) {
    return 0;
  }
}

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class Main extends Application<Configuration> {
    public void run(Configuration configuration, Environment environment) throws Exception {

    }

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
        bootstrap.addBundle(new AssetsBundle());
    }

    public static void main(String[] args) throws Exception {
        new Main().run(args);
    }
}

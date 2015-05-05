package camelkurawifidemo.wifirouter.springboot;

import camelkurawifidemo.wifirouter.WiFiRouter;
import org.apache.camel.spring.boot.FatJarRouter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WifiRouterApp extends FatJarRouter {

    @Bean
    WiFiRouter wiFiRouter() {
        return new WiFiRouter();
    }

}

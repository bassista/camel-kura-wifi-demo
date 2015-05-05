package camelkurawifidemo.wifirouter;

import org.apache.camel.component.kura.KuraRouter;

import static org.apache.camel.model.dataformat.JsonLibrary.Jackson;

public class WiFiRouter extends KuraRouter {

    @Override
    public void configure() throws Exception {
        from("netty4-http:http://0.0.0.0:18080").
                to("kura-wifi:*/*").
                transform().groovy("[accessPoints: request.body.collect {[ssid: it.ssid, signal: it.strength]}]").
                marshal().json(Jackson);
    }

}

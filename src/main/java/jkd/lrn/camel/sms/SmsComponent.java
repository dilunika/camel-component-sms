package jkd.lrn.camel.sms;

import java.util.Map;

import org.apache.camel.Endpoint;
import org.apache.camel.impl.DefaultComponent;

/**
 * Represents the component that manages {@link SmsEndpoint}.
 */
public class SmsComponent extends DefaultComponent {

    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        Endpoint endpoint = new SmsEndpoint(uri, this);
        setProperties(endpoint, parameters);
        return endpoint;
    }
}

package jkd.lrn.camel.sms;

import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.impl.DefaultEndpoint;

/**
 * Represents a Sms endpoint.
 */
public class SmsEndpoint extends DefaultEndpoint {

    public SmsEndpoint() {
    }

    public SmsEndpoint(String uri, SmsComponent component) {
        super(uri, component);
    }

    public Producer createProducer() throws Exception {
        return new SmsProducer(this);
    }

    public Consumer createConsumer(Processor processor) throws Exception {
        return new SmsConsumer(this, processor);
    }

    public boolean isSingleton() {
        return true;
    }
}

package jkd.lrn.camel.sms;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Sms producer.
 */
public class SmsProducer extends DefaultProducer {
    private static final transient Logger LOG = LoggerFactory.getLogger(SmsProducer.class);
    private SmsEndpoint endpoint;

    public SmsProducer(SmsEndpoint endpoint) {
        super(endpoint);
        this.endpoint = endpoint;
    }

    public void process(Exchange exchange) throws Exception {
        System.out.println(exchange.getIn().getBody());
        LOG.info("SMS sent successfully.");
    }

}

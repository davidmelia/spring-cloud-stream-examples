package uk.co.dave.producer.fxrate;

import java.math.BigDecimal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import uk.co.dave.consumer.fxrate.consumer.json.JsonFxRateEvent;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {FxRateProducerApplication.class}, webEnvironment = WebEnvironment.NONE)
@EnableAutoConfiguration
@ActiveProfiles("producer")
public class NonAvroFxRatePublisher {
  @Autowired
  private FxRatePublisher publisher;


  @Test
  public void invokeRnsNewsProducerForEver() throws InterruptedException {
    while (true) {
      publisher.publish(new JsonFxRateEvent("GBP", "USD", BigDecimal.valueOf(123.45)));
      Thread.sleep(1000);
    }
  }

}

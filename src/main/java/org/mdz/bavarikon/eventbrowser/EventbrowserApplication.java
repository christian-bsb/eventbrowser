package org.mdz.bavarikon.eventbrowser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class EventbrowserApplication {

  public static void main(String[] args) {
    SpringApplication.run(EventbrowserApplication.class, args);
  }
}

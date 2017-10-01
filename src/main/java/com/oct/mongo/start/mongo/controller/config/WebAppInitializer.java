package com.oct.mongo.start.mongo.controller.config;

import com.oct.mongo.start.mongo.MongoApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import java.util.Properties;

/**
 * Created by khan on 9/30/17.
 */
public class WebAppInitializer extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
    return applicationBuilder.sources(MongoApplication.class).properties(getProperties());
  }

  private Properties getProperties() {
    Properties properties = new Properties();
    properties
        .put("spring.config.location", "file:" + System.getenv("W_CONF_DIR") + "/spring_mongo/");
    return properties;
  }

}

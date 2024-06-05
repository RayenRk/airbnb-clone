package org.example.airbnbcloneback.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories({"org.example.airbnbcloneback.user.repository",
        //"org.example.airbnbcloneback.listing.repository",
        //"org.example.airbnbcloneback.booking.repository"
        })
@EnableTransactionManagement
@EnableJpaAuditing
public class DatabaseConfiguration {
}

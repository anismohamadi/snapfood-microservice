package com.kurdestanbootcamp.gateway;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/categoryservice/**")
                        .uri("lb://category-service")
                )

                .route(r -> r.path("/supplierservice/**")
                        .uri("lb://supplier-service")
                )

                .route(r -> r.path("/suppliercategoryservice/**")
                        .uri("lb://supplier-category-service")
                )

                .route(r -> r.path("/itemservice/**")
                        .uri("lb://item-service")
                )
                .route(r -> r.path("/userservice/**")
                        .uri("lb://user-service")
                )
                .route(r -> r.path("/basketservice/**")
                        .uri("lb://basket-service")
                )

                .route(r -> r.path("/useraddressservice/**")
                        .uri("lb://user-address-service")
                )

                .route(r -> r.path("/basketitemservice/**")
                        .uri("lb://basket-item-service")
                )

                .build();
    }

}
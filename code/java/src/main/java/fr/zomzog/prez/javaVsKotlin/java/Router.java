package fr.zomzog.prez.javaVsKotlin.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class Router {

    @Bean
    RouterFunction<ServerResponse> routes(PonyHandler ponyHandler) {
        return
                route(GET("/ponies"), ponyHandler::findAll)
                        .and(route(POST("/ponies"), ponyHandler::create))
                        .andNest(path("/{id}"),
                                route(GET("/"), ponyHandler::findOne));
    }
}

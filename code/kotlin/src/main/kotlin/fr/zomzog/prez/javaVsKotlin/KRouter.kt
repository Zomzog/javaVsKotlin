package fr.zomzog.prez.javaVsKotlin

import org.springframework.context.annotation.Bean
import org.springframework.web.reactive.function.server.*
import org.springframework.web.reactive.function.server.RequestPredicates.*
import org.springframework.web.reactive.function.server.RouterFunctions.route

class KRouter {
    @Bean
    fun routes(ponyHandler: PonyHandler) = router {
        "/ponies".nest {
            GET("", ponyHandler::findAll)
            POST("", ponyHandler::create)
            "/{id}".nest {
                GET("", ponyHandler::findOne)
            }
        }
    }
    @Bean
    fun routes3(ponyHandler: PonyHandler): RouterFunction<ServerResponse> {
        return router {
            "/ponies".nest {
                GET("", ponyHandler::findAll)
                POST("", ponyHandler::create)
                "/{id}".nest {
                    GET("", ponyHandler::findOne)
                }
            }
        }
    }

    @Bean
    fun routes2(ponyHandler: PonyHandler): RouterFunction<ServerResponse> {
        return route(GET("/ponies"), ponyHandler::findAll)
                .and(route(POST("/ponies"), ponyHandler::create))
                .andNest(path("/{id}"),
                        route(GET("/"), ponyHandler::findOne))
    }
}
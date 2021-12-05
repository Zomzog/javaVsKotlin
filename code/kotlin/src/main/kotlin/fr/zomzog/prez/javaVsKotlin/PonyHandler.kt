package fr.zomzog.prez.javaVsKotlin

import fr.zomzog.prez.javaVsKotlin.kotlin.data.Pony
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

class PonyHandler {
    fun findAll(request: ServerRequest): Mono<ServerResponse> {
        TODO()
    }

    fun findOne(request: ServerRequest): Mono<ServerResponse> {
        TODO()
    }
    fun create(request: ServerRequest): Mono<ServerResponse> {
        TODO()
    }

    fun doStuff(p: Pony?): String {
        if (p == null) {
            throw RuntimeException("Pony must not be null")
        }
        return p.name
        // doStuff
    }

    fun String.asPony(): Pony = Pony(this)
}
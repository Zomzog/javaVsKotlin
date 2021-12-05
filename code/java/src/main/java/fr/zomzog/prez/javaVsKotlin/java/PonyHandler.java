package fr.zomzog.prez.javaVsKotlin.java;

import fr.zomzog.prez.javaVsKotlin.java.data.Pony;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PonyHandler {
    public Mono<ServerResponse> findAll(ServerRequest serverRequest) {
        throw new RuntimeException("TODO");
    }
    public Mono<ServerResponse> findOne(ServerRequest serverRequest) {
        throw new RuntimeException("TODO");
    }
    public Mono<ServerResponse> create(ServerRequest serverRequest) {
        throw new RuntimeException("TODO");
    }

    public void doStuff(Pony p) {
        if (p == null) {
            throw new RuntimeException("Pony must not be null");
        }
        // stuff
    }
}

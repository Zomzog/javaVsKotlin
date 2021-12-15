package fr.zomzog.prez.javaVsKotlin

import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Mono

class Reactive(val repo: PonyRepository, val feeder: PonyFeeder) {

    fun feedMyPony(name: String): Mono<Pony> {
        val happyPony = repo.findById(name).flatMap { hungryPony ->
            if (hungryPony == null) {
                Mono.error(PonyNotFound())
            } else {
                feeder.feed(hungryPony)
            }
        }
        return happyPony
    }
}

data class Pony(var name: String)

interface PonyRepository : ReactiveCrudRepository<Pony, String>

interface PonyFeeder {
    fun feed(pony: Pony): Mono<Pony>
}

class PonyNotFound : RuntimeException()
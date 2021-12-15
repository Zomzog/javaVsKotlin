package fr.zomzog.prez.javaVsKotlin.coroutine

import org.springframework.data.repository.kotlin.CoroutineCrudRepository

class Reactive(val repo: PonyRepository, val feeder: PonyFeeder) {

    suspend fun feedMyPony(name: String): Pony {
        val hungryPony = repo.findById(name) ?: throw PonyNotFound()
        val happyPony = feeder.feed(hungryPony)
        return happyPony
    }
}

data class Pony(var name: String)

interface PonyRepository : CoroutineCrudRepository<Pony, String>

interface PonyFeeder {
    suspend fun feed(pony: Pony): Pony
}

class PonyNotFound : RuntimeException()
package fr.zomzog.prez.javaVsKotlin.data

import fr.zomzog.prez.javaVsKotlin.kotlin.PonyBuilder
import fr.zomzog.prez.javaVsKotlin.kotlin.data.Pony
import fr.zomzog.prez.javaVsKotlin.kotlin.data.Pony2
import fr.zomzog.prez.javaVsKotlin.kotlin.sealed.Pegasis
import fr.zomzog.prez.javaVsKotlin.kotlin.sealed.Unicorn
import org.junit.jupiter.api.Test
import java.util.*
import kotlin.random.Random

internal class PonyTest {

    @Test
    fun pony() {
        val p = Pony("aa")
        println(p.name)
        println(p.hashCode())
        println(p.toString())
    }

    @Test
    fun pony2() {
        val p1 = Pony2("123")
        println(p1) // Rainbow Dash
        val p2 = Pony2(name = "name", id = "id")
        println(p2)
        val p3 = p1.copy(name = "Twilight") // Pony(id=123, name=Twilight)
        println(p3)
        val (id, name) = p1
        println(id + name)
        val (_, name2) = p1
        println(name2)
    }

    @Test
    fun pony3() {
        val p = aPony()
        when (p) {
            is Unicorn -> p.doMagic()
            is Pegasis -> p.fly()
        }
    }

    fun aPony() = if(Random.nextBoolean()) Unicorn() else Pegasis()

    @Test
    fun builder() {
        PonyBuilder().apply {
            id = "id"
            name = "name"
        }
    }

    @Test
    fun withTest() {
        val p2 = Pony2(name = "name", id = "id")
        val r = with(p2) {
            name + id
        }
        println(r)
    }
}
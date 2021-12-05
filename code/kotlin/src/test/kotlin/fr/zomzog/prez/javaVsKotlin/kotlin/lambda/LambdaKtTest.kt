package fr.zomzog.prez.javaVsKotlin.kotlin.lambda

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LambdaKtTest {
    @Test
    fun `pony test`() {
        val p = doStuff("name", {a,b-> a + b})
        println("p = $p")
    }
}
package fr.zomzog.prez.javaVsKotlin.kotlin.data

data class Pony(val name: String)

data class Pony2(
        val id: String,
        val name: String = "Rainbow Dash")

@JvmInline
value class PonyId(val id: String)

data class Pony3(val id: PonyId)

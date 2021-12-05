package fr.zomzog.prez.javaVsKotlin.kotlin.lambda

fun doStuff(name: String, count:Int = 0): String {
    return "name $count"
}

fun doStuff2(name: String, count:Int = 0) = "name $count"



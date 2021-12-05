package fr.zomzog.prez.javaVsKotlin.kotlin.lambda

//fun doStuff(list: List<Int>, f: (Int) -> Int) = list.map { it*2 }.map(f)
//fun doStuff(list: List<Int>, f: (Int, Int) -> Int) = list.map { it*2 }.map{f(it,it)}


fun doStuff(name: String, f: (String, Int) -> String): String {
    return f(name, 42)
}
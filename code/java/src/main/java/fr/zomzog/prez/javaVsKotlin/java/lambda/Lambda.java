package fr.zomzog.prez.javaVsKotlin.java.lambda;

import java.util.function.BiFunction;

public class Lambda {

    public String doStuff(String name, BiFunction<String, Integer, String> fun) {
        return fun.apply(name, 42);
    }
}

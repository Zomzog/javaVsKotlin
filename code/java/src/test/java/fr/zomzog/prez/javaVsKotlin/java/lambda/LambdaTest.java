package fr.zomzog.prez.javaVsKotlin.java.lambda;

import kotlin.jvm.functions.Function1;
import org.junit.jupiter.api.Test;

import java.util.List;

import static fr.zomzog.prez.javaVsKotlin.kotlin.lambda.LambdaKt.doStuff;
import static org.junit.jupiter.api.Assertions.*;

class LambdaTest {


    @Test
    public void lambda() {
        var result = List.of(1,2,3)
                .stream().map(it -> it + 1);

        Function1<Integer, Integer> integerIntegerFunction1 = i -> i;
        var l = new Lambda();
        var p = l.doStuff("name", (a,b)-> a+b);
        System.out.println("p = " + p);
    }
}
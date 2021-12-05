package fr.zomzog.prez.javaVsKotlin.data;

import fr.zomzog.prez.javaVsKotlin.java.data.Pony;
import org.junit.jupiter.api.Test;

class PonyTest {

    @Test
    void pony() {
        var p = new Pony("aa");
        System.out.println(p.name());
        System.out.println(p.hashCode());
        System.out.println(p.toString());
    }
}
package fr.zomzog.prez.javaVsKotlin.java.sealed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PonyTest {
@Test
    public void test() {
        Pony p = aPony();
        switch (p) {
            case Unicorn u -> u.doMagic();
            case Pegasis g -> g.fly();
        }
    }

    public Pony aPony() {
    return new Unicorn();
    }


}
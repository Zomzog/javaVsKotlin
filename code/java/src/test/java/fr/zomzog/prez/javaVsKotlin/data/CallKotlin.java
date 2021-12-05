package fr.zomzog.prez.javaVsKotlin.data;

import fr.zomzog.prez.javaVsKotlin.kotlin.data.Pony2;
import fr.zomzog.prez.javaVsKotlin.kotlin.data.Pony3;
import org.junit.jupiter.api.Test;

public class CallKotlin {
    @Test
    public void test() {
//        Pony3 p = new Pony3("id");
//        p.getId();
        var p2 = new Pony2("id", "name");
        p2.copy("123", p2.getName());
    }
}

package ysf;

import ysf.solituon.*;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LocalDateTime t1 = LocalDateTime.now();

        System.out.println(new DecodeWays().numDecodings("11106"));


        // 11106
        // 1 1106
        // 11 106



        System.out.println(ChronoUnit.SECONDS.between(t1, LocalDateTime.now()));

    }


}
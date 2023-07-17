package ysf;

import ysf.solituon.array.BestTimeToBuyAndSellStock;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LocalDateTime t1 = LocalDateTime.now();

        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(new int[]{7,1,5,3,6,4}));

        System.out.println(ChronoUnit.SECONDS.between(t1, LocalDateTime.now()));

    }
}
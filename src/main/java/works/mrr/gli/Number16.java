package works.mrr.gli;

import java.util.*;

public class Number16 {
    public static Integer getFirstUnique(List<Integer> data) {
        Map<Integer, Integer> myMap = new HashMap<>();

        // step:
        //  1. ngitung berapa kali muncul angka yang ada di data
        //  2. simpen ke map, kalo sudah ada + 1, kalau belum ada pakai nilai default 0 + 1
        for (Integer number : data) {
            myMap.put(number, myMap.getOrDefault(number, 0) + 1);
        }

        // loop untuk cari yang angka kemunculannya itu == 1
        // kalau ketemu langsung return tanpa ngecek ke setelahnya
        for (Integer number : data) {
            if (myMap.get(number) == 1) {
                return number;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(5, 1, 5, 2, 1, 3, 4);
        Integer uniqueNumber = getFirstUnique(data);
        System.out.println(uniqueNumber);
    }
}

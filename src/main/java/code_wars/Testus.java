package code_wars;

import org.springframework.lang.Nullable;
import org.springframework.util.Assert;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Testus {

    public static void main(String[] args) {
        double[] a = new double[] {14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0};
        double[] b = new double[] {15.0, 30.0};


        System.out.println(newAvg(a, 90));
        a = new double[] {14, 30, 5, 7, 9, 11, 15};
        System.out.println(newAvg(a, 92));
    }


    public static long newAvg(double[] arr, double navg)
    {
        double sum = Arrays.stream(arr).sum();
        long result = Math.round(Math.ceil((navg * (arr.length +1)) - sum));
        if (result <= 0) {throw new IllegalArgumentException();}
        return result;
    }

}

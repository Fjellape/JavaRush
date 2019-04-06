package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Задача по алгоритмам
*/

public class MaximumNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        //напишите тут ваш код
        int number = Integer.parseInt(reader.readLine());
        if(number > 0 ) {
            for (int i = 0; i < number; i++) {
                int currentNumber = Integer.parseInt(reader.readLine());
                //System.out.println(currentNumber);
                if (currentNumber > maximum) {
                    maximum = currentNumber;
                }
            }
        }

        System.out.println(maximum);
    }
}

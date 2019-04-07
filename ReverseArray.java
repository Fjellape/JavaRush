package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
Слова в обратном порядке
*/

public class ReverseArray {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        list.remove(2);

        Collections.reverse(list);

        for (String s : list) {
            System.out.println(s);
        }
    }
}


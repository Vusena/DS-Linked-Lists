package org.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Before we could create boxes of any kind
        List list=new ArrayList();
        list.add(1000);
        list.add("Name");
        list.add(10.78);

        System.out.println(list);
        System.out.println(list.get(2));

        List <Integer> list2=new ArrayList<>();
        list2.add(45);
        list2.add(56);
        list2.add(78);
        list2.add(90);
        list2.add(77);
        list2.add(43);

    }
}

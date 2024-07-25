package ru.aston.hw4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;

public class one {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add(0, "B");
        arrayList.add(1, "C");
        arrayList.remove("B");

        LinkedList<int> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.addFirst(2);
        linkedList.add(1, 3);
        linkedList.remove(2);

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "A");
        hashMap.put(2, "B");
        hashMap.put(1, "C");
        hashMap.remove(2);

    }
}


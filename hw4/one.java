package ru.aston.hw4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;

// Изучить API ArrayList, LinkedList, HashMap. 
// Создать коллекции, добавить в начало, конец, середину элементы, удалить элемент, список элементов.

public class one {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add(0, "B");
        arrayList.add(1, "C");
        arrayList.remove("B");
        for (String element : arrayList) {
            System.out.println(element);
        }
        System.out.println();

        LinkedList<int> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.addFirst(2);
        linkedList.add(1, 3);
        linkedList.remove(2);
        for (Integer element : linkedList) {
            System.out.println(element);
        }
        System.out.println();

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "A");
        hashMap.put(2, "B");
        hashMap.put(1, "C");
        hashMap.remove(2);
        for (HashMap.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }

    }
}


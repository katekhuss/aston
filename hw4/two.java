package ru.aston.hw4;

import java.util.Arrays;

public class two<T> {
    private Object[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public two() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (T) elements[index];
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
    }

    public void addAll(two<T> other) {
        for (int i = 0; i < other.size; i++) {
            add(other.get(i));
        }
    }

    private void ensureCapacity() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    public void bubbleSort() {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < size; i++) {
                if (((Comparable<T>) elements[i - 1]).compareTo((T) elements[i]) > 0) {
                    Object temp = elements[i - 1];
                    elements[i - 1] = elements[i];
                    elements[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }

    public static void main(String[] args) {
        two<Integer> list = new two<>();
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(5);

        System.out.println("до: " + list);
        list.bubbleSort();
        System.out.println("после: " + list);
    }
}
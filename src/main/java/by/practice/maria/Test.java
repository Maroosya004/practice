package by.practice.maria;

public class Test {
    public static void main(String[] args) {
        boolean[] boobs = new boolean[10];
        int i = 0;
        while (i < boobs.length) {
            boobs[i] = true;
            i = i + 2;
        }
        print(boobs);

    }

    public static void print(boolean[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.println(i+ " - " + array[i]); // 0 - true
            i = i + 1;
        }
    }

//    [2, 5, 10, 3] -> 20
}
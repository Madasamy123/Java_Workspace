package com.collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> books=new Stack<>();
        books.add("Harry booter");
        books.add("Blue umberlla");
        books.add("Ponniyen Selven");
        books.add("Tamil Book");

        System.out.println(books);
        System.out.println(books.pop());
        books.push("English book");
        System.out.println(books.pop());
        System.out.println(books.pop());
        System.out.println(books.pop());
        System.out.println(books.pop());
        System.out.println(books.peek());
        System.out.println(books);


    }
}

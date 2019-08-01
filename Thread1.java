package com.kavuri.thread;

public class Thread1 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyClass ());
        t1.start();
    }

}

package com.mashibing.test;

public class TestSyn {
    public synchronized void m1() {
        System.out.println(Thread.currentThread().getName() + "m1 start ....");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "m1 end...");
    }
    public void  m2() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "m2");

    }

    public static void main(String[] args) {
        TestSyn testSyn = new TestSyn();
        new Thread(testSyn::m1,"t1").start();
        new Thread(testSyn::m2,"t2").start();
    }
}

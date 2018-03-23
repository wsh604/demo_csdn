package com.example.demo_13_runnable_levelup;

public class RunnableTest {
    public static void main(String args[]){
        Banji banji = new Banji();
        Thread banZhuRen = new Thread(banji);
        banZhuRen.start();
        System.out.println("the number of banji is :" + banji.toString());

        Thread fubanZhuRen = new Thread(banji);
        fubanZhuRen.start();
        System.out.println("the number of banji is :" + banji.toString());
    }
}



class Banji implements Runnable{
    private int numOfStudent  = 50;

    @Override
    public void run() {
        addChabanSheng();
    }

    public synchronized Banji addChabanSheng(){
        this.numOfStudent++;
        return this;
    }

    @Override
    public String toString() {
        return numOfStudent + "";
    }
}
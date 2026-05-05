package com.runoob.test;

public class RunoobTest {
    private int c;//私有成员变量
    public String d = "Hello";//公有成员变量
    private int instanceVar;
    private static int staticVar;
    public void method(int paramVar){
        int localVar = 10;
        instanceVar = localVar;
        staticVar = paramVar;
        System.out.println("成员变量：" + instanceVar);
        System.out.println("静态变量：" + staticVar);
        System.out.println("参数变量：" + paramVar);
        System.out.println("局部变量" + paramVar);
        System.out.println("局部变量" + localVar);
    }
    public static void main(String[] args){
        RunoobTest obj = new RunoobTest();//创建对象
        RunoobTest v = new RunoobTest();
        obj.c = 10;//访问成员变量，并设置其值为10
        System.out.println("a = " + obj.c);
        obj.d = "world";
        System.out.println("b = " + obj.d);
        v.method(20);
        int a = 10,b = 20;
        swap(a,b);
        System.out.println("a = " + a +",b = " + b);
    }
    public static void swap(int x,int y){
        int temp = x;
        x = y;
        y = temp;
    }
}

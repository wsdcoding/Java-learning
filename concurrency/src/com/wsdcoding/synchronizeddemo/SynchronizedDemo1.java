package com.wsdcoding.synchronizeddemo;

import java.util.concurrent.TimeUnit;

/**
 * @Description: synchronized 学习案例
 * @Authror wsdcoding
 */
public class SynchronizedDemo1 {
    //修饰静态方法
    public synchronized static void accessResources0(){
        try {

            TimeUnit.SECONDS.sleep(2);
            System.out.println(Thread.currentThread().getName()+" is runing");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //修饰非静态方法

    //代码块1（对象）this指的是当前对象
    public  void accessResources1(){
        synchronized(this){
            try {
                synchronized (this){
                    TimeUnit.MINUTES.sleep(2);
                }
                System.out.println(Thread.currentThread().getName()+" is runing");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //代码块1（CLASS类）
    public  void accessResources4(){
        synchronized(SynchronizedDemo1.class){//ClassLoader  class  ——-》堆   Class   所有的对象
            //有Class对象的所有的对象都共同使用这一个锁
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println(Thread.currentThread().getName()+" is runing");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
//

    public static void main(String[] args) {
        final SynchronizedDemo1 demo1=new SynchronizedDemo1();
        for (int i = 0; i < 5; i++) {
            new Thread(demo1::accessResources1).start();
        }
    }
}

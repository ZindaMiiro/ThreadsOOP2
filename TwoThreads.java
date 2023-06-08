/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadindDEMO;

/**
 *
 * @author jorda
 */
public class TwoThreads {
  public static class Thread1 extends Thread {
      //thread 1
      //prints A and B
public void run() {
System.out.println("A");
System.out.println("B");
}
}
public static class Thread2 extends Thread {
    //thread 2  
    //prints 1 and 2
public void run() {
System.out.println("1");
System.out.println("2");
}
}
public static void main(String[] args) {
    //main thread
new Thread1().start();
new Thread2().start();
}  
}

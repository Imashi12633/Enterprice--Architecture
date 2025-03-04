/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

/**
 *
 * @author student
 */
public class Javathread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RunnableTask task1=new RunnableTask();
        RunnableTask task2=new RunnableTask();
         
         Thread thread1=new Thread(task1);
         Thread thread2=new Thread(task2);
       
         thread1.start();
         thread2.start();
    
        // TODO code application logic here
    }
    
}

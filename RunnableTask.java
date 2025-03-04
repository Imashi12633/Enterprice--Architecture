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
public class RunnableTask implements Runnable {
 public void run(){
 System.out.println(Thread.currentThread().getId()+"is executing the runnable task");
 }
 
    
}

package com.example;

public class CountRunnable implements Runnable{
  
final int count;
final String threadName;
  
  // Setup Constructor to initialize variables
  public CountRunnable(int count, String threadName) {
      this.count = count;
      this.threadName = threadName;
    }

@Override
  public void run(){ 
    // Count with for loop
    for (int i = 1; i <= count; i++){
        System.out.println("TreadName " +threadName + ": " +i);
            }
     }

  
}

package lab8assignments;

import java.time.LocalTime;


class Threadclass extends Thread{
   public void run() {
       while (true) {
           System.out.println(LocalTime.now());
           try { 
           	Thread.sleep(5000); 
           	}
           catch(InterruptedException e) { 
           	System.out.println(e); 
           	}
       }
   }
}

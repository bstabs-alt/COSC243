import java.util.Date;

/**
 * This is the producer thread for the bounded buffer problem.
 *
 * @author Gagne, Galvin, Silberschatz
 * Operating System Concepts with Java - Sixth Edition
 * Copyright John Wiley & Sons - 2003.
 */

public class Producer implements Runnable {

   private  Channel mbox;

   public Producer(Channel m) {
      mbox = m;
   }              

   public void run() {
      Date message;

      while (true) { 
         SleepUtilities.nap();   
         message = new Date();      
         System.out.println("Producer produced " + message);
         // produce an item & enter it into the buffer
         mbox.send(message);
      }
   }

}

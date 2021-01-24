import java.util.Date;

/**
 * This is the consumer thread for the bounded buffer problem.
 *
 * @author Gagne, Galvin, Silberschatz
 * Operating System Concepts with Java - Sixth Edition
 * Copyright John Wiley & Sons - 2003.
 */

public class Consumer implements Runnable {

   private Channel mbox;
   
   public Consumer(Channel m) { 
      mbox = m;
   }

   public void run() {
      Date message;

      while (true) {
         SleepUtilities.nap();

         // consume an item from the buffer
         System.out.println("Consumer wants to consume.");
         message = (Date)mbox.receive();
         if (message != null)
            System.out.println("Consumer consumed " + message);
      }
   }

}

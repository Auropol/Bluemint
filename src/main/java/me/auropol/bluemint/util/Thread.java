package me.auropol.bluemint.util;

import java.util.Random;

public abstract class Thread {
  public abstract String name();
    public interface ThreadUtil {
       static String generateNewThread(Thread threadName) {
           String threadNameToString = threadName.toString();
            int randomThreadNumberGen = new Random().nextInt();
            String randomThreadNumber = Integer.toString(randomThreadNumberGen);
            return "[THREAD-" + randomThreadNumber + "/" + threadNameToString + "]";
        }
    }

    }


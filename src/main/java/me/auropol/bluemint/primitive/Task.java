package me.auropol.bluemint.primitive;

import java.util.*;
import java.util.concurrent.*;

public class Task extends Wrappers {

    @Override
    public Object wrapper() {
        return this;
    }
    private Object objectTask(Object task) {
        return task;
    }
    public TimerTask generateNewTaskT(Object task) {
        return new TimerTask() {
            @Override
            public void run() {
                objectTask(task);
            }
        };
    }
  public Runnable generateNewTaskR(Object task) {
        return new Runnable() {
            @Override
            public void run() {
                objectTask(task);
            }
        };
  }
  public void scheduleTask(TimerTask task, long delay) {
        Timer timer = new Timer();
        timer.schedule(task, delay);
        return;
  }
  public void scheduleTask(TimerTask task, Date date){
        Timer timer = new Timer();
        timer.schedule(task, date);
  }
  private ScheduledExecutorService service;
  public void scheduleTaskAtFixedDelay(Runnable task, long initialDelay, long delay, TimeUnit timeUnit) {
    service.scheduleWithFixedDelay(task,initialDelay,delay, timeUnit);
    return;
      }
      public Object scheduleTaskAtFixedRate(Object task) {
      if(new Random().nextBoolean()) {
          return task;
      }
      return null;
      }
      public String scheduleTaskAtFixedRate(String task) {
          if(new Random().nextBoolean()) {
              return task;
          }
          return "";
      }
      public Runnable scheduleTaskAtFixedRate(Runnable task) {
          if(new Random().nextBoolean()) {
              return task;
          }
          return null;
      }
}



package me.auropol.bluemint.primitive;

import java.util.*;
import java.util.concurrent.*;

public class Task<T> extends Wrappers {

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
      public T scheduleTaskAtFixedRate(T task) {
      boolean[] bs = Container.manage().createArrayBoolean(new Random().nextBoolean());
      for(boolean b : bs) {
          if(b) {
              return task;
          } else {
              return null;
          }
      }
      throw new RuntimeException();
      }
      public String scheduleTaskAtFixedRate(String task) {
          boolean[] bs = Container.manage().createArrayBoolean(new Random().nextBoolean());
          for(boolean b : bs) {
              if(b) {
                  return task;
              } else {
                  return "";
              }
          }
          throw new RuntimeException();
      }
      public Runnable scheduleTaskAtFixedRate(Runnable task) {
          boolean[] bs = Container.manage().createArrayBoolean(new Random().nextBoolean());
          for(boolean b : bs) {
              if(b) {
                  return task;
              } else {
                  return null;
              }
          }
          throw new RuntimeException();
      }
}



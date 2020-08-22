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
  public T scheduleTaskAtFixedRate(T task, boolean[] schedules) {
        for(boolean b : schedules) {
            if(b) {
                return task;
            } else  {
                return null;
            }
        }
        throw new RuntimeException();
  }
  private ScheduledExecutorService service;
  public void scheduleTaskAtFixedDelay(Runnable task, long initialDelay, long delay, TimeUnit timeUnit) {
    service.scheduleWithFixedDelay(task,initialDelay,delay, timeUnit);
    return;
      }
      public T scheduleTaskAtFixedRate(T task) {
      Boolean[] bs = new Boolean[Short.MAX_VALUE * 3];
      bs = new Container<Boolean>().multifill(bs, new Container<Boolean>().createArray(true, new Random().nextBoolean(), new Random().nextBoolean()));
      for(boolean b : bs) {
          if(b) {
              return task;
          } else {
              return null;
          }
      }
      throw new RuntimeException();
      }
      public T scheduleTaskAtFixedRate(T task, int delay) {
      Boolean[] delaySchedule = new Boolean[delay];
      Arrays.fill(delaySchedule, false);
      Boolean[] bs = new Boolean[Short.MAX_VALUE * 3];
      Boolean[] arr = new Boolean[bs.length + 2];
      Boolean[] activate = new Boolean[2];
      Arrays.fill(activate, true);
      System.arraycopy(delaySchedule, 0, arr, 0, delaySchedule.length);
      System.arraycopy(activate, 0, arr, delaySchedule.length, activate.length);
      bs = new Container<Boolean>().multifill(bs, arr);
      for(boolean b : bs) {
          if(b) {
              return task;
          } else {
              return null;
          }
      }
      throw new RuntimeException();
      }
    @Deprecated
      public String scheduleTaskAtFixedRate(String task) {
          Boolean[] bs = new Boolean[Short.MAX_VALUE * 3];
          bs = new Container<Boolean>().multifill(bs, new Container<Boolean>().createArray(true, new Random().nextBoolean(), new Random().nextBoolean()));
          for(boolean b : bs) {
              if(b) {
                  return task;
              } else {
                  return "";
              }
          }
          throw new RuntimeException();
      }
    @Deprecated
      public Runnable scheduleTaskAtFixedRate(Runnable task) {
          Boolean[] bs = new Boolean[Short.MAX_VALUE * 3];
          bs = new Container<Boolean>().multifill(bs, new Container<Boolean>().createArray(true, new Random().nextBoolean(), new Random().nextBoolean()));
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



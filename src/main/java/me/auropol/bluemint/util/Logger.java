package me.auropol.bluemint.util;
import me.auropol.bluemint.util.Thread.ThreadUtil;
public class Logger {
    public static Logger manage() {
        return new Logger();
    }
    public void info(String args, Thread thread){
        System.out.println(ThreadUtil.generateNewThread(thread) + "(INFO/" + args + ")");
    }
    public void warn(String args, Thread thread){
        String yellow = "\033[0;93m";
        System.out.println(ThreadUtil.generateNewThread(thread) + "(WARN/" + args + yellow + ")");
    }
    public void critical(String args, Thread thread){
        String red = "\033[0;91m";
        System.out.println(ThreadUtil.generateNewThread(thread) + "(CRITICAL/" + args + red + ")");
    }
    public void debug(String args, Thread thread) {
        String cyan = "\033[0;96m";
        System.out.println(ThreadUtil.generateNewThread(thread) + "(DEBUG/" + args + cyan + ")");
    }

}

package me.auropol.bluemint.util;
import me.auropol.bluemint.primitive.Wrappers;
import me.auropol.bluemint.util.Thread.ThreadUtil;

public class Logger {
    public static LoggerHelper log;
    private Wrappers wrappers = new Wrappers() {
        @Override
        public Object wrapper() {
            return null;
        }
    };

    public static Logger manage() {
        return new Logger();
    }
    public void info(String args, Thread thread){
        final String str = wrappers.catchVoid(Wrappers.VoidType.SYSTEM_PRINTLN, "",ThreadUtil.generateNewThread(thread) + "(INFO/" + args + ")");
        log = new LoggerHelper() {
            @Override
            public String getLogger() {
               return str;
        }
        };
        System.out.println(str);
    }
    public void warn(String args, Thread thread){
        String yellow = "\033[0;93m";
        final String str = wrappers.catchVoid(Wrappers.VoidType.SYSTEM_PRINTLN, "",ThreadUtil.generateNewThread(thread) + "(WARN/" + args + yellow + ")");
        log = new LoggerHelper() {
            @Override
            public String getLogger() {
                return str;
            }
        };
        System.out.println(str);
    }
    public void critical(String args, Thread thread){
        String red = "\033[0;91m";
        final String str = wrappers.catchVoid(Wrappers.VoidType.SYSTEM_PRINTLN, "",ThreadUtil.generateNewThread(thread) + "(CRITICAL/" + args + red + ")");
        log = new LoggerHelper() {
            @Override
            public String getLogger() {
                return str;
            }
        };
        System.out.println(str);
    }
    public void debug(String args, Thread thread) {
        String cyan = "\033[0;96m";
        final String str = wrappers.catchVoid(Wrappers.VoidType.SYSTEM_PRINTLN, "", ThreadUtil.generateNewThread(thread) + "(DEBUG/" + args + cyan + ")");
        log = new LoggerHelper() {
            @Override
            public String getLogger() {
                return str;
            }
        };
        System.out.println(str);

    }
    public void log() {
        wrappers.createNewTextFile("log.txt", log.getLogger());
    }
    private static abstract class LoggerHelper {
        public abstract String getLogger();
    }

}

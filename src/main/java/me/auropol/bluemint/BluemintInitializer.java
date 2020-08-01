package me.auropol.bluemint;
import me.auropol.bluemint.primitive.Container;
import me.auropol.bluemint.primitive.Wrapper;
import me.auropol.bluemint.util.Thread;
import me.auropol.bluemint.util.Logger;
import me.auropol.bluemint.util.Map;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class BluemintInitializer {
    public static String VERSION = "0.1-SNAPSHOT";
    public static String NAME = "Bluemint Library";
    public static String CREDITS = "Auropol";
    public static LocalDateTime date = LocalDateTime.now();
    private static String currentDate() {
        int minutes = date.getMinute();
        int hours = date.getHour();
        int days = date.getDayOfMonth();
        int months = date.getMonth().getValue();
        int years = date.getYear();
        return Integer.toString(minutes) + hours + days + months + years;
    }

    public void init() {
        StringWriter strWriter = new StringWriter();
        Thread thread = new Thread() {

            @Override
            public String name() {
                return "BLUEMINT";
            }
        };
        Logger.manage().info("You are Running " + NAME + VERSION + "by" + CREDITS, thread);
        try {
        Logger.manage().debug("Starting......", thread);
        } catch(Exception exc) {
            exc.printStackTrace(new PrintWriter(strWriter));
            String problem = strWriter.toString();
            Logger.manage().critical(currentDate() + cause() + "://" + problem, thread);
            Container.manage().createNewTextFile("crash-log-" + currentDate() + ".txt", currentDate() + cause() + "://" + problem);
        throw new NullPointerException(cause());
        }
    }
    public String cause() {
        int nextCause = Wrapper.wrap().pickRandomlyFromRange(1, 6);
        String cause1 = Map.assignToFrom("I will fix it soon !", 1, nextCause);
        String cause2 = Map.assignToFrom("I feel sorry for you", 2, nextCause);
        String cause3 = Map.assignToFrom("Blew my processing unit !", 3, nextCause);
        String cause4 = Map.assignToFrom("Unacceptable !", 4 , nextCause);
        String cause5 = Map.assignToFrom("I promise I wont do that next time !", 5, nextCause);
        String cause6 = Map.assignToFrom("Who made this low-tier code ?!", 6, nextCause);
        return cause1 + cause2 + cause3 + cause4 + cause5 + cause6;
    }
}

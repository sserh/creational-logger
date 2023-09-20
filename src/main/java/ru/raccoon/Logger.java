package ru.raccoon;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;

    public void log(String msg) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss:SSS");
        System.out.println("[" + dateFormat.format(new Date()) + " " + num++ + "] " + msg);
    }

    private static Logger logger;
    private Logger() {}
    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

}

package ru.raccoon;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        for (int value:
             source) {
            if (value >= treshold) {
                result.add(value);
                logger.log("Значение " + value + " прошло фильтрацию и добавлено в результирующий список.");
            } else {
                logger.log("Значение " + value + " не прошло фильтрацию и не было добавлено в результирующий список.");
            }
        }

        return result;
    }
}

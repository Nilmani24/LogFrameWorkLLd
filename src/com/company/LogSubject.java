package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogSubject {
    Map<Integer, List<LogObserver>> map = new HashMap<>();

    public void addLogObserver(int level , LogObserver logObserver){
        if(map.containsKey(level)){
            map.get(level).add(logObserver);
        }else {
            List<LogObserver> logObservers = new ArrayList<>();
            logObservers.add(logObserver);
            map.put(level, logObservers);
        }
    }

    public void notifyAllObservers(int level, String message){
        for(LogObserver logObserver : map.get(level)){
            logObserver.log(message);
        }
    }
}

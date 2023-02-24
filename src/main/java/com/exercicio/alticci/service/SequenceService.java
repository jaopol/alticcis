package com.exercicio.alticci.service;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

@Service
public class SequenceService {

    private static final Integer _0 = 0;
    private static final Integer _1 = 1;
    private static final Integer _2 = 2;
    private static final Integer _3 = 3;

    private static Map cacheMap = new HashMap<Integer, Integer>();
    public int getAlticciSequence(Integer number) {

        if (Boolean.TRUE.equals(CollectionUtils.isEmpty(cacheMap))
            || Boolean.FALSE.equals(cacheMap.containsKey(number))){
            cacheMap.put(number, calculateSequence(number));
        }
        return (int) cacheMap.get(number);
    }

    private Integer calculateSequence(Integer number) {

        switch (number){
            case 0:
                return _0;
            case 1, 2:
                return _1;
        }
        return (number - _3) + (number - _2);
    }
}

package com.example.demo.helper;

import com.example.demo.helper.annotation.Pattern;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PatternFactory<T> implements ApplicationContextAware {

    private static Map<String, Class> STRATEGY_MAP = new HashMap<>();

    public static Object get(String type) {
        return STRATEGY_MAP.get(type);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, Object> beanMap = applicationContext.getBeansWithAnnotation(Pattern.class);
        beanMap.forEach((k, v) -> {
            Class<T> strategyClass = (Class) v.getClass();
            String type = strategyClass.getAnnotation(Pattern.class).value();
            STRATEGY_MAP.put(type, strategyClass);
        });
    }
}

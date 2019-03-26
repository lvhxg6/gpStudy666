package com.g6.study.pattern.observer.events.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author hx
 * @Date 2019/3/26 10:04 PM
 * @Version 1.0
 * @Description TODO
 */

public class EventListener {

    protected Map<String,Event> events = new HashMap<String,Event>();

    public void addListener(String eventType,Object target){
        try {
            this.addListener(
                    eventType,
                    target,
                    target.getClass().getMethod("on" + toUpperFirstCase(eventType),Event.class)
            );
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addListener(String eventType, Object target, Method callback){
        events.put(eventType,new Event(target,callback));
    }

    private void trigger(Event event){
        event.setSource(this);
        event.setTime(System.currentTimeMillis());

        try{
            if(event.getCallback()!=null){
                event.getCallback().invoke(event.getTarget(),event);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected void trigger(String trigger){
        if(!this.events.containsKey(trigger))return;
        trigger(this.events.get(trigger).setTrigger(trigger));
    }

    //逻辑处理的私有方法，首字母大写
    private String toUpperFirstCase(String str){
        char[] chars = str.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }


}

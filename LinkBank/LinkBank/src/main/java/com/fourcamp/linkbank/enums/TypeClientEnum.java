package com.fourcamp.linkbank.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum TypeClientEnum {
    BASIC("0"),
    SUPER("1"),
    PREMIUM("2");


    public String key;
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    TypeClientEnum(String key){
        this.key = key;
    }
    private static final Map<String, TypeClientEnum> lookup = new HashMap<String, TypeClientEnum>();
    static {
        for(TypeClientEnum x : EnumSet.allOf(TypeClientEnum.class))
            lookup.putIfAbsent(x.getKey(), x);
    }
    public static TypeClientEnum get(String key) {
        return lookup.get(key);

    }
}

package com.javaproject;

import java.time.ZoneId;
import java.util.Set;

public class Test09 {
    public static void main(String[] args) {
        //获取所有时区的名称
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);

        //获取当前系统的默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        //获取指定的市区
        ZoneId zoneId2 = ZoneId.of("Europe/Berlin");
        System.out.println(zoneId2);
    }
}

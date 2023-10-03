package com.dewey.design_patterns.type.structure.flyweight;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author dewey
 * @date 2023/10/3 17:45
 * @function 功能描述
 */
public class FlyWeightPattern {

    public static void main(String[] args) {
        //创建多个marker对象，里面的参数BaseMessage相同时使用共享的方式
        Marker marker1 = new Marker(new BigDecimal(10),new BigDecimal(30),BaseMessageFactory.getBaseMessage("xx","xxxtip"));
        Marker marker2 = new Marker(new BigDecimal(60),new BigDecimal(80),BaseMessageFactory.getBaseMessage("xx","xxxtip"));
        System.out.println(marker1.toString());
        System.out.println(marker2.toString());
    }
}

class Marker{
    private BigDecimal lat;
    private BigDecimal lon;
    private BaseMessage baseMessage;

    public Marker(BigDecimal lat, BigDecimal lon, BaseMessage baseMessage) {
        this.lat = lat;
        this.lon = lon;
        this.baseMessage = baseMessage;
    }

    @Override
    public String toString() {
        return "Marker{" +
                "lat=" + lat +
                ", lon=" + lon +
                ", baseMessage=" + baseMessage.toString() +
                '}';
    }
}

class BaseMessageFactory{
    //使用map存放已经创建的对象，供其他线程创建时复用
    private static Map<String,BaseMessage> map = new ConcurrentHashMap<>();
    public static BaseMessage getBaseMessage(String title,String tip){
        if(map.containsKey(title)){
            return map.get(title);
        }
        BaseMessage baseMessage = new BaseMessage(title,tip);
        map.put(title,baseMessage);
        return baseMessage;
    }
}


class BaseMessage{
    //字段使用final修饰，创建后不可改变值
    private final String title;
    private final String tip;

    BaseMessage(String title, String tip) {
        System.out.println("create BaseMessage:"+title);
        this.title = title;
        this.tip = tip;
    }


    @Override
    public String toString() {
        return "BaseMessage{" +
                "title='" + title + '\'' +
                ", tip='" + tip + '\'' +
                '}';
    }
}

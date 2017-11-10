package com.wangshen.base.utils;

/**
 * Created by wangwenzhang on 2017/6/8.
 */
public class TimeUtils {
    public static String longTime(long time){
        String timer=null;
        if (time<3600000){
            if (time/60000==0){
                timer="刚刚";
            }else {
                timer=time/60000+"分钟前";
            }
        }else if (3600000<=time&time<86400000){
            timer=time/3600000+"小时前";
        }else {
            timer=time/86400000+"天前";
        }
        return timer;
    }
}

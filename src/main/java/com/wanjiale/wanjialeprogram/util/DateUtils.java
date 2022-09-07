package com.wanjiale.wanjialeprogram.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateUtils {

    public static final long TIMEZONE = 8*60*60*1000;
    private static String DATE_REGEX = "^([1-9]\\d{3}-)(([0]{0,1}[1-9]-)|([1][0-2]-))(([0-3]{0,1}[0-9]))$";

    /**
     * ⽇期转换成字符串
     *
     * @param date
     * @return str
     */
    public static String dateToStr(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINESE);
        return format.format(date);
    }

    /**
     * 字符串转换成⽇期
     *
     * @param str
     * @return date
     */
    public static Date StrToDate(String str, String fmt) {
        SimpleDateFormat format = new SimpleDateFormat(fmt, Locale.CHINESE);
        Date date = null;
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static String timeStampToDate(Long time) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//要转换的时间格式
        return formatter.format(new Date(time));
    }

    public static boolean isDateVail(String dateStr) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        boolean flag = true;
        try {
            //Java 8 新添API 用于解析日期和时间
            LocalDateTime.parse(dateStr, dtf);
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    public static Date date8(Date date){
        return new Date(date.getTime() - TIMEZONE);
    }
}

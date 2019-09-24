package com.sysu.goingpub.utils;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String MILLISECOND_PATTERN = "yyyy-MM-dd HH:mm:ss SSS";
    public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";
    public static final String DATE_PATTERN_YYYYMMDD = "yyyyMMdd";
    public static final String DEFAULT_DATE_SLASH_PATTERN = "yyyy/MM/dd";
    public static final String CHINESE_DEFAULT_DATE_PATTERN = "yyyy年MM月dd日";
    public static final String CHINESE_DEFAULT_DATETIME_PATTERN = "yyyy年MM月dd日 HH:mm";
    public static final String DEFAULT_DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String timePattern = "HH:mm";
    public static final String DEFAULT_DATE_HH_MM_SLASH_PATTERN = "yyyy/MM/dd HH:mm";
    public static final String DEFAULT_DATE_TIME_PATTERN_WITHOUTSEC = "yyyy-MM-dd HH:mm";
    public static final String CHINESE_MONTH_DAY_DATE_PATTERN = "MM月dd日";
    public static final String CHINESE_YEAR_MONTH_DATE_PATTERN = "yyyy年MM月";
    public static final String DATE_PATTERN_YYYYMM = "yyyyMM";
    public static final String NOTICE_DATE_PATTERN = "yyyy.MM.dd";
    public static final String CHINESE_DEFAULT_DATE_TIME_PATTERN = "yyyy年MM月dd日HH时mm分";
    private static final ThreadLocal<SimpleDateFormat> dft = new ThreadLocal<SimpleDateFormat>() {
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };
    public static final ThreadLocal<SimpleDateFormat> SDF_DEFAULT = new ThreadLocal<SimpleDateFormat>() {
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };
    public static final ThreadLocal<SimpleDateFormat> SDF_DEFAULT_DAY = new ThreadLocal<SimpleDateFormat>() {
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };

    public DateUtil() {
    }

    public static Date formatDate(String format, String strDate) throws ParseException {
        return (new SimpleDateFormat(format)).parse(strDate);
    }

    public static String formatDate(Date date) {
        if (date == null) {
            return "";
        } else {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return df.format(date);
        }
    }

    public static Date formatDate(Integer statisDay) {
        if (statisDay == null) {
            return null;
        } else {
            String statisDayStr = String.valueOf(statisDay);
            if (statisDayStr.length() != 8) {
                return null;
            } else {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");

                try {
                    Date date = formatter.parse(statisDayStr);
                    return date;
                } catch (Exception var4) {
                    return null;
                }
            }
        }
    }

    public static String formatDateByPattern(Date date, String pattern) {
        if (null != pattern && !"".equals(pattern) && date != null) {
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            return df.format(date);
        } else {
            return "";
        }
    }

    public static String getWeekOfDate(Date dt) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        int w = cal.get(7) - 1;
        if (w < 0) {
            w = 0;
        }

        return String.valueOf(w);
    }

    public static long getNumberOfHours(Date startDay, Date endDay) {
        return (endDay.getTime() - startDay.getTime()) / 3600000L;
    }

    public static String formatDateToString(Date date, String pattern) {
        if (date == null) {
            return "";
        } else {
            SimpleDateFormat f = new SimpleDateFormat(pattern);
            return f.format(date);
        }
    }

    public static Date parseDateTime(String dateStr) {
        return parse(dateStr, "yyyy-MM-dd HH:mm:ss");
    }

    public static Date parse(String dateStr, String format) {
        Date date = null;
        if (null != dateStr && !"".equals(dateStr)) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat(format);
                date = sdf.parse(dateStr);
            } catch (ParseException var4) {
            }
        }

        return date;
    }

    public static Date getTomorrowDay(Date date) {
        Date tomorrow = addDay(date, 1);
        return getTimeOf000000(tomorrow);
    }

    public static int differentDays(Date start, Date end) {
        if (start != null && end != null) {
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(start);
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(end);
            int day1 = cal1.get(6);
            int day2 = cal2.get(6);
            int year1 = cal1.get(1);
            int year2 = cal2.get(1);
            if (year1 == year2) {
                return day2 - day1;
            } else {
                int timeDistance = 0;

                for(int i = year1; i < year2; ++i) {
                    if ((i % 4 != 0 || i % 100 == 0) && i % 400 != 0) {
                        timeDistance += 365;
                    } else {
                        timeDistance += 366;
                    }
                }

                return timeDistance + (day2 - day1);
            }
        } else {
            return -1;
        }
    }

    public static Date setDay(Date date, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, calendar.get(5) + days);
        Date endDate = null;

        try {
            endDate = ((SimpleDateFormat)dft.get()).parse(((SimpleDateFormat)dft.get()).format(calendar.getTime()));
        } catch (ParseException var5) {
        }

        return endDate;
    }

    public static Date getFirstDayOfMonth() {
        Calendar ca = Calendar.getInstance();
        ca.set(5, 1);
        Date endDate = null;

        try {
            endDate = ((SimpleDateFormat)dft.get()).parse(((SimpleDateFormat)dft.get()).format(ca.getTime()));
        } catch (ParseException var3) {
        }

        return endDate;
    }

    public static Date getFirstDayOfCurrYear() {
        Calendar currCal = Calendar.getInstance();
        int currentYear = currCal.get(1);
        return getFirstDayOfYear(currentYear);
    }

    public static Date getLastDayOfCurrYear() {
        Calendar currCal = Calendar.getInstance();
        int currentYear = currCal.get(1);
        return getLastDayOfYear(currentYear);
    }

    public static Date getFirstDayOfYear(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(1, year);
        Date currYearFirst = calendar.getTime();
        return currYearFirst;
    }

    public static Date getLastDayOfYear(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(1, year);
        calendar.roll(6, -1);
        Date currYearLast = calendar.getTime();
        return currYearLast;
    }

    public static Date getMondayOfThisWeek() {
        Calendar ca = Calendar.getInstance();
        int day_of_week = ca.get(7) - 1;
        if (day_of_week == 0) {
            day_of_week = 7;
        }

        ca.add(5, -day_of_week + 1);

        try {
            return ((SimpleDateFormat)dft.get()).parse(((SimpleDateFormat)dft.get()).format(ca.getTime()));
        } catch (ParseException var3) {
            return null;
        }
    }

    public static Date getTimeOf000000(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(11, 0);
        cal.set(12, 0);
        cal.set(13, 0);
        cal.set(14, 0);
        cal.add(5, 0);
        return cal.getTime();
    }

    public static Date getTimeOf235959(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(11, 23);
        cal.set(12, 59);
        cal.set(13, 59);
        return cal.getTime();
    }

    public static Date getTimeOf23595900(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(11, 23);
        cal.set(12, 59);
        cal.set(13, 59);
        cal.set(14, 0);
        return cal.getTime();
    }

    public static Date getCurrentDate() {
        return new Date(System.currentTimeMillis());
    }

    public static String getDateShort(Date currentTime) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(currentTime);
    }

    public static String getDateShortYYYYMMdd(Date currentTime) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        return formatter.format(currentTime);
    }

    public static Date getNowDateShort(Date currentTime) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(currentTime);
        Date currentTime_2 = null;

        try {
            currentTime_2 = formatter.parse(dateString);
        } catch (ParseException var5) {
            var5.printStackTrace();
        }

        return currentTime_2;
    }

    public static Date addDay(Date date, int num) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, num);
        return calendar.getTime();
    }

    public static int differentMinute(Date start, Date end) {
        if (start != null && end != null) {
            long from = start.getTime();
            long to = end.getTime();
            int minutes = (int)((to - from) / 60000L);
            return minutes;
        } else {
            return -1;
        }
    }

    public static int differentSecond(Date start, Date end) {
        if (start != null && end != null) {
            long from = start.getTime();
            long to = end.getTime();
            int minutes = (int)((to - from) / 1000L);
            return minutes;
        } else {
            return -1;
        }
    }

    public static Date getTimeByMinute(Date date, Integer minute) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(12, -minute);
        return calendar.getTime();
    }

    public static int getSecondTimestampTwo(Date date) {
        if (null == date) {
            return 0;
        } else {
            String timestamp = String.valueOf(date.getTime() / 1000L);
            return Integer.valueOf(timestamp);
        }
    }

    public static boolean compareDate(Date start, String end) {
        boolean after = true;
        if (end != null && !"".equals(end) && start != null) {
            Date endDate = parseDateTime(end);
            if (start.before(endDate)) {
                after = false;
            }

            return after;
        } else {
            return after;
        }
    }

    public static String intgerFormatString2(Integer statisDay) {
        if (statisDay == null) {
            return "";
        } else {
            String statisDayStr = String.valueOf(statisDay);
            if (statisDayStr.length() != 8) {
                return "";
            } else {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
                SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy/MM/dd");

                try {
                    Date date = formatter.parse(statisDayStr);
                    return formatter2.format(date);
                } catch (Exception var5) {
                    return "";
                }
            }
        }
    }

    public static Integer formatInteger(Date date) {
        if (date == null) {
            return -1;
        } else {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");

            try {
                String dateStr = formatter.format(date);
                return Integer.valueOf(dateStr);
            } catch (Exception var3) {
                return -1;
            }
        }
    }

    public static Integer getIntegerDay(Integer statisDay, Integer days) {
        if (statisDay == null) {
            return null;
        } else {
            String statisDayStr = String.valueOf(statisDay);
            if (statisDayStr.length() != 8) {
                return null;
            } else {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");

                try {
                    Date date = formatter.parse(statisDay.toString());
                    Date yesterDay = setDay(date, days);
                    String yesterDayStr = formatter.format(yesterDay);
                    return Integer.valueOf(yesterDayStr);
                } catch (Exception var7) {
                    return null;
                }
            }
        }
    }

    public static Date getTimeOf0000(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(11, 0);
        cal.set(12, 0);
        cal.set(13, 0);
        cal.add(5, 0);
        return cal.getTime();
    }
}

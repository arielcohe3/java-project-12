package com.ariel;

public class Time1 {
    private int _hour;
    private int _minute;

    //    public void set_hour(int h) {
//     if (h >= 0 && h <= 23) {
//            _hour = h;
//        }
//    }
    public Time1(int h, int m) {
        setHour (h);
        setMinute(m);
    }

    public Time1(Time1 t) {
        _hour = t.getHour();
        _minute = t.getMinute();
    }

    public boolean equals(Time1 other) {
        if ((_hour == other._hour) && (_minute == other._minute))
            return true;
        else
            return false;
    }

    public void print_minute() {//tha name of the method id(print_minute)
        System.out.println(_minute);
    }

    public void print_hour() {
        System.out.println(_hour);
    }

    public void setHour(int h) {
        if (h >= 0 && h < 24)
            _hour = h;
    }

    public void setMinute(int m) {
        if (m >= 0 && m < 60)
            _minute = m;
    }

    public int getHour() {
        return _hour;
    }

    public int getMinute() {
        return _minute;
    }

    public boolean before(Time1 other) {
        if ((_hour * 60) + _minute > (other._hour * 60) + other._minute) {
            return true;
        }
        else
            return false;
    }

    public boolean after(Time1 other) {
        if (equals(other))
            return false;
        else
            return !before(other);
    }

    private int getTotalMinute(){
        return ((_hour*60)+_minute);
    }

    public int difference(Time1 other){
        int minute1 = getTotalMinute();//((_hour*60)+_minute);
        int minute2 = other.getTotalMinute();//((other._hour*60)+other._minute);
        return minute1-minute2;
    }



    public int minFromMidnight() {
      return (_hour * 60) + _minute;
    }

    public String toString() {
        return _hour + ":" + _minute;
    }
}


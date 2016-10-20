package com.bily.tenth;



/**
 * 10.1
 * 表示时间的数据域 hour minute second
 * 一个以当前时间的无参构造函数
 * 一个从1970年1月1日午夜开始，特定流逝时间的构造函数
 * 一个指定 时 分 秒的构造函数
 * 三个数据域hour minute second 的get方法
 * 一个名为setTime的方法使用流逝时间给对象设置一个新时间
 * @author Administrator
 *
 */
public class Time {
	private long hour;
	private long minute;
	private long second;
	public Time(){
		this(System.currentTimeMillis());
	}
	public Time(long time){
		second = (time / 1000) % 60;
		minute = (time / 1000 / 60) % 60;
		hour = (time / 1000 / 60 / 60) % 24;
	}
	public long getHour() {
		return hour;
	}
	public long getMinute() {
		return minute;
	}
	public long getSecond() {
		return second;
	}
	public Time(long hour, long minute, long second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public void setTime(long time){
		if (time > 0) {
			second = (time / 1000) % 60;
			minute = (time / 1000 / 60) % 60;
			hour = (time / 1000 / 60 / 60) % 24;
		}
	}
	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		System.out.println(t1.getHour()+":"+t1.getMinute()+":"+t1.getSecond());
		System.out.println(t2.getHour()+":"+t2.getMinute()+":"+t2.getSecond());
	}

}

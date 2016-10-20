package com.bily.tenth;



/**
 * 10.1
 * ��ʾʱ��������� hour minute second
 * һ���Ե�ǰʱ����޲ι��캯��
 * һ����1970��1��1����ҹ��ʼ���ض�����ʱ��Ĺ��캯��
 * һ��ָ�� ʱ �� ��Ĺ��캯��
 * ����������hour minute second ��get����
 * һ����ΪsetTime�ķ���ʹ������ʱ�����������һ����ʱ��
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

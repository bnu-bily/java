package com.bily.eighth;

/**
 * 8.8风扇类 设计一个风扇类 三个名为 SLOW MEDIUM FAST 值为 1 2 3的常量表示风扇的速度
 * 一个名为speed的int类型私有数据域表示风扇的速度 一个名为on的boolean类型私有数据域表示风扇是否打开
 * 一个名为radius的double类型私有数据域表示风扇的半径 一个名为color的string类型数据域表示风扇的颜色 这四个数据域的get 方法 和
 * set'方法 一个名为toString的方法返回描述风扇的字符串。如果风扇没有打开，该方法就返回 “fan is off” 如果打开，就返回 速度 颜色
 * 半径 实例两个对象 设置第一个最大速度 半径10 颜色 yellow 状态打开 第二个中等速度 半径 5 颜色blue 状态关闭
 * 通过调用toString方法显示这些对象
 * 
 * @author Administrator
 *
 */
public class Fan {
	final static int SLOW = 1;
	final static int MEDIUN = 2;
	final static int FAST = 3;
	private int speed = 0;
	private boolean on = false;
	private double radius = 0.0;
	private String color = null;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if (speed == 1 || speed == 2 || speed == 3) {
			this.speed = speed;			
		}
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;			
		}
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if (color.equals("yellow") || color.equals("blue") || color.equals("red") || color.equals("green") || color.equals("white")) {
			this.color = color;			
		}
	}
	public String toString(){
		String s = new String("fan is off");
		if (this.isOn()) {
			s = "速度："+this.getSpeed()+" 颜色："+this.getColor()+" 半径："+this.getRadius();
		}
		return s;
	}
	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		fan1.setOn(true);
		fan1.setSpeed(FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		System.out.println(fan1.toString());
		
		System.out.println();
		
		fan2.setOn(false);
		fan2.setSpeed(MEDIUN);
		fan2.setRadius(5);
		fan2.setColor("blue");
		System.out.println(fan2.toString());
	}
}



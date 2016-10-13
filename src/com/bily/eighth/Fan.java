package com.bily.eighth;

/**
 * 8.8������ ���һ�������� ������Ϊ SLOW MEDIUM FAST ֵΪ 1 2 3�ĳ�����ʾ���ȵ��ٶ�
 * һ����Ϊspeed��int����˽���������ʾ���ȵ��ٶ� һ����Ϊon��boolean����˽���������ʾ�����Ƿ��
 * һ����Ϊradius��double����˽���������ʾ���ȵİ뾶 һ����Ϊcolor��string�����������ʾ���ȵ���ɫ ���ĸ��������get ���� ��
 * set'���� һ����ΪtoString�ķ��������������ȵ��ַ������������û�д򿪣��÷����ͷ��� ��fan is off�� ����򿪣��ͷ��� �ٶ� ��ɫ
 * �뾶 ʵ���������� ���õ�һ������ٶ� �뾶10 ��ɫ yellow ״̬�� �ڶ����е��ٶ� �뾶 5 ��ɫblue ״̬�ر�
 * ͨ������toString������ʾ��Щ����
 * 
 * @author Administrator
 *
 */
public class Fan {
	final static int SLOW = 1;
	final static int MEDIUN = 2;
	final static int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if (speed == SLOW || speed == MEDIUN || speed == FAST) {
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
		if (this.isOn()) {
			return "�ٶȣ�"+this.getSpeed()+" ��ɫ��"+this.getColor()+" �뾶��"+this.getRadius();
		}
		return "fan is off";
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



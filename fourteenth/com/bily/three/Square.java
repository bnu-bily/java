package com.bily.three;


/**
 * 14.3
 * ���һ����ΪColorable�Ľӿڣ������� howToColor() ��  ���� ���һ��Square�� ��չGeometricObjeut
 * ʵ��howToColor��������ʾ��Ϣ "Color all four sides"
 * 
 * ��д���Գ��򣬴���2��Geometric��������飬��������ÿ��������ԣ�����ǿ���ɫ�ģ��Ǿ͵���howToColor����
 * @author bily
 *
 */
public class Square extends TempGeo {
	private double side;
	
	public Square(double side,boolean filled) throws RuntimeException{
		if (side > 0) {
			this.side = side;
			super.setFilled(filled);			
		} else {
			throw new RuntimeException();
		}
	}
	
	public double getArea(){
		return side * side ;
	}
	
	public double getPerimeter(){
		return side * 4;
	}
	
	public String howToColor(){
		return "Color all four sides";
	}
	public static void main(String[] args) {
		TempGeo[] tgObj = new TempGeo[2];
		
		tgObj[0] = new Square(2, true);
		tgObj[1] = new Square(9, false);
		
		for (int i = 0; i < tgObj.length; i++) {
			if (tgObj[i].isFilled()) {//�и���������
				System.out.println(tgObj[i].howToColor());
			}
		}
	}

}

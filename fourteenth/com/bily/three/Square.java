package com.bily.three;


/**
 * 14.3
 * 设计一个名为Colorable的接口，其中有 howToColor() 的  方法 设计一个Square类 扩展GeometricObjeut
 * 实现howToColor方法，显示消息 "Color all four sides"
 * 
 * 编写测试程序，创建2个Geometric对象的数组，对数组中每个对象而言，如果是可着色的，那就调用howToColor方法
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
			if (tgObj[i].isFilled()) {//有父类编程问题
				System.out.println(tgObj[i].howToColor());
			}
		}
	}

}

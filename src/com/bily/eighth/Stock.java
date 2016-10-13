package com.bily.eighth;
/**
 * һ����Ϊsymbol���ַ����������ʾ��Ʊ����
 * һ����Ϊname���ַ����������ʾ��Ʊ����
 * һ����ΪpreviousClosingPrice��double�����������洢����ǰһ�յĹ�Ʊֵ
 * һ����ΪcurrentPrice��double�����������洢���ǵ�ʱ�Ĺ�Ʊֵ
 * ����һ�����ض���������ֵĹ�Ʊ�Ĺ��췽��
 * һ����ΪgetChangePrecent()�ķ������ش�previousClosingPrice�仯��currentPrice�İٷֱ�
 * ����һ��Stock�������Ĺ�Ʊ������JAVA ��Ʊ������Sun Microsystems Inc 
 * ǰһ�����̼�4.5
 * ���õ�ǰֵΪ4.35
 * Ȼ����ʾ�仯�İٷֱ�
 * @author Administrator
 *
 */
public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	private Stock() {
		
	}
	public Stock(String symbol,String name){
		this.symbol = symbol;
		this.name = name;
	}
	
	public double getPreviousClosingPrice() {
		if (previousClosingPrice != 0) {
			return previousClosingPrice;			
		} 
		return 1.0;
	}

	public void setPreviousClosingPrice(double previousClosingPrice) {
		if (previousClosingPrice > 0) {
			this.previousClosingPrice = previousClosingPrice;			
		}
	}

	public double getCurrentPrice() {
		if (currentPrice != 0) {
			return currentPrice;			
		}
		return 1;
	}

	public void setCurrentPrice(double currentPrice) {
		if (currentPrice > 0) {
			this.currentPrice = currentPrice;			
		}
	}

	public double getChangePercent(){
		return (this.getCurrentPrice() - this.getPreviousClosingPrice()) / this.getPreviousClosingPrice();
	}
	public static void main(String[] args) {
		Stock stock = new Stock("Java", "Sun Microsystems Inc");
		stock.setPreviousClosingPrice(4.5);
		stock.setCurrentPrice(4.35);
		System.out.println(100*stock.getChangePercent()+"%");
	}

}

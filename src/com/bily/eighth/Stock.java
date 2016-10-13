package com.bily.eighth;
/**
 * 一个名为symbol的字符串数据域表示股票代码
 * 一个名为name的字符串数据域表示股票名字
 * 一个名为previousClosingPrice的double型数据域，它存储的是前一日的股票值
 * 一个名为currentPrice的double型数据域，它存储的是当时的股票值
 * 创建一个有特定代码和名字的股票的构造方法
 * 一个名为getChangePrecent()的方法返回从previousClosingPrice变化到currentPrice的百分比
 * 创建一个Stock对象，它的股票代码是JAVA 股票名字是Sun Microsystems Inc 
 * 前一日收盘价4.5
 * 设置当前值为4.35
 * 然后显示变化的百分比
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

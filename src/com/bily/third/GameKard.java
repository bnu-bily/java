package com.bily.third;
/*
 * 3.24
 * **/
public class GameKard {

	public static void main(String[] args) {
		int cardNum = (int)System.currentTimeMillis() % 52 ;
		System.out.print("The card you picked is ");
		int cardColor = cardNum / 13;
		cardNum = cardNum % 13;
		switch(cardNum){
		case 0:
			System.out.print("Ace");
			break;
		case 1:
			System.out.print("2");
			break;
		case 2:
			System.out.print("3");
			break;
		case 3:
			System.out.print("4");
			break;
		case 4:
			System.out.print("5");
			break;
		case 5:
			System.out.print("6");
			break;
		case 6:
			System.out.print("7");
			break;
		case 7:
			System.out.print("8");
			break;
		case 8:
			System.out.print("9");
			break;
		case 9:
			System.out.print("10");
			break;
		case 10:
			System.out.print("Jack");
			break;
		case 11:
			System.out.print("Queen");
			break;
		case 12:
			System.out.print("King");
			break;
		default:
			break;
		}
		
		if (cardColor == 0) {
			System.out.print(" of Clubs");
		}else if (cardColor == 1) {
			System.out.print(" of Diamond");
		}else if(cardColor == 2){
			System.out.print(" of Heart");
		}else if (cardColor == 3) {
			System.out.print(" of Spades");
		}
	}

}

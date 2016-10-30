package com.bily.seventeen;

import java.math.BigInteger;

@SuppressWarnings("serial")
public class Rational extends Number{

	private BigInteger numerator;
	private BigInteger denominator;
	
	public Rational(){
		this(0,1);
	}
	
	public Rational(long numerator, long denominator){
		long gcd = gcd(numerator,denominator);
		this.numerator = new BigInteger((((denominator > 0) ?  1 : -1) * numerator / gcd) + "");
		this.denominator = new BigInteger((Math.abs(denominator) / gcd) + "");
	}
	
	private static long gcd(long n, long d){
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;
		
		for (int i = 1; i <= n1 && i <= n2 ; i++) {
			if (n1 % i == 0 && n2 % i == 0 ) {
				gcd = i;
			}
		}
		return gcd;
	}
	
	public long getNumerator(){
		return numerator.longValue();
	}
	
	public long getDenominator(){
		return denominator.longValue();
	}
	
	public Rational add(Rational secondRational){
		long n = numerator * secondRational.getDenominator() + denominator * secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n,d);
	}
	
	public Rational subtract(Rational secondRational){
		long n = numerator * secondRational.getDenominator() - denominator * secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n,d);
	}
	
	public Rational multiply(Rational secondRational){
		long n = numerator * secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n,d);
	}
	
	public Rational divade(Rational secondRational){
		long n = numerator * secondRational.getDenominator();
		long d = denominator * secondRational.getNumerator();
		return new Rational(n,d);

	}
	
	public String toString(){
		if (denominator.longValue() == 1) {
			return numerator.longValue() + "";
		} else {
			return numerator.longValue() + " / " + denominator.longValue();
		}
	}
	
	public int intValue() {	
		return (int)doubleValue();
	}
	
	public long longValue() {		
		return (long)doubleValue();
	}
	
	public float floatValue() {	
		return (float)floatValue();
	}
	
	public double doubleValue() {
		return numerator.longValue() * 1.0 / denominator.longValue();
	}

}

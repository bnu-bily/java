package com.bily.seventeen;


@SuppressWarnings("serial")
public class Rational extends Number{

	private long numerator;
	private long denominator;
	
	public Rational(){
		this(0,1);
	}
	
	public Rational(long numerator, long denominator){
		long gcd = gcd(numerator,denominator);
		this.numerator = ((denominator > 0) ?  1 : -1) * numerator / gcd;
		this.denominator = Math.abs(denominator) / gcd;
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
		return numerator;
	}
	
	public long getDenominator(){
		return denominator;
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
		if (denominator == 1) {
			return numerator + "";
		} else {
			return numerator + " / " + denominator;
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
		return numerator * 1.0 / denominator;
	}

}

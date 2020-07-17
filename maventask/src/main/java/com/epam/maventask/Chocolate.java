package com.epam.maventask;

public class Chocolate extends Sweets{
String type;
Chocolate(int n, int c, int w, String type){
	super(n,c,w);
	this.type = type;
}
public String toString() {
	return "Cost: "+this.c+" Weight: "+this.w+" Total Number: "+this.n;
}
}
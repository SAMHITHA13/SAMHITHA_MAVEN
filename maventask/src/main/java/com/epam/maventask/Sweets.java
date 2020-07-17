package com.epam.maventask;

public class Sweets {
int n, c, w;
Sweets(int n, int c, int w){
	this.n = n;
	this.c = c;
	this.w = w;
}
public String toString() {
	return "Cost: "+this.c+"Weight: "+this.w+"Total Number: "+this.n;
}
}
package com.epam.maventask;

import java.util.Comparator;

public class Sort implements Comparator<Chocolate>{
int opt;
Sort(int n){
	this.opt = n;
}
public int compare(Chocolate ch1, Chocolate ch2) {
	switch(opt)
	{
	case 1:return ch1.c-ch2.c;
	case 2:return ch1.w-ch2.w;
	case 3:return ch1.n-ch2.n;
	}
	return 0;
}
}
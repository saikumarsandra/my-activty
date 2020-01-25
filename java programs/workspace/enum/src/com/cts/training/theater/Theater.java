package com.cts.training.theater;

public enum Theater {
	SOFA,
	BALCONY,
	FRONTSEAT;
private int rate;
 private Theater() {
	 this.rate=50;
 }

public int  getrate() {
	
	if(this==SOFA)
	{
		return 100;
	}
	else if(this==BALCONY)
	{
		return 130;
	}
	if(this==FRONTSEAT)
	{
		return 50;
	}
	return 0;
}
}
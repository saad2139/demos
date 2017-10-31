package com.revature.Homework1.Q15;

public class Pair implements Operations<Pair>{
	private int x;
	private int y;
	public Pair() {
		setX(0);
		setY(0);
	}
	Pair(int a,int b){
		setX(a);
		setY(b);
	}
	public int getX() {
		return x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public String toString() {
		return "[" + getX() + "," + getY() + "]";
	}
	@Override
	public Pair addition(Pair arg0, Pair arg1) {
		return new Pair(arg0.getX()+arg1.getX(),arg0.getY()+arg1.getY());
	}
	@Override
	public Pair subtraction(Pair arg0, Pair arg1) {
		return new Pair(arg0.getX()-arg1.getX(),arg0.getY()-arg1.getY());
	}
	@Override
	public Pair multiplication(Pair arg0, Pair arg1) {
		return new Pair(arg0.getX()*arg1.getX(),arg0.getY()*arg1.getY());
	}
	@Override
	public Pair division(Pair arg0, Pair arg1) {
		return new Pair(arg0.getX()/arg1.getX(),arg0.getY()/arg1.getY());
	}
}

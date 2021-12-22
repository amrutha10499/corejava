package com.xworkz.Radio.dto;

public class SizeDTO {
	
	private float Height;
	private float Length;
	private double Width;
	
	
	public float getHeight() {
		return Height;
	}
	public void setHeight(float height) {
		Height = height;
	}
	public float getLength() {
		return Length;
	}
	public void setLength(float length) {
		Length = length;
	}
	public double getWidth() {
		return Width;
	}
	public void setWidth(double width) {
		Width = width;
	}
	
	public String toString() {
		return "SizeDTO [Height=" + Height + ", Length=" + Length + ", Width=" + Width + "]";
	}
	
	
	

}

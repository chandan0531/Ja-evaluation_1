package com.q3;

public class Car {
	String model;
	String companyName;
	String color;
}


class Engine {
	int rmp;
	int power;
	String manufacturer;
	Boolean hasTurbo;

public void enableTurbo(boolean value) {
	this.hasTurbo = value;
	}

}
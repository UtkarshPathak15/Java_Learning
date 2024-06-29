package com.techmojo.app;

import com.techmojo.beans.Car;
import com.techmojo.beans.Salavia;

public class CarFactory {
	public static Car getVehicle() {
		Car vehicle = new Salavia();
		return vehicle;
	}

}

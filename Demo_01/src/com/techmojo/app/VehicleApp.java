package com.techmojo.app;

import com.techmojo.beans.Car;
import com.techmojo.beans.Fortuner;
import com.techmojo.beans.Salavia;

public class VehicleApp {

	public static void main(String[] args) {
		Car vehicle = CarFactory.getVehicle();
		vehicle.turnDirection();
		vehicle.accelerate();
//		vehicle.fourWheel();
		vehicle.stop();
		vehicle.accelerate();
//		vehicle.fourWheel();
		vehicle.stop();
		
//		System.out.println(" ");
//		
//		Salavia salivia = new Salavia();
//		salivia.turnDirection();
//		salivia.accelerate();
//		salivia.sunRoof();
//		salivia.stop();
//		salivia.accelerate();
//		salivia.sunRoof();
//		salivia.stop();

	}

}

package com.techmojo.app;

import com.techmojo.beans.Entertainment;
import com.techmojo.beans.Mercedes;
import com.techmojo.beans.Vehicle;

public class MercedesApp_01 {

	public static void main(String[] args) {
		Mercedes m1 = new Mercedes();
		
		Vehicle car = m1;
		Entertainment gadget = m1;
		
		car.turn();
		car.run();
		car.stop();
		
		gadget.watchMovie();
		gadget.listenMusic();

	}

}

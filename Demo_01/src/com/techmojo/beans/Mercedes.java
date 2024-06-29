package com.techmojo.beans;

public class Mercedes implements Vehicle, Entertainment {

	@Override
	public void watchMovie() {
		System.out.println("Watch the Movie");

	}

	@Override
	public void listenMusic() {
		System.out.println("Listen to Music");

	}

	@Override
	public void turn() {
		System.out.println("Turn");

	}

	@Override
	public void run() {
		System.out.println("Run");

	}

	@Override
	public void stop() {
		System.out.println("Stop");

	}

}

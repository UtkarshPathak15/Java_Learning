package com.techmojo.beans;

public class Walkman implements MediaPlayer {

	@Override
	public void play() {
		System.out.println("Play the Walkman");

	}

	@Override
	public void pause() {
		System.out.println("Pause the Walkman");

	}

	@Override
	public void volumeUp() {
		System.out.println("Increase volume of the Walkman");

	}

	@Override
	public void volumeDown() {
		System.out.println("Increase volume of the Walkman");

	}
	
	public void equalizer() {
		System.out.println("Tune eqaulizer");
	}

}

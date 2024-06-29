package com.techmojo.beans;

public class DiskPlayer implements MediaPlayer {

	@Override
	public void play() {
		System.out.println("Play the DiskPlayer");
		
	}

	@Override
	public void pause() {
		System.out.println("Pause the DiskPlayer");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("Increase volume of DiskPlayer");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("Decrease volume of DiskPlayer");
		
	}
	
	public void DiskChange() {
		System.out.println("Chnage the disk");
	}
}

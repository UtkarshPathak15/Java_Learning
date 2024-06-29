package com.techmojo.app;

import com.techmojo.beans.DiskPlayer;
import com.techmojo.beans.MediaPlayer;
import com.techmojo.beans.Walkman;

public class MediaPlayerApp_01 {

	public static void main(String[] args) {
//		DiskPlayer player = new DiskPlayer();
//		player.play();
//		player.volumeUp();
//		player.DiskChange();
//		player.volumeUp();
//		player.DiskChange();
//		player.volumeDown();
//		player.pause();
		
		Walkman player = new Walkman();
		player.play();
		player.volumeUp();
		player.equalizer();
		player.equalizer();
		player.volumeDown();
		player.pause();
		player.play();

	}

}

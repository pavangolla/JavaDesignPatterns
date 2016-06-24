package com.designpattern.structural.adapter;

/**
 * Created by pgangadhar on 5/24/16.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
	@Override public void playVLC(String fileName) {
		System.out.println("Play VLC");
	}

	@Override public void playMp4(String fileName) {
		//do nothing
	}
}

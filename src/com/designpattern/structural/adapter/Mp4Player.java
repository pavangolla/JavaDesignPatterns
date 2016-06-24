package com.designpattern.structural.adapter;

/**
 * Created by pgangadhar on 5/24/16.
 */
public class Mp4Player implements AdvancedMediaPlayer {
	@Override public void playVLC(String fileName) {
		//do nothing
	}

	@Override public void playMp4(String fileName) {
		System.out.println("Play Mp4");
	}
}

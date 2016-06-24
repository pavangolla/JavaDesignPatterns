package com.designpattern.structural.adapter;

/**
 * Created by pgangadhar on 5/24/16.
 */
public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;

	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer = new Mp4Player();
		} else if(audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer = new VlcPlayer();
		}
	}
	@Override public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer.playVLC(fileName);
		} else if(audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer.playMp4(fileName);
		} else {
			System.out.println("Playing audio");
		}
	}
}

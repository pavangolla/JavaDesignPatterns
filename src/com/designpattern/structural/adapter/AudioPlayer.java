package com.designpattern.structural.adapter;

/**
 * Created by pgangadhar on 5/24/16.
 */

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;

	@Override public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("Mp3")) {
			System.out.println("Play Audio file " + fileName);
		} else if(audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid " + audioType + "type " + "file" + fileName);
		}
	}
}

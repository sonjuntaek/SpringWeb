package com.web.speaker;

public class SonySpeaker implements Speaker {
	public void volumeUp() {
		System.out.println("소니 스피커 소리 올려");
	}

	public void voluemDown() {
		System.out.println("소니 스피커 소리 내려");
	}
}

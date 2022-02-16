package com.web.tv;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.speaker.Speaker;

public class LGTV implements TV {
	int volume = 0;
	@Autowired
	Speaker speaker;

	public LGTV(Speaker speaker) {
		// TODO Auto-generated constructor stub
		System.out.println("엘지 티비");
		this.speaker = speaker;
	}

	public LGTV() {
		// TODO Auto-generated constructor stub
		System.out.println("엘지 티비");
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	@Override
	public void upVolume() {
		// TODO Auto-generated method stub
		System.out.println("소리올림");
		speaker.volumeUp();
	}

	@Override
	public void downVolume() {
		// TODO Auto-generated method stub
		System.out.println("소리내림");
		speaker.voluemDown();
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("티비킴");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("티비끔");
	}

	@Override
	public void setVolume(int num) {
		// TODO Auto-generated method stub
		this.volume = num;
		System.out.println("볼륨이 " + num + "으로 설정되었습니다.");
	}

	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

}

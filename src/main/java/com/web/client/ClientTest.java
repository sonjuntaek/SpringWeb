package com.web.client;

import java.util.Collection;
import java.util.Properties;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.web.tv.SamSungTV;
import com.web.tv.TV;

public class ClientTest {
	public static void main(String[] args) {

		// 1.인터페이스 미사용시. 수정 소요 많음.
//		SamSungTV samSungTV = new SamSungTV();
//		samSungTV.upSound();
//		samSungTV.downSound();
//		samSungTV.switchOn();
//		samSungTV.switchOff();

//		LGTV LgTV = new LGTV();
//		LgTV.upVolume();
//		LgTV.downVolume();
//		LgTV.turnOn();
//		LgTV.turnOff();

		// 2.인터페이스 사용시. 수정 소요 줄어듬.(
//		TV LgTV = new LGTV();
//		TV tv = new SamSungTV();
//		tv.upVolume();
//		tv.downVolume();
//		tv.turnOn();
//		tv.turnOff();

		// 3. Factory 패턴 도입. 여전히 코드 수정 필요.. 더 획기적인 방법이 있다. 개발자가 생성하는게 아닌 컨테이너가 알아서 객체
		// 생성하도록 하는 방법.
//		TVFactory tvFactory = new TVFactory();
//		TV tv = tvFactory.getTV("LG");
//		tv.upVolume();
//		tv.downVolume();
//		tv.turnOn();
//		tv.turnOff();

		// 4. IoC 적용. java 코드에서의 선언을 xml로 옮김. (컨테이너에게 위임)
		GenericXmlApplicationContext container = new GenericXmlApplicationContext("classpath:presentation.xml"); // 스프링
																													// 컨테이너
																													// 생성.
		TV tv = (TV) container.getBean("tv");
		tv.upVolume();
		tv.downVolume();
//		tv.turnOn();
//		tv.turnOff();

		SamSungTV Samsung = (SamSungTV) container.getBean("tv");
		Properties props = Samsung.getProperties();
		Collection<Object> testList = props.values();

		container.close();

	}
}

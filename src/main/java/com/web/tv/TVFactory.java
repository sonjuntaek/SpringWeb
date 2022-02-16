package com.web.tv;

public class TVFactory {

	public TV getTV(String TV_id) {

		if (TV_id.equals("LG")) {
			return new LGTV();
		}
		if (TV_id.equals("SAMSUNG")) {
			return new SamSungTV();
		}

		return null;
	}
}

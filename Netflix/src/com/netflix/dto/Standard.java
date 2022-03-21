package com.netflix.dto;

public class Standard extends MemberShip {

	public Standard() {
		super();
	}

	public Standard(String id, String nickname, String signup_date, int point) {
		super(id, nickname, signup_date, point);
	}
	@Override
	public String getMemberShip() {
		return "Stand";
	}
}

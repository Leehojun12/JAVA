package com.netflix.dto;

public class Premium extends MemberShip {
	public Premium() {
		super();
	}

	public Premium(String id, String nickname, String signup_date, int point) {
		super(id, nickname, signup_date, point);
	}
	@Override
	public String getMemberShip() {
		return "Premium";
	}
}

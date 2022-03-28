package com.instagram.exam;

public class FeedDTO {
	private int seq;
	private String title;
	private String content;
	private String nickname;
	
	public FeedDTO() {}
	
	public FeedDTO(String title, String content, String nickname) {
		this.title = title;
		this.content = content;
		this.nickname = nickname;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
	
}

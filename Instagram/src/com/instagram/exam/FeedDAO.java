package com.instagram.exam;

import java.util.ArrayList;

public class FeedDAO {
	private ArrayList<FeedDTO> feedlist = new ArrayList<FeedDTO>();

	public void insert(String title, String content, String nickname) {
		feedlist.add(new FeedDTO(title, content, nickname));
	}
	

	public ArrayList selectall() {
		
		return feedlist;
	}
}

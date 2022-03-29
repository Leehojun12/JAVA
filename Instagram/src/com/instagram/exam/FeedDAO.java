package com.instagram.exam;

import java.util.ArrayList;

public class FeedDAO {
	private ArrayList<FeedDTO> feedlist = new ArrayList<FeedDTO>();

	public void insert(String title, String content, String nickname) {
		feedlist.add(new FeedDTO(title, content, nickname));
	}
	

	public String selectall() {
		String info ="";
			for (int i=1; i<feedlist.size()+1;i++) {
				info = i +"\t"+feedlist.get(i).getNickname() +"\t"+
						feedlist.get(i).getTitle();	
			}			
		return info;
	}
	public String select(int seq) {
		String info ="";
		for(int i = 1; i< feedlist.size()+1;i++) {
			info = seq + "\t"+feedlist.get(seq).getNickname()+"\t"+
					feedlist.get(seq).getTitle() +"\t" + feedlist.get(seq).getContent();	
		}
		return info;
	}
}

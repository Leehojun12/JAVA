package com.netflix.run;

import com.netflix.dto.Basic;
import com.netflix.dto.MemberShip;
import com.netflix.dto.Premium;
import com.netflix.dto.Standard;

public class Run {
	public static void main(String[] args) {
		
		MemberShip[] list = new MemberShip[5];
		list[0] = new Basic("abc123","���ݸ�", "22012",2000);
		list[1] = new Standard("asd112","�ٴҶ�", "22013",5000);
		list[2] = new Premium("www312","�ٳ���", "22014",4000);
		for(int i=0; i< list.length;i++) {
			if(list[i] != null) {
				System.out.println(list[i].toString());				
			}
		}
	}
}

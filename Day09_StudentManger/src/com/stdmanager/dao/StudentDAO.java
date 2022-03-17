package com.stdmanager.dao;

import java.util.Scanner;

import com.stdmanager.dto.StudentDTO;

public class StudentDAO {
	 Scanner sc = new Scanner(System.in);
	private StudentDTO[] stdList = new StudentDTO[10];
	private int count = 0;
	
	public void insert(StudentDTO std) {
		stdList[count++] = std;
	}
	public StudentDTO[] seletAll() {
		return stdList;
	}
	public void modify(StudentDTO std) {
		for(int i = 0; i < stdList.length; i++) {
			if(stdList[i] !=null) {
				if(stdList[i].getNo() == std.getNo()) {
					stdList[i].setName(std.getName());
					stdList[i].setAge((std.getAge()));
					stdList[i].setGender(std.getGender());					
				}
			}
		}
	}
	public void delete(int index) {
		stdList[index - 1] = null;
	}

}

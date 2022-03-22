package com.stdmanager.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.stdmanager.dto.StudentDTO;

public class StudentDAO {
	Scanner sc = new Scanner(System.in);
	private ArrayList stdlist = new ArrayList<>();

	public void insert(StudentDTO std) {
		stdlist.add(std);
	}

	public ArrayList seletAll() {
		return stdlist;
	}

	public void modify(StudentDTO std) {
		for (int i = 0; i < stdlist.size(); i++) {
			if (((StudentDTO)stdlist.get(i)).getNo() == std.getNo()) {
					stdlist.set(i,std); // 새로운 StudentDTO 형 인스턴스로 기존 배열에서 갈아끼우는 작업
					break;
			}
		}
	}

	public boolean check(int index) {
		for (int i = 0; i < stdlist.size(); i++) {
			if (((StudentDTO)stdlist.get(i)).getNo() == index) {
				return true;
			}
		}
		return false;
	}

	public void delete(int index) {
		for (int i = 0; i < stdlist.size(); i++) {
			if (((StudentDTO) stdlist.get(i)).getNo() == index)
				stdlist.remove(index-1);
			break;
		}
	}

}

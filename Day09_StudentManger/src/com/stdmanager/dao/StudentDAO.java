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
					stdlist.set(i,std); // ���ο� StudentDTO �� �ν��Ͻ��� ���� �迭���� ���Ƴ���� �۾�
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

package com.stdmanager.dto;

public class StudentDTO {
	// ��ȣ(no)_���� �̸�(name)_���ڿ� ����(age)_���� ����(gender)_�ѱ���

	private int no;
	private String name;
	private int age;
	private String gender;

	public StudentDTO() {
	}

	public StudentDTO(int no, String name, int age, String gender) {
		this.no = no;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public int getNo() {
		return this.no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String printAll() {
		return this.no + " : " + this.name + " : " + this.age + " : " + this.gender;
	}
}

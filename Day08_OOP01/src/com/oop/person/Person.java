package com.oop.person;

public class Person {

	private int id;
	private String name;
	private String contact;

	public Person() {
	}

	public Person(int id, String name, String contact) {
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String printAll() {
		return this.id + this.name + this.contact;
	}
}

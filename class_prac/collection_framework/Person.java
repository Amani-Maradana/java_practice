package com.codegnan.collection_framework;

import java.util.Objects;

public class Person {
	private int id;
	private String name;
	private String mail;
	public Person(int id, String name, String mail) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, mail, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(mail, other.mail) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mail=" + mail + "]";
	}

}

package model;

import java.io.Serializable;

public class Contact implements Serializable{
	private int id;
	private String name;
	private String furigana;
	private String tel;
	private String mail;
	private String comment;

	public Contact() {

	}

	public Contact(String name, String furigana, String tel, String mail, String comment) {
		this.name = name;
		this.furigana = furigana;
		this.tel = tel;
		this.mail = mail;
		this.comment = comment;
	}
	
	public Contact(int id, String name, String furigana, String tel, String mail, String comment) {
		this.id = id;
		this.name = name;
		this.furigana = furigana;
		this.tel = tel;
		this.mail = mail;
		this.comment = comment;
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

	public String getFurigana() {
		return furigana;
	}

	public void setFurigana(String furigana) {
		this.furigana = furigana;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}

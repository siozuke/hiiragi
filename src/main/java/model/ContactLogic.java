package model;

import java.util.List;

import dao.ContactDAO;

public class ContactLogic {

	public void postContact(Contact contact) {
		ContactDAO dao = new ContactDAO();
		dao.create(contact);

	}

	public List<Contact> getContactList() {
		ContactDAO dao = new ContactDAO();
		return dao.read();
	}

}

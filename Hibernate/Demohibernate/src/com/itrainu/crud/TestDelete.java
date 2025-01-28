package com.itrainu.crud;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.itrainu.User.UserDTO;

public class TestDelete {

	public static void main(String[] args) {

		UserDTO dto = new UserDTO();
		dto.setId(2);

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.delete(dto);

		tx.commit();

		session.close();
	}
}
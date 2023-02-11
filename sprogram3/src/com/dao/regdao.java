package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.regvo;

@Repository

public class regdao {
	@Autowired
	private SessionFactory sessionFactory;

	public void insert(regvo v) {

		try {

			Session session = sessionFactory.openSession();

			Transaction transaction = session.beginTransaction();

			session.saveOrUpdate(v);

			transaction.commit();
			session.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public List search(regvo v) {
		List ls = new ArrayList();

		try {

			Session session = sessionFactory.openSession();
			Query q = session.createQuery("from regvo");
			ls = q.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	public void delete(regvo v) {
		try {

			Session session = sessionFactory.openSession();

			Transaction transaction = session.beginTransaction();
			session.delete(v);

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List edit(regvo v) {
		List ls1 = new ArrayList();
		try {

			Session session = sessionFactory.openSession();
			Query q = session.createQuery("from regvo where id='" + v.getId() + "'");
			ls1 = q.list();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls1;

	}


}

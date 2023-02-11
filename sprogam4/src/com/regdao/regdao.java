package com.regdao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.regvo.loginvo;
import com.regvo.regvo;
@Repository
public class regdao {
	@Autowired
	private SessionFactory sessionFactory;

	public void insert(loginvo v1) {
		try {

			Session session = sessionFactory.openSession();

			Transaction transaction = session.beginTransaction();

			session.saveOrUpdate(v1);

			transaction.commit();
			session.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void insertr(regvo v1) {
		try {

			Session session = sessionFactory.openSession();

			Transaction transaction = session.beginTransaction();

			session.saveOrUpdate(v1);

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
	public void deletel(loginvo v1) {
		try {

			Session session = sessionFactory.openSession();

			Transaction transaction = session.beginTransaction();
			session.delete(v1);

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

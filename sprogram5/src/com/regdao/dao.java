package com.regdao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.regvo.countryvo;
import com.regvo.statevo;

@Repository
public class dao {
	@Autowired
	private SessionFactory sessionFactory;

	public void insert(countryvo v1) {
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

	public List search(countryvo v) {
		List ls = new ArrayList();

		try {

			Session session = sessionFactory.openSession();
			Query q = session.createQuery("from countryvo");
			ls = q.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	public void inserts(statevo v) {
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
		public List searchs(statevo vo) {
			List ls = new ArrayList();

			try {

				Session session = sessionFactory.openSession();
				Query q = session.createQuery("from statevo");
				ls = q.list();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return ls;
		}

	}



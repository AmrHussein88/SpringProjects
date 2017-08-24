package com.amr.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.amr.entities.User;

@Repository
@Transactional

public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory SessionFactory;

	protected Session getSession() {
		return SessionFactory.getCurrentSession();
	}

	@Override
	public void addUser(User user) {

		getSession().persist(user);

	}

	@Override
	public void deleteUser(User user) {
		getSession().delete(user);

	}

	@Override
	public void updateUser(User user) {
		getSession().merge(user);
	}

	@Override
	public List<User> findUserByUserName(String userName) {
		String hql = "SELECT u FROM User u WHERE u.userName =:userName";
		Query query = getSession().createQuery(hql);
		query.setParameter("userName", userName);
		List<User> result = (List<User>) query.list();
		return result;

	}

}

package com.amr.dao;

import java.util.List;



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
   protected Session getSession(){
	   return SessionFactory.getCurrentSession();
   }
  

	@Override
	public void addUser(User user) {
//		String sql="SELECT * FROM Users ";
//		Query query =em.createNamedQuery("User.findAll");
//		List<User> users=query.getResultList();
//		for(User user1:users){
//			System.out.println(user1.getFrstName());
//		}
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

}

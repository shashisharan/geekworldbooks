package com.geekworld.serviceimpl;

import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekworld.models.Book;
import com.geekworld.service.CrudService;


@Service("CrudServiceImpl")
//@Transactional
public class CrudServiceImpl implements CrudService{
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean saveBook() {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();		
	    session.save(new Book(1,"wings of fire","Shashi Sharan", new Date(),200,"Autobiography" ,new ArrayList<String>()));
		tx.commit();
		session.close();
		
		return true;
	}
	
	

}

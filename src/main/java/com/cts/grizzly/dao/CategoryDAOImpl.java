package com.cts.grizzly.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.grizzly.bean.Category;
import com.cts.grizzly.bean.Login;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	SessionFactory sessionfactory;
	@Override
	@Transactional(readOnly=true)
	public List<Category> getCategory() {
		// TODO Auto-generated method stub
		Query<Category> query2= sessionfactory.getCurrentSession().createQuery("from Category");
		ArrayList<Category> category=(ArrayList<Category>) query2.getResultList();
		return category;
	}

}

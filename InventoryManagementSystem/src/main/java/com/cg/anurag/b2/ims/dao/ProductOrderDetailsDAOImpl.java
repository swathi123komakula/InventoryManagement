package com.cg.anurag.b2.ims.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.anurag.b2.ims.dto.ProductOrderDetails;




@Repository
public class ProductOrderDetailsDAOImpl implements ProductOrderDetailsDAO{

	@PersistenceContext
	EntityManager em;
	@Override
	
	public ProductOrderDetails addProductOrder(ProductOrderDetails p) {
		// TODO Auto-generated method stub
		ProductOrderDetails e = em.merge(p);
		return e;
	}
	
	
	@Override
	public ProductOrderDetails getProductOrderDetailsById(int distributer_id) {
		
		return em.find(ProductOrderDetails.class, distributer_id);
	}



	

}

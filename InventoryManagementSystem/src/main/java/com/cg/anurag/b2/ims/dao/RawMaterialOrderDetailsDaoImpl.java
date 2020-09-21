package com.cg.anurag.b2.ims.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import org.springframework.stereotype.Repository;
import com.cg.anurag.b2.ims.dto.RawMaterialOrderDetails;


@Repository
public class RawMaterialOrderDetailsDaoImpl implements RawMaterialOrderDetailsDao {
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public RawMaterialOrderDetails addRawMaterialOrder(RawMaterialOrderDetails r) {
		RawMaterialOrderDetails e = em.merge(r);
		return e;
	}

	
	@Override
	public RawMaterialOrderDetails getRawMaterialOrderDetailById(int supplier_id) {
		// TODO Auto-generated method stub
		return em.find(RawMaterialOrderDetails.class, supplier_id);
	}

	
}
	
	
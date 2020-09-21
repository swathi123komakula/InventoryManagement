package com.cg.anurag.b2.ims.dto;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "Rawmaterialorderdetails")

public class RawMaterialOrderDetails {

	@Id
	@Column(name="order_id")
	int order_id;
	@Column(name="item_name")
    String item_name;
	@Column(name="quantity_unit")
	 int quantity_unit;
	@Column(name="price_per_unit")
 double price_per_unit;
	@Column(name="total_price")
    double total_price;
	@Column(name="order_date")
Date order_date;
	@Column(name="delivery_date")
	 Date delivery_date;
	@Column(name="delivery_status")
 String delivery_status;
	@Column(name="supplier_id")
 int supplier_id;


	
	public int getOrder_id() {
		return order_id;
	}



	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}



	public String getItem_name() {
		return item_name;
	}



	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}



	public int getQuantity_unit() {
		return quantity_unit;
	}



	public void setQuantity_unit(int quantity_unit) {
		this.quantity_unit = quantity_unit;
	}



	public double getPrice_per_unit() {
		return price_per_unit;
	}



	public void setPrice_per_unit(double price_per_unit) {
		this.price_per_unit = price_per_unit;
	}



	public double getTotal_price() {
		return total_price;
	}



	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}



	public Date getOrder_date() {
		return order_date;
	}



	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}



	public Date getDelivery_date() {
		return delivery_date;
	}



	public void setDelivery_date(Date delivery_date) {
		this.delivery_date = delivery_date;
	}



	public String getDelivery_status() {
		return delivery_status;
	}



	public void setDelivery_status(String delivery_status) {
		this.delivery_status = delivery_status;
	}



	public int getSupplier_id() {
		return supplier_id;
	}



	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}



	public RawMaterialOrderDetails(int order_id, String item_name, int quantity_unit, double price_per_unit,
			double total_price, Date order_date, Date delivery_date, String delivery_status, int supplier_id) {
		super();
		this.order_id = order_id;
		this.item_name = item_name;
		this.quantity_unit = quantity_unit;
		this.price_per_unit = price_per_unit;
		this.total_price = total_price;
		this.order_date = order_date;
		this.delivery_date = delivery_date;
		this.delivery_status = delivery_status;
		this.supplier_id = supplier_id;
	}

	
	
	

}

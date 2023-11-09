package com.anand.razorpay.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course 
{
	    @Id
	    private Long id;
	    private String name;
		private double price;
		private String discount;
	    private double totalprice;

		public Course() {
			super();
		}
		public Course(Long id, String name, double totalprice, String discount, double price) {
			super();
			this.id = id;
			this.name = name;
			this.totalprice = totalprice;
			this.discount = discount;
			this.price = price;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getTotalprice() {
			return totalprice;
		}
		public void setTotalprice(double totalprice) {
			this.totalprice = totalprice;
		}
		public String getDiscount() {
			return discount;
		}
		public void setDiscount(String discount) {
			this.discount = discount;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Course [id=" + id + ", name=" + name + ", price=" + price + ", discount=" + discount
					+ ", totalprice=" + totalprice + "]";
		}
		
		
      
	}




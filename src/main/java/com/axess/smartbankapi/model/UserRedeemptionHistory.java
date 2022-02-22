package com.axess.smartbankapi.model;

import java.time.LocalDate;

import javax.persistence.*;


@Entity
@Table(name = "user_redeemption_history")
public class UserRedeemptionHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;

	@OneToOne
	private RewardsCatalogue catalogue;

	@Column(name = "quantity")
	private int quantity;

	@OneToOne(targetEntity = CCUser.class)
	@JoinColumn(name = "cc_number")
	private CCUser ccUser;

	@Column(name = "order_date")
	private LocalDate orderdate;


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public RewardsCatalogue getCatalogue() {
		return catalogue;
	}
	public void setCatalogue(RewardsCatalogue catalogue) {
		this.catalogue = catalogue;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public CCUser getCcUser() {
		return ccUser;
	}
	public void setCcUser(CCUser ccUser) {
		this.ccUser = ccUser;
	}
	public LocalDate getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}
	
	

}

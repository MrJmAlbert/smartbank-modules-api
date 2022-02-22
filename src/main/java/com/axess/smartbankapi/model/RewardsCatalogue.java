package com.axess.smartbankapi.model;

import javax.persistence.*;


@Entity
@Table(name = "rewards_catalogue")
public class RewardsCatalogue {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "item")
	private String item;

	@Column(name = "redeemption_point")
	private double redeemptionPoint;

	@Column(name = "redeemption_amount")
	private double redeemptionAmount;


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getRedeemptionPoint() {
		return redeemptionPoint;
	}
	public void setRedeemptionPoint(double redeemptionPoint) {
		this.redeemptionPoint = redeemptionPoint;
	}
	public double getRedeemptionAmount() {
		return redeemptionAmount;
	}
	public void setRedeemptionAmount(double redeemptionAmount) {
		this.redeemptionAmount = redeemptionAmount;
	}
	
	
	

}

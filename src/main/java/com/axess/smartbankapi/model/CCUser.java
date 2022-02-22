package com.axess.smartbankapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cc_user")
public class CCUser {
	
	@Id
	@Column(name = "cc_number")
	private long ccNumber;

	@Column(name = "cc_name")
	private String ccName;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_id")
	private String userId;

	@Column(name = "password")
	private String password;

	@Column(name = "available_redeem_points")
	private double availableRedeemPoints;

	@Column(name = "total_rewards_gained")
	private double totalRewardsGained;

	public long getCcNumber() {
		return ccNumber;
	}
	public void setCcNumber(long ccNumber) {
		this.ccNumber = ccNumber;
	}
	public String getCcName() {
		return ccName;
	}
	public void setCcName(String ccName) {
		this.ccName = ccName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getAvailableRedeemPoints() {
		return availableRedeemPoints;
	}
	public void setAvailableRedeemPoints(double availableRedeemPoints) {
		this.availableRedeemPoints = availableRedeemPoints;
	}
	public double getTotalRewardsGained() {
		return totalRewardsGained;
	}
	public void setTotalRewardsGained(double totalRewardsGained) {
		this.totalRewardsGained = totalRewardsGained;
	}
	
	
	
	
	
}

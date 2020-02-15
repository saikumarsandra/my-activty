package com.cts.training.mavenweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="block")
public class Block {
	
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // unique key and Auti Increment
	private Integer userid;
	
	@Column
	private Integer BlockedUserId;
	
	
	public Block() {}


	public Block(Integer userid, Integer blockedUserId) {
		
		this.userid = userid;
		BlockedUserId = blockedUserId;
	}


	public Integer getUserid() {
		return userid;
	}


	public void setUserid(Integer userid) {
		this.userid = userid;
	}


	public Integer getBlockedUserId() {
		return BlockedUserId;
	}


	public void setBlockedUserId(Integer blockedUserId) {
		BlockedUserId = blockedUserId;
	}


	@Override
	public String toString() {
		return "Block [userid=" + userid + ", BlockedUserId=" + BlockedUserId + "]";
	}
	
	

}

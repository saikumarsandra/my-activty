package com.cts.training.mavenweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "follow")
public class Follow {
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // unique key and Auti Increment
	private Integer userid;
	
	@Column
	private Integer followerId;
	
	public Follow() {}

	public Follow(Integer userid, Integer followerId) {
		
		this.userid = userid;
		this.followerId = followerId;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getFollowerId() {
		return followerId;
	}

	public void setFollowerId(Integer followerId) {
		this.followerId = followerId;
	}

	@Override
	public String toString() {
		return "Follow [userid=" + userid + ", followerId=" + followerId + "]";
	}

	
	
}

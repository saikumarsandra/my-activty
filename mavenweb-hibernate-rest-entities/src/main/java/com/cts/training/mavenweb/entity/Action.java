package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
@Table(name= "action")
public class Action {
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // unique key and Auti Increment
	private Integer id;
	
	@Column
	private Integer mediaId;
	
	@Column
	private Integer userId;
	
	@Column
	private boolean status;
	
	@Column @CreationTimestamp
	private LocalDateTime createdOn;
	
	@Column @UpdateTimestamp
	private LocalDateTime updatedOn;
	
	public Action() {}

	public Action(Integer id, Integer mediaId, Integer userId, boolean status, LocalDateTime createdOn,
			LocalDateTime updatedOn) {
		
		this.id = id;
		this.mediaId = mediaId;
		this.userId = userId;
		this.status = status;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMediaId() {
		return mediaId;
	}

	public void setMediaId(Integer mediaId) {
		this.mediaId = mediaId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Override
	public String toString() {
		return "Action [id=" + id + ", mediaId=" + mediaId + ", userId=" + userId + ", status=" + status
				+ ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}
	
	
	
	

}

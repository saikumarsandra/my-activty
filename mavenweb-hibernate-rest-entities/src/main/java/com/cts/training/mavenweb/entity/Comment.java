package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name="comment")
public class Comment {
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // unique key and Auti Increment
	private Integer id;
	
	@Column
	private Integer mediaId;
	
	@Column
	private Integer userId;
	
	@Column
	private String comment;
	
	@Column @CreationTimestamp
	private LocalDateTime createdOn;
	
	 public Comment() {}

	public Comment(Integer id, Integer mediaId, Integer userId, String comment, LocalDateTime createdOn) {
		
		this.id = id;
		this.mediaId = mediaId;
		this.userId = userId;
		this.comment = comment;
		this.createdOn = createdOn;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", mediaId=" + mediaId + ", userId=" + userId + ", comment=" + comment
				+ ", createdOn=" + createdOn + "]";
	}
	 
	 
	

}
 
  

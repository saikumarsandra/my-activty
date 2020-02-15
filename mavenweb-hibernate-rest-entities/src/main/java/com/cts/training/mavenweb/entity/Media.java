package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;

import javax.activation.MimeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name = "media")
class Media {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // unique key and Auti Increment
	private Integer id;
	@Column
	private Integer userId;
	
	@Column
	private String Title;
	@Column
	private String Description;
	
	@Column
	private MimeType fileType;
	
	@Column
	private int size;
	@Column
	private  String PosterFileUrl;
	@Column
	private String FileUrl;
	@Column
	private  boolean Hide;
	
	
	@Column  @CreationTimestamp
	private LocalDateTime createdOn;
	
	@Column @UpdateTimestamp
	private LocalDateTime updatedOn;
	
	@Column
	private String Tags;
	
	
	public Media () {}


	public Media(Integer id, Integer userId, String title, String description, MimeType fileType, int size,
			String posterFileUrl, String fileUrl, boolean hide, LocalDateTime createdOn, LocalDateTime updatedOn,
			String tags) {
		
		this.id = id;
		this.userId = userId;
		Title = title;
		Description = description;
		this.fileType = fileType;
		this.size = size;
		PosterFileUrl = posterFileUrl;
		FileUrl = fileUrl;
		Hide = hide;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		Tags = tags;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		Title = title;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public MimeType getFileType() {
		return fileType;
	}


	public void setFileType(MimeType fileType) {
		this.fileType = fileType;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public String getPosterFileUrl() {
		return PosterFileUrl;
	}


	public void setPosterFileUrl(String posterFileUrl) {
		PosterFileUrl = posterFileUrl;
	}


	public String getFileUrl() {
		return FileUrl;
	}


	public void setFileUrl(String fileUrl) {
		FileUrl = fileUrl;
	}


	public boolean isHide() {
		return Hide;
	}


	public void setHide(boolean hide) {
		Hide = hide;
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


	public String getTags() {
		return Tags;
	}


	public void setTags(String tags) {
		Tags = tags;
	}


	@Override
	public String toString() {
		return "media [id=" + id + ", userId=" + userId + ", Title=" + Title + ", Description=" + Description
				+ ", fileType=" + fileType + ", size=" + size + ", PosterFileUrl=" + PosterFileUrl + ", FileUrl="
				+ FileUrl + ", Hide=" + Hide + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + ", Tags="
				+ Tags + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}

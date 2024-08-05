package com.tia102g1.news.model;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "NEWS")
public class NewsVO {
	
	@Id
	@Column(name = "NEWSID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer newsId;
	
	@NotNull(message = "公告日期:請勿空白")
	@Column(name = "NEWSDATE")
	private Date newsDate;
	
	@NotNull(message = "公告起始日期:請勿空白")
	@Column(name = "STARTDT")
	private Date startDt;
	
	@NotNull(message = "公告結束日期:請勿空白")
	@Column(name = "ENDDT")
	private Date endDt;
	
	@NotEmpty(message = "公告內容:請勿空白")
	@Column(name = "NEWSCONTENT")
	private String newsContent;
	
	@Column(name = "NEWSPIC")
	private byte[] newsPic;
	
	@Column(name = "CREATEDBY")
	private String createdBy;
	
	@Column(name = "DATECREATED")
	private Timestamp dateCreated;
	
	@Column(name = "LASTUPDATEDBY")
	private String lastUpdatedBy;
	
	@Column(name = "LASTUPDATED")
	private Timestamp lastUpdated;

	public NewsVO() {
		super();
	}

	public Integer getNewsId() {
		return newsId;
	}

	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}

	public Date getNewsDate() {
		return newsDate;
	}

	public void setNewsDate(Date newsDate) {
		this.newsDate = newsDate;
	}

	public Date getStartDt() {
		return startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public Date getEndDt() {
		return endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public String getNewsContent() {
		return newsContent;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}

	public byte[] getNewsPic() {
		return newsPic;
	}

	public void setNewsPic(byte[] newsPic) {
		this.newsPic = newsPic;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Timestamp getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
	
	
}

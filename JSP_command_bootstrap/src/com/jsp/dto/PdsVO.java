package com.jsp.dto;

import java.util.Date;
import java.util.List;

public class PdsVO {

	private int pno;
	private String title;
	private String content;
	private String writer;
	private int viewcnt;
	private Date regDate;
	private Date updatedate;
	
	private List<AttachVO> attachList;
	
	public final List<AttachVO> getAttachList() {
		return attachList;
	}
	public final void setAttachList(List<AttachVO> attachList) {
		this.attachList = attachList;
	}
	public final int getPno() {
		return pno;
	}
	public final void setPno(int pno) {
		this.pno = pno;
	}
	public final String getTitle() {
		return title;
	}
	public final void setTitle(String title) {
		this.title = title;
	}
	public final String getContent() {
		return content;
	}
	public final void setContent(String content) {
		this.content = content;
	}
	public final String getWriter() {
		return writer;
	}
	public final void setWriter(String writer) {
		this.writer = writer;
	}
	public final int getViewcnt() {
		return viewcnt;
	}
	public final void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	public final Date getRegDate() {
		return regDate;
	}
	public final void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public final Date getUpdatedate() {
		return updatedate;
	}
	public final void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	
	
}

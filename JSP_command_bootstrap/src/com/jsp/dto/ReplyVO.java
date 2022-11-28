package com.jsp.dto;

import java.util.Date;

public class ReplyVO {

	
	private int rno;			//고유번호
	private int bno;			//게시글 번호
	private String replytext;	//댓글내용
	private String replyer;		//작성자
	private Date regdate;		//등록일
	private Date updatedate;	//수정일
	
	public final int getRno() {
		return rno;
	}
	public final void setRno(int rno) {
		this.rno = rno;
	}
	public final int getBno() {
		return bno;
	}
	public final void setBno(int bno) {
		this.bno = bno;
	}
	public final String getReplytext() {
		return replytext;
	}
	public final void setReplytext(String replytext) {
		this.replytext = replytext;
	}
	public final String getReplyer() {
		return replyer;
	}
	public final void setReplyer(String replyer) {
		this.replyer = replyer;
	}
	public final Date getRegdate() {
		return regdate;
	}
	public final void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public final Date getUpdatedate() {
		return updatedate;
	}
	public final void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
}

package com.kh.toy.common.file;

import java.sql.Date;

public class FileDTO {
	private String flIdx;
	private String typeIdx;
	private String originFileName;
	private String renameFilename;
	private String savePath;
	private Date regDate;
	private int isDel;
	private String downloadLink;
	
	public String getDownloadLink() {
		return "/file/" + getSavePath() + getRenameFileName() + "?originFileName=" + getOriginFileName();
	}
	
	public String getFlIdx() {
		return flIdx;
	}
	public void setFlIdx(String flIdx) {
		this.flIdx = flIdx;
	}
	public String getTypeIdx() {
		return typeIdx;
	}
	public void setTypeIdx(String typeIdx) {
		this.typeIdx = typeIdx;
	}
	public String getOriginFileName() {
		return originFileName;
	}
	public void setOriginFileName(String originFileName) {
		this.originFileName = originFileName;
	}
	public String getRenameFileName() {
		return renameFilename;
	}
	public void setRenameFileName(String renameFilename) {
		this.renameFilename = renameFilename;
	}
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getIsDel() {
		return isDel;
	}
	public void setIsDel(int isDel) {
		this.isDel = isDel;
	}
	@Override
	public String toString() {
		return "FileDTO [flIdx=" + flIdx + ", typeIdx=" + typeIdx + ", originFileName=" + originFileName
				+ ", renameFilename=" + renameFilename + ", savePath=" + savePath + ", regDate=" + regDate + ", isDel="
				+ isDel + "]";
	}
	
	
}

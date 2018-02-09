package com.sd.shop.vo;

import com.sd.fw.util.BeanUtil;

public class CategoryVO implements java.io.Serializable{
	
	private static final long serialVersionUID = -5587236639812923135L;
    private String categoryNo;
    private String categoryNm;
    private String categoryDesc;
    private String regId;
    private String regDtm;
     
	public String getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getCategoryNm() {
		return categoryNm;
	}

	public void setCategoryNm(String categoryNm) {
		this.categoryNm = categoryNm;
	}

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public String getRegDtm() {
		return regDtm;
	}

	public void setRegDtm(String regDtm) {
		this.regDtm = regDtm;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String toString(){
		return BeanUtil.getString(this);
	}
}

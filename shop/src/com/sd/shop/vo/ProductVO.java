package com.sd.shop.vo;

import java.io.Serializable;

import com.sd.fw.util.BeanUtil;

public class ProductVO implements Serializable {

	private static final long serialVersionUID = 6314796554017142677L;
	
    private String prdNo;
    private String prdNm;
    private String categoryNo;
    private String prdDes;
    private int sellPrcUnit;
    private String sellStartDt;
    private String sellEndDt;
    private String dlvConstraint;
    private String asFlg;
    private String returnFlg;
    private String imgOrgFileNm;
    private String imgGenFileNm;
    private String regId;
    private String regDtm;
    
    private int basketCount;
		
	public String getPrdNo() {
		return prdNo;
	}

	public void setPrdNo(String prdNo) {
		this.prdNo = prdNo;
	}

	public String getPrdNm() {
		return prdNm;
	}

	public void setPrdNm(String prdNm) {
		this.prdNm = prdNm;
	}

	public String getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getPrdDes() {
		return prdDes;
	}

	public void setPrdDes(String prdDes) {
		this.prdDes = prdDes;
	}

	public int getSellPrcUnit() {
		return sellPrcUnit;
	}

	public void setSellPrcUnit(int sellPrcUnit) {
		this.sellPrcUnit = sellPrcUnit;
	}

	public String getSellStartDt() {
		return sellStartDt;
	}

	public void setSellStartDt(String sellStartDt) {
		this.sellStartDt = sellStartDt;
	}

	public String getSellEndDt() {
		return sellEndDt;
	}

	public void setSellEndDt(String sellEndDt) {
		this.sellEndDt = sellEndDt;
	}

	public String getDlvConstraint() {
		return dlvConstraint;
	}

	public void setDlvConstraint(String dlvConstraint) {
		this.dlvConstraint = dlvConstraint;
	}

	public String getAsFlg() {
		return asFlg;
	}

	public void setAsFlg(String asFlg) {
		this.asFlg = asFlg;
	}

	public String getReturnFlg() {
		return returnFlg;
	}

	public void setReturnFlg(String returnFlg) {
		this.returnFlg = returnFlg;
	}

	public String getImgOrgFileNm() {
		return imgOrgFileNm;
	}

	public void setImgOrgFileNm(String imgOrgFileNm) {
		this.imgOrgFileNm = imgOrgFileNm;
	}

	public String getImgGenFileNm() {
		return imgGenFileNm;
	}

	public void setImgGenFileNm(String imgGenFileNm) {
		this.imgGenFileNm = imgGenFileNm;
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

	public int getBasketCount() {
		return basketCount;
	}

	public void setBasketCount(int basketCount) {
		this.basketCount = basketCount;
	}

	public String toString(){
		return BeanUtil.getString(this);
	}
}

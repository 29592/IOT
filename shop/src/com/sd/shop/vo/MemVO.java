package com.sd.shop.vo;

import java.io.Serializable;

import com.sd.fw.util.BeanUtil;

public class MemVO implements Serializable { 
	private static final long serialVersionUID = -4966722501789629213L;
	
	private String memId;
    private String memNm;
    private String memCd;
    private String pwd;
    private String pwdHint;
    private String pwdHintAns;
    private String ssn;
    private String birthDt;
    private String maleFlg;
    private String telNo;
    private String cellNo;
    private String addr;
    private String email;
    private String emailRcvFlg;
    private String memRegDtm;
    
    	
	public String getMemId() {
		return memId;
	}


	public void setMemId(String memId) {
		this.memId = memId;
	}


	public String getMemNm() {
		return memNm;
	}


	public void setMemNm(String memNm) {
		this.memNm = memNm;
	}


	public String getMemCd() {
		return memCd;
	}


	public void setMemCd(String memCd) {
		this.memCd = memCd;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getPwdHint() {
		return pwdHint;
	}


	public void setPwdHint(String pwdHint) {
		this.pwdHint = pwdHint;
	}


	public String getPwdHintAns() {
		return pwdHintAns;
	}


	public void setPwdHintAns(String pwdHintAns) {
		this.pwdHintAns = pwdHintAns;
	}


	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	public String getBirthDt() {
		return birthDt;
	}


	public void setBirthDt(String birthDt) {
		this.birthDt = birthDt;
	}


	public String getMaleFlg() {
		return maleFlg;
	}


	public void setMaleFlg(String maleFlg) {
		this.maleFlg = maleFlg;
	}


	public String getTelNo() {
		return telNo;
	}


	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}


	public String getCellNo() {
		return cellNo;
	}


	public void setCellNo(String cellNo) {
		this.cellNo = cellNo;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEmailRcvFlg() {
		return emailRcvFlg;
	}


	public void setEmailRcvFlg(String emailRcvFlg) {
		this.emailRcvFlg = emailRcvFlg;
	}


	public String getMemRegDtm() {
		return memRegDtm;
	}


	public void setMemRegDtm(String memRegDtm) {
		this.memRegDtm = memRegDtm;
	}


	public String toString(){
		return BeanUtil.getString(this);
	}
}

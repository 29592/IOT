package com.sd.shop.vo;

import java.io.Serializable;

import com.sd.fw.util.BeanUtil;

public class SessionVO implements Serializable {  
	
	private static final long serialVersionUID = 3968765403815949106L;
	
	private String memId;
    private String memNm;
    private String memCd;  
    private String email;  
    
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
  
	public String toString(){
		return BeanUtil.getString(this);
	}
}

package br.com.drummond.aula.model;

import java.util.Date;

public class Version {

	private String buildName;
	private Integer buidVersionNumber;
	private Date buildDate;
	
	public String getBuildName() {
		return buildName;
	}
	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}
	public Integer getBuidVersionNumber() {
		return buidVersionNumber;
	}
	public void setBuidVersionNumber(Integer buidVersionNumber) {
		this.buidVersionNumber = buidVersionNumber;
	}
	public Date getBuildDate() {
		return buildDate;
	}
	public void setBuildDate(Date buildDate) {
		this.buildDate = buildDate;
	}
	
}

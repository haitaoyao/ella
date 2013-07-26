package com.adintellig.ella.hbase.beans.attr;

public class HBaseAttributeBean {
	// hbase info
	private String date;
	private String revision;
	private String url;
	private String user;
	private String version;

	// hadoop info
	private String hdfsDate;
	private String hdfsRev;
	private String hdfsUrl;
	private String hdfsUser;
	private String hdfsVer;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getHdfsDate() {
		return hdfsDate;
	}

	public void setHdfsDate(String hdfsDate) {
		this.hdfsDate = hdfsDate;
	}

	public String getHdfsRev() {
		return hdfsRev;
	}

	public void setHdfsRev(String hdfsRev) {
		this.hdfsRev = hdfsRev;
	}

	public String getHdfsUrl() {
		return hdfsUrl;
	}

	public void setHdfsUrl(String hdfsUrl) {
		this.hdfsUrl = hdfsUrl;
	}

	public String getHdfsUser() {
		return hdfsUser;
	}

	public void setHdfsUser(String hdfsUser) {
		this.hdfsUser = hdfsUser;
	}

	public String getHdfsVer() {
		return hdfsVer;
	}

	public void setHdfsVer(String hdfsVer) {
		this.hdfsVer = hdfsVer;
	}

}

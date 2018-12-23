package com.codimiracle.database.accessor;

public class JDBCConfig {
	private String url;
	private String driverClass;
	private String user;
	private String password;

	protected JDBCConfig(JDBCConfig config) {
		this.url = config.url;
		this.driverClass = config.driverClass;
		this.user = config.user;
		this.password = config.password;
	}
	
	public JDBCConfig() {
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

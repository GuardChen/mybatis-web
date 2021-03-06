package org.mybatis.example;

public class User {
	private Integer id;
	private String userName;
	private String corp;
	
	public User(Integer id, String userName, String corp) {
		this.id = id;
		this.userName = userName;
		this.corp = corp;
	}
	
	public User(String userName, String corp) {
		this.userName = userName;
		this.corp = corp;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCorp() {
		return corp;
	}

	public void setCorp(String corp) {
		this.corp = corp;
	}

	public int getId() {
		return id;
	}
	
	

}

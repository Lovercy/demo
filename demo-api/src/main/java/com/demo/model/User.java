package com.demo.model;

import java.io.Serializable;

public class User implements Serializable{
	
	
    /**
	 * defalue versionID
	 */
	private static final long serialVersionUID = 1L;

	private String userid;

    private String username;

    private String password;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}
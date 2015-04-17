package com.freud.logic.business.bean;

import com.freud.framework.bean.BaseBean;

/**
 * @ClassName: Huifu <br>
 * @Description: TODO <br>
 * @date 2015年4月15日 下午3:45:25 <br>
 * 
 * @author Freud
 */
public class Huifu extends BaseBean {

	private int id;
	private int tieziId;
	private String user;
	private String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTieziId() {
		return tieziId;
	}

	public void setTieziId(int tieziId) {
		this.tieziId = tieziId;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}

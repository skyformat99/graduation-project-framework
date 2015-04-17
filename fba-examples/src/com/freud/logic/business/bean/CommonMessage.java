package com.freud.logic.business.bean;

import com.freud.framework.bean.BaseBean;

/**
 * @ClassName: CommonMessage <br>
 * @Description: TODO <br>
 * @date 2015年4月15日 下午3:43:28 <br>
 * 
 * @author Freud
 */
public class CommonMessage extends BaseBean {

	private int id;
	private String notify;
	private boolean status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNotify() {
		return notify;
	}

	public void setNotify(String notify) {
		this.notify = notify;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}

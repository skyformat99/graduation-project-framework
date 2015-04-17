package com.freud.logic.business.bean;

import com.freud.framework.bean.BaseBean;

/**
 * @ClassName: TouPiao <br>
 * @Description: TODO <br>
 * @date 2015年4月15日 下午3:47:08 <br>
 * 
 * @author Freud
 */
public class TouPiao extends BaseBean {

	private int id;
	private String username;
	private int count;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}

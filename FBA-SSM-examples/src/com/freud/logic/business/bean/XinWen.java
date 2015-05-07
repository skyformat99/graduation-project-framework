package com.freud.logic.business.bean;

import com.freud.framework.bean.BaseBean;

/**
 * @ClassName: XinWen <br>
 * @Description: TODO <br>
 * @date 2015年4月15日 下午3:41:26 <br>
 * 
 * @author Freud
 */
public class XinWen extends BaseBean {

	private int id;
	private String title;
	private String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}

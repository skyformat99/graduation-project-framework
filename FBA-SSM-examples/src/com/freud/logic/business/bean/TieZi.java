package com.freud.logic.business.bean;

import java.util.ArrayList;
import java.util.List;

import com.freud.framework.bean.BaseBean;

/**
 * @ClassName: TieZe <br>
 * @Description: TODO <br>
 * @date 2015年4月15日 下午3:44:05 <br>
 * 
 * @author Freud
 */
public class TieZi extends BaseBean {

	private int id;
	private String user;
	private String title;
	private String content;

	private List<Huifu> huifus;

	public List<Huifu> getHuifus() {
		if (huifus == null) {
			huifus = new ArrayList<Huifu>();
		}
		return huifus;
	}

	public void setHuifus(List<Huifu> huifus) {
		this.huifus = huifus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
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

package com.freud.framework.bean;

import java.sql.Timestamp;

/**
 * @ClassName: BaseBean <br>
 * @Description: TODO <br>
 * @date 2015年4月15日 下午3:41:51 <br>
 * 
 * @author Freud
 */
public class BaseBean {

	private Timestamp operateDate;

	public Timestamp getOperateDate() {
		return operateDate;
	}

	public void setOperateDate(Timestamp operateDate) {
		this.operateDate = operateDate;
	}

}

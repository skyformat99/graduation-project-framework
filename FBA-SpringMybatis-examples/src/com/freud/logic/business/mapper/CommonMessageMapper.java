package com.freud.logic.business.mapper;

import com.freud.logic.business.bean.CommonMessage;

/**
 * @ClassName: CommonMessageMapper <br>
 * @Description: TODO <br>
 * @date 2015年4月15日 下午3:48:24 <br>
 * 
 * @author Freud
 */
public interface CommonMessageMapper {

	public CommonMessage getNewestCommonMessage();

	public void insertCommonMessage(CommonMessage commonMessage);

	public void removeCommonMessages();

}

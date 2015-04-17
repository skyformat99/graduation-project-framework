package com.freud.logic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freud.framework.util.DateUtil;
import com.freud.logic.business.bean.CommonMessage;
import com.freud.logic.business.mapper.CommonMessageMapper;

/**
 * @ClassName: CommonMessageService <br>
 * @Description: TODO <br>
 * @date 2015年4月15日 下午4:00:26 <br>
 * 
 * @author Freud
 */
@Service("commonMessageService")
public class CommonMessageService {

	@Autowired
	private CommonMessageMapper commonMessageMapper;

	public CommonMessage getCommonMessage() {
		CommonMessage common = commonMessageMapper.getNewestCommonMessage();

		if (common == null) {
			common = new CommonMessage();
			common.setNotify("暂无通知");
		}
		return common;
	}

	public void insert(CommonMessage commonMessage) {
		commonMessage.setOperateDate(DateUtil.currentTimestamp());
		commonMessage.setStatus(true);
		commonMessageMapper.removeCommonMessages();
		commonMessageMapper.insertCommonMessage(commonMessage);
	}
}

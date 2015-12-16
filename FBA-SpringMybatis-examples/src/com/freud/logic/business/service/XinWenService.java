package com.freud.logic.business.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freud.framework.util.DateUtil;
import com.freud.logic.business.bean.XinWen;
import com.freud.logic.business.mapper.XinWenMapper;

/**
 * @ClassName: XinWenService <br>
 * @Description: TODO <br>
 * @date 2015年4月15日 下午4:01:45 <br>
 * 
 * @author Freud
 */
@Service("xinWenService")
public class XinWenService {

	@Autowired
	private XinWenMapper xinWenMapper;

	public List<XinWen> getAllXinWen(RowBounds rb) {
		return xinWenMapper.getXinWens(rb);
	}

	public XinWen getXinWenById(int id) {
		return xinWenMapper.getXinWenById(id);
	}

	public void insertXinWen(XinWen xinwen) {
		xinwen.setOperateDate(DateUtil.currentTimestamp());
		xinWenMapper.insertXinWen(xinwen);
	}
}

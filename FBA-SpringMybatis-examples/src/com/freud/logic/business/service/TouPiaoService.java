package com.freud.logic.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freud.framework.util.DateUtil;
import com.freud.logic.business.bean.TouPiao;
import com.freud.logic.business.mapper.TouPiaoMapper;

/**
 * @ClassName: TouPiaoService <br>
 * @Description: TODO <br>
 * @date 2015年4月15日 下午4:02:19 <br>
 * 
 * @author Freud
 */
@Service("touPiaoService")
public class TouPiaoService {

	@Autowired
	private TouPiaoMapper touPiaoMapper;

	public List<TouPiao> getAllTouPiao() {
		return touPiaoMapper.getAllTouPiao();
	}

	public void updateTouPiao(int id) {
		TouPiao toupiao = touPiaoMapper.getTouPiaoById(id);
		toupiao.setCount(toupiao.getCount() + 1);
		toupiao.setOperateDate(DateUtil.currentTimestamp());
		touPiaoMapper.updateTouPiao(toupiao);
	}

	public void insertTouPiao(String username) {
		TouPiao toupiao = new TouPiao();
		toupiao.setCount(0);
		toupiao.setUsername(username);
		toupiao.setOperateDate(DateUtil.currentTimestamp());
		touPiaoMapper.insertTouPiao(toupiao);
	}
	
	public void delete(int id){
		touPiaoMapper.deleteTouPiaoById(id);
	}
}

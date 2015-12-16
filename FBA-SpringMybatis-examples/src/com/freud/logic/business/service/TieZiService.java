package com.freud.logic.business.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freud.framework.spring.security.SecurityContextUtil;
import com.freud.framework.util.DateUtil;
import com.freud.logic.business.bean.Huifu;
import com.freud.logic.business.bean.TieZi;
import com.freud.logic.business.mapper.HuiFuMapper;
import com.freud.logic.business.mapper.TieZiMapper;

/**
 * @ClassName: TieZiService <br>
 * @Description: TODO <br>
 * @date 2015年4月15日 下午4:02:46 <br>
 * 
 * @author Freud
 */
@Service("tieZiService")
public class TieZiService {

	@Autowired
	private TieZiMapper tieZiMapper;

	@Autowired
	private HuiFuMapper huiFuMapper;

	public List<TieZi> getTiezis(RowBounds rowBounds) {
		return tieZiMapper.getAllTiezi(rowBounds);
	}

	public TieZi getTieziById(int id) {

		TieZi tiezi = tieZiMapper.getTieZiById(id);

		tiezi.getHuifus().addAll(huiFuMapper.getHuifuByTieZeId(id));

		return tiezi;
	}

	public void insertTieZi(TieZi tiezi) {
		tiezi.setUser(SecurityContextUtil.getUserName());
		tiezi.setOperateDate(DateUtil.currentTimestamp());
		tieZiMapper.insertTieZe(tiezi);
	}

	public void insertHuiFu(Huifu huifu) {
		huifu.setUser(SecurityContextUtil.getUserName());
		huifu.setOperateDate(DateUtil.currentTimestamp());
		huiFuMapper.insertHuifu(huifu);
	}
}

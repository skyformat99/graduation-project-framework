package com.freud.logic.business.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.freud.logic.business.bean.Huifu;

/**
 * @ClassName: HuiFuMapper <br>
 * @Description: TODO <br>
 * @date 2015年4月15日 下午3:48:45 <br>
 * 
 * @author Freud
 */
public interface HuiFuMapper {

	public List<Huifu> getHuifuByTieZeId(@Param("tieZiId") int tieZiId);

	public void insertHuifu(Huifu huifu);
}

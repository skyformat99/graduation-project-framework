package com.freud.logic.business.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.freud.logic.business.bean.TouPiao;

/**
 * @ClassName: TouPiaoMapper <br>
 * @Description: TODO <br>
 * @date 2015年4月15日 下午3:49:08 <br>
 * 
 * @author Freud
 */
public interface TouPiaoMapper {

	public List<TouPiao> getAllTouPiao();

	public TouPiao getTouPiaoById(@Param("id") int id);

	public void insertTouPiao(TouPiao toupiao);

	public void updateTouPiao(TouPiao toupiao);

	public void deleteTouPiaoById(@Param("id") int id);
}

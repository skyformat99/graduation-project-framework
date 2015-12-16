package com.freud.logic.business.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.freud.logic.business.bean.TieZi;

/**
 * @ClassName: TieZeMapper <br>
 * @Description: TODO <br>
 * @date 2015年4月15日 下午3:48:57 <br>
 * 
 * @author Freud
 */
public interface TieZiMapper {

	public List<TieZi> getAllTiezi(RowBounds rowBounds);

	public TieZi getTieZiById(@Param("id") int id);

	public void insertTieZe(TieZi tiezi);

	public void removeTieZe(@Param("id") int id);
}

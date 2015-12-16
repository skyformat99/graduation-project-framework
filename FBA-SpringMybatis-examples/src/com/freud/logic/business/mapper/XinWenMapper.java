package com.freud.logic.business.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.freud.logic.business.bean.XinWen;

/**
 * @ClassName: XinWenMapper <br>
 * @Description: TODO <br>
 * @date 2015年4月15日 下午3:49:16 <br>
 * 
 * @author Freud
 */
public interface XinWenMapper {

	public XinWen getXinWenById(@Param("id") int id);

	public List<XinWen> getXinWens(RowBounds rowBounds);

	public void insertXinWen(XinWen xinwen);
}

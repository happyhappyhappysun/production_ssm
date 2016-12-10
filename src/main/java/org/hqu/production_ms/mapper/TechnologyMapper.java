package org.hqu.production_ms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.hqu.production_ms.domain.Technology;
import org.hqu.production_ms.domain.TechnologyExample;

public interface TechnologyMapper {
	
	//扩展的mapper接口方法
	int deleteBatch(String[] ids);
	
	//
    int countByExample(TechnologyExample example);

    int deleteByExample(TechnologyExample example);

    int deleteByPrimaryKey(String technologyId);

    int insert(Technology record);

    int insertSelective(Technology record);

    List<Technology> selectByExample(TechnologyExample example);

    Technology selectByPrimaryKey(String technologyId);

    int updateByExampleSelective(@Param("record") Technology record, @Param("example") TechnologyExample example);

    int updateByExample(@Param("record") Technology record, @Param("example") TechnologyExample example);

    int updateByPrimaryKeySelective(Technology record);

    int updateByPrimaryKey(Technology record);

	List<Technology> searchTechnologyByTechnologyId(String technologyId);

	List<Technology> searchTechnologyByTechnologyName(String technologyName);
}
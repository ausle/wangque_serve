package com.asule.wangquemain.mapper;

import com.asule.wangquemain.entity.Magazine;
import com.asule.wangquemain.entity.MagazineExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MagazineMapper {
    long countByExample(MagazineExample example);

    int deleteByExample(MagazineExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Magazine record);

    int insertSelective(Magazine record);

    List<Magazine> selectByExampleWithBLOBs(MagazineExample example);

    List<Magazine> selectByExample(MagazineExample example);

    Magazine selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Magazine record, @Param("example") MagazineExample example);

    int updateByExampleWithBLOBs(@Param("record") Magazine record, @Param("example") MagazineExample example);

    int updateByExample(@Param("record") Magazine record, @Param("example") MagazineExample example);

    int updateByPrimaryKeySelective(Magazine record);

    int updateByPrimaryKeyWithBLOBs(Magazine record);

    int updateByPrimaryKey(Magazine record);
}
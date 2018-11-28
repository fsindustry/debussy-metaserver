package com.fsindustry.debussy.metaserver.topic.dao;

import com.fsindustry.debussy.metaserver.topic.entity.MetaCluster;
import com.fsindustry.debussy.metaserver.topic.entity.MetaClusterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MetaClusterMapper {
    long countByExample(MetaClusterExample example);

    int deleteByExample(MetaClusterExample example);

    int deleteByPrimaryKey(Integer clusterId);

    int insert(MetaCluster record);

    int insertSelective(MetaCluster record);

    List<MetaCluster> selectByExample(MetaClusterExample example);

    MetaCluster selectByPrimaryKey(Integer clusterId);

    int updateByExampleSelective(@Param("record") MetaCluster record, @Param("example") MetaClusterExample example);

    int updateByExample(@Param("record") MetaCluster record, @Param("example") MetaClusterExample example);

    int updateByPrimaryKeySelective(MetaCluster record);

    int updateByPrimaryKey(MetaCluster record);
}
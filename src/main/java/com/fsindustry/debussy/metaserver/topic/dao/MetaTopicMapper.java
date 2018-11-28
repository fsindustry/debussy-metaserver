package com.fsindustry.debussy.metaserver.topic.dao;

import com.fsindustry.debussy.metaserver.topic.entity.MetaTopic;
import com.fsindustry.debussy.metaserver.topic.entity.MetaTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MetaTopicMapper {
    long countByExample(MetaTopicExample example);

    int deleteByExample(MetaTopicExample example);

    int deleteByPrimaryKey(Long topicId);

    int insert(MetaTopic record);

    int insertSelective(MetaTopic record);

    List<MetaTopic> selectByExample(MetaTopicExample example);

    MetaTopic selectByPrimaryKey(Long topicId);

    int updateByExampleSelective(@Param("record") MetaTopic record, @Param("example") MetaTopicExample example);

    int updateByExample(@Param("record") MetaTopic record, @Param("example") MetaTopicExample example);

    int updateByPrimaryKeySelective(MetaTopic record);

    int updateByPrimaryKey(MetaTopic record);
}
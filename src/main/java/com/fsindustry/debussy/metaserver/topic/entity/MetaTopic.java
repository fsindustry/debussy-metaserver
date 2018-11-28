package com.fsindustry.debussy.metaserver.topic.entity;

import java.util.Date;

import lombok.Data;

@Data
public class MetaTopic {

    private Long topicId;

    private String topicName;

    private Integer partitionCount;

    private Integer replicationFactor;

    private String msgTimestampType;

    private Date createTime;

    private Date updateTime;

    private Long createBy;

    private Long updateBy;

    private Boolean enabled;

    private Boolean deleted;

    private String userId;

    private Integer clusterId;
}
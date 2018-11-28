package com.fsindustry.debussy.metaserver.topic.entity;

import java.util.Date;

import lombok.Data;

@Data
public class MetaCluster {

    private Integer clusterId;

    private String clusterName;

    private String clusterDesc;

    private String region;

    private String zkAddr;

    private Integer controllerBroker;

    private Integer controllerEpoch;

    private Integer brokerCount;

    private Date createTime;

    private Date updateTime;
}
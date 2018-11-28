package com.fsindustry.debussy.metaserver.topic.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MetaClusterExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MetaClusterExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andClusterIdIsNull() {
            addCriterion("cluster_id is null");
            return (Criteria) this;
        }

        public Criteria andClusterIdIsNotNull() {
            addCriterion("cluster_id is not null");
            return (Criteria) this;
        }

        public Criteria andClusterIdEqualTo(Integer value) {
            addCriterion("cluster_id =", value, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdNotEqualTo(Integer value) {
            addCriterion("cluster_id <>", value, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdGreaterThan(Integer value) {
            addCriterion("cluster_id >", value, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cluster_id >=", value, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdLessThan(Integer value) {
            addCriterion("cluster_id <", value, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdLessThanOrEqualTo(Integer value) {
            addCriterion("cluster_id <=", value, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdIn(List<Integer> values) {
            addCriterion("cluster_id in", values, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdNotIn(List<Integer> values) {
            addCriterion("cluster_id not in", values, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdBetween(Integer value1, Integer value2) {
            addCriterion("cluster_id between", value1, value2, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cluster_id not between", value1, value2, "clusterId");
            return (Criteria) this;
        }

        public Criteria andClusterNameIsNull() {
            addCriterion("cluster_name is null");
            return (Criteria) this;
        }

        public Criteria andClusterNameIsNotNull() {
            addCriterion("cluster_name is not null");
            return (Criteria) this;
        }

        public Criteria andClusterNameEqualTo(String value) {
            addCriterion("cluster_name =", value, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameNotEqualTo(String value) {
            addCriterion("cluster_name <>", value, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameGreaterThan(String value) {
            addCriterion("cluster_name >", value, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameGreaterThanOrEqualTo(String value) {
            addCriterion("cluster_name >=", value, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameLessThan(String value) {
            addCriterion("cluster_name <", value, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameLessThanOrEqualTo(String value) {
            addCriterion("cluster_name <=", value, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameLike(String value) {
            addCriterion("cluster_name like", value, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameNotLike(String value) {
            addCriterion("cluster_name not like", value, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameIn(List<String> values) {
            addCriterion("cluster_name in", values, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameNotIn(List<String> values) {
            addCriterion("cluster_name not in", values, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameBetween(String value1, String value2) {
            addCriterion("cluster_name between", value1, value2, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterNameNotBetween(String value1, String value2) {
            addCriterion("cluster_name not between", value1, value2, "clusterName");
            return (Criteria) this;
        }

        public Criteria andClusterDescIsNull() {
            addCriterion("cluster_desc is null");
            return (Criteria) this;
        }

        public Criteria andClusterDescIsNotNull() {
            addCriterion("cluster_desc is not null");
            return (Criteria) this;
        }

        public Criteria andClusterDescEqualTo(String value) {
            addCriterion("cluster_desc =", value, "clusterDesc");
            return (Criteria) this;
        }

        public Criteria andClusterDescNotEqualTo(String value) {
            addCriterion("cluster_desc <>", value, "clusterDesc");
            return (Criteria) this;
        }

        public Criteria andClusterDescGreaterThan(String value) {
            addCriterion("cluster_desc >", value, "clusterDesc");
            return (Criteria) this;
        }

        public Criteria andClusterDescGreaterThanOrEqualTo(String value) {
            addCriterion("cluster_desc >=", value, "clusterDesc");
            return (Criteria) this;
        }

        public Criteria andClusterDescLessThan(String value) {
            addCriterion("cluster_desc <", value, "clusterDesc");
            return (Criteria) this;
        }

        public Criteria andClusterDescLessThanOrEqualTo(String value) {
            addCriterion("cluster_desc <=", value, "clusterDesc");
            return (Criteria) this;
        }

        public Criteria andClusterDescLike(String value) {
            addCriterion("cluster_desc like", value, "clusterDesc");
            return (Criteria) this;
        }

        public Criteria andClusterDescNotLike(String value) {
            addCriterion("cluster_desc not like", value, "clusterDesc");
            return (Criteria) this;
        }

        public Criteria andClusterDescIn(List<String> values) {
            addCriterion("cluster_desc in", values, "clusterDesc");
            return (Criteria) this;
        }

        public Criteria andClusterDescNotIn(List<String> values) {
            addCriterion("cluster_desc not in", values, "clusterDesc");
            return (Criteria) this;
        }

        public Criteria andClusterDescBetween(String value1, String value2) {
            addCriterion("cluster_desc between", value1, value2, "clusterDesc");
            return (Criteria) this;
        }

        public Criteria andClusterDescNotBetween(String value1, String value2) {
            addCriterion("cluster_desc not between", value1, value2, "clusterDesc");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andZkAddrIsNull() {
            addCriterion("zk_addr is null");
            return (Criteria) this;
        }

        public Criteria andZkAddrIsNotNull() {
            addCriterion("zk_addr is not null");
            return (Criteria) this;
        }

        public Criteria andZkAddrEqualTo(String value) {
            addCriterion("zk_addr =", value, "zkAddr");
            return (Criteria) this;
        }

        public Criteria andZkAddrNotEqualTo(String value) {
            addCriterion("zk_addr <>", value, "zkAddr");
            return (Criteria) this;
        }

        public Criteria andZkAddrGreaterThan(String value) {
            addCriterion("zk_addr >", value, "zkAddr");
            return (Criteria) this;
        }

        public Criteria andZkAddrGreaterThanOrEqualTo(String value) {
            addCriterion("zk_addr >=", value, "zkAddr");
            return (Criteria) this;
        }

        public Criteria andZkAddrLessThan(String value) {
            addCriterion("zk_addr <", value, "zkAddr");
            return (Criteria) this;
        }

        public Criteria andZkAddrLessThanOrEqualTo(String value) {
            addCriterion("zk_addr <=", value, "zkAddr");
            return (Criteria) this;
        }

        public Criteria andZkAddrLike(String value) {
            addCriterion("zk_addr like", value, "zkAddr");
            return (Criteria) this;
        }

        public Criteria andZkAddrNotLike(String value) {
            addCriterion("zk_addr not like", value, "zkAddr");
            return (Criteria) this;
        }

        public Criteria andZkAddrIn(List<String> values) {
            addCriterion("zk_addr in", values, "zkAddr");
            return (Criteria) this;
        }

        public Criteria andZkAddrNotIn(List<String> values) {
            addCriterion("zk_addr not in", values, "zkAddr");
            return (Criteria) this;
        }

        public Criteria andZkAddrBetween(String value1, String value2) {
            addCriterion("zk_addr between", value1, value2, "zkAddr");
            return (Criteria) this;
        }

        public Criteria andZkAddrNotBetween(String value1, String value2) {
            addCriterion("zk_addr not between", value1, value2, "zkAddr");
            return (Criteria) this;
        }

        public Criteria andControllerBrokerIsNull() {
            addCriterion("controller_broker is null");
            return (Criteria) this;
        }

        public Criteria andControllerBrokerIsNotNull() {
            addCriterion("controller_broker is not null");
            return (Criteria) this;
        }

        public Criteria andControllerBrokerEqualTo(Integer value) {
            addCriterion("controller_broker =", value, "controllerBroker");
            return (Criteria) this;
        }

        public Criteria andControllerBrokerNotEqualTo(Integer value) {
            addCriterion("controller_broker <>", value, "controllerBroker");
            return (Criteria) this;
        }

        public Criteria andControllerBrokerGreaterThan(Integer value) {
            addCriterion("controller_broker >", value, "controllerBroker");
            return (Criteria) this;
        }

        public Criteria andControllerBrokerGreaterThanOrEqualTo(Integer value) {
            addCriterion("controller_broker >=", value, "controllerBroker");
            return (Criteria) this;
        }

        public Criteria andControllerBrokerLessThan(Integer value) {
            addCriterion("controller_broker <", value, "controllerBroker");
            return (Criteria) this;
        }

        public Criteria andControllerBrokerLessThanOrEqualTo(Integer value) {
            addCriterion("controller_broker <=", value, "controllerBroker");
            return (Criteria) this;
        }

        public Criteria andControllerBrokerIn(List<Integer> values) {
            addCriterion("controller_broker in", values, "controllerBroker");
            return (Criteria) this;
        }

        public Criteria andControllerBrokerNotIn(List<Integer> values) {
            addCriterion("controller_broker not in", values, "controllerBroker");
            return (Criteria) this;
        }

        public Criteria andControllerBrokerBetween(Integer value1, Integer value2) {
            addCriterion("controller_broker between", value1, value2, "controllerBroker");
            return (Criteria) this;
        }

        public Criteria andControllerBrokerNotBetween(Integer value1, Integer value2) {
            addCriterion("controller_broker not between", value1, value2, "controllerBroker");
            return (Criteria) this;
        }

        public Criteria andControllerEpochIsNull() {
            addCriterion("controller_epoch is null");
            return (Criteria) this;
        }

        public Criteria andControllerEpochIsNotNull() {
            addCriterion("controller_epoch is not null");
            return (Criteria) this;
        }

        public Criteria andControllerEpochEqualTo(Integer value) {
            addCriterion("controller_epoch =", value, "controllerEpoch");
            return (Criteria) this;
        }

        public Criteria andControllerEpochNotEqualTo(Integer value) {
            addCriterion("controller_epoch <>", value, "controllerEpoch");
            return (Criteria) this;
        }

        public Criteria andControllerEpochGreaterThan(Integer value) {
            addCriterion("controller_epoch >", value, "controllerEpoch");
            return (Criteria) this;
        }

        public Criteria andControllerEpochGreaterThanOrEqualTo(Integer value) {
            addCriterion("controller_epoch >=", value, "controllerEpoch");
            return (Criteria) this;
        }

        public Criteria andControllerEpochLessThan(Integer value) {
            addCriterion("controller_epoch <", value, "controllerEpoch");
            return (Criteria) this;
        }

        public Criteria andControllerEpochLessThanOrEqualTo(Integer value) {
            addCriterion("controller_epoch <=", value, "controllerEpoch");
            return (Criteria) this;
        }

        public Criteria andControllerEpochIn(List<Integer> values) {
            addCriterion("controller_epoch in", values, "controllerEpoch");
            return (Criteria) this;
        }

        public Criteria andControllerEpochNotIn(List<Integer> values) {
            addCriterion("controller_epoch not in", values, "controllerEpoch");
            return (Criteria) this;
        }

        public Criteria andControllerEpochBetween(Integer value1, Integer value2) {
            addCriterion("controller_epoch between", value1, value2, "controllerEpoch");
            return (Criteria) this;
        }

        public Criteria andControllerEpochNotBetween(Integer value1, Integer value2) {
            addCriterion("controller_epoch not between", value1, value2, "controllerEpoch");
            return (Criteria) this;
        }

        public Criteria andBrokerCountIsNull() {
            addCriterion("broker_count is null");
            return (Criteria) this;
        }

        public Criteria andBrokerCountIsNotNull() {
            addCriterion("broker_count is not null");
            return (Criteria) this;
        }

        public Criteria andBrokerCountEqualTo(Integer value) {
            addCriterion("broker_count =", value, "brokerCount");
            return (Criteria) this;
        }

        public Criteria andBrokerCountNotEqualTo(Integer value) {
            addCriterion("broker_count <>", value, "brokerCount");
            return (Criteria) this;
        }

        public Criteria andBrokerCountGreaterThan(Integer value) {
            addCriterion("broker_count >", value, "brokerCount");
            return (Criteria) this;
        }

        public Criteria andBrokerCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("broker_count >=", value, "brokerCount");
            return (Criteria) this;
        }

        public Criteria andBrokerCountLessThan(Integer value) {
            addCriterion("broker_count <", value, "brokerCount");
            return (Criteria) this;
        }

        public Criteria andBrokerCountLessThanOrEqualTo(Integer value) {
            addCriterion("broker_count <=", value, "brokerCount");
            return (Criteria) this;
        }

        public Criteria andBrokerCountIn(List<Integer> values) {
            addCriterion("broker_count in", values, "brokerCount");
            return (Criteria) this;
        }

        public Criteria andBrokerCountNotIn(List<Integer> values) {
            addCriterion("broker_count not in", values, "brokerCount");
            return (Criteria) this;
        }

        public Criteria andBrokerCountBetween(Integer value1, Integer value2) {
            addCriterion("broker_count between", value1, value2, "brokerCount");
            return (Criteria) this;
        }

        public Criteria andBrokerCountNotBetween(Integer value1, Integer value2) {
            addCriterion("broker_count not between", value1, value2, "brokerCount");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
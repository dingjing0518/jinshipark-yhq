package com.jinshipark.yhq.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LincensePlateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LincensePlateExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andLpIdIsNull() {
            addCriterion("lp_id is null");
            return (Criteria) this;
        }

        public Criteria andLpIdIsNotNull() {
            addCriterion("lp_id is not null");
            return (Criteria) this;
        }

        public Criteria andLpIdEqualTo(Integer value) {
            addCriterion("lp_id =", value, "lpId");
            return (Criteria) this;
        }

        public Criteria andLpIdNotEqualTo(Integer value) {
            addCriterion("lp_id <>", value, "lpId");
            return (Criteria) this;
        }

        public Criteria andLpIdGreaterThan(Integer value) {
            addCriterion("lp_id >", value, "lpId");
            return (Criteria) this;
        }

        public Criteria andLpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lp_id >=", value, "lpId");
            return (Criteria) this;
        }

        public Criteria andLpIdLessThan(Integer value) {
            addCriterion("lp_id <", value, "lpId");
            return (Criteria) this;
        }

        public Criteria andLpIdLessThanOrEqualTo(Integer value) {
            addCriterion("lp_id <=", value, "lpId");
            return (Criteria) this;
        }

        public Criteria andLpIdIn(List<Integer> values) {
            addCriterion("lp_id in", values, "lpId");
            return (Criteria) this;
        }

        public Criteria andLpIdNotIn(List<Integer> values) {
            addCriterion("lp_id not in", values, "lpId");
            return (Criteria) this;
        }

        public Criteria andLpIdBetween(Integer value1, Integer value2) {
            addCriterion("lp_id between", value1, value2, "lpId");
            return (Criteria) this;
        }

        public Criteria andLpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lp_id not between", value1, value2, "lpId");
            return (Criteria) this;
        }

        public Criteria andLpMemberIdCarIsNull() {
            addCriterion("lp_member_id_car is null");
            return (Criteria) this;
        }

        public Criteria andLpMemberIdCarIsNotNull() {
            addCriterion("lp_member_id_car is not null");
            return (Criteria) this;
        }

        public Criteria andLpMemberIdCarEqualTo(String value) {
            addCriterion("lp_member_id_car =", value, "lpMemberIdCar");
            return (Criteria) this;
        }

        public Criteria andLpMemberIdCarNotEqualTo(String value) {
            addCriterion("lp_member_id_car <>", value, "lpMemberIdCar");
            return (Criteria) this;
        }

        public Criteria andLpMemberIdCarGreaterThan(String value) {
            addCriterion("lp_member_id_car >", value, "lpMemberIdCar");
            return (Criteria) this;
        }

        public Criteria andLpMemberIdCarGreaterThanOrEqualTo(String value) {
            addCriterion("lp_member_id_car >=", value, "lpMemberIdCar");
            return (Criteria) this;
        }

        public Criteria andLpMemberIdCarLessThan(String value) {
            addCriterion("lp_member_id_car <", value, "lpMemberIdCar");
            return (Criteria) this;
        }

        public Criteria andLpMemberIdCarLessThanOrEqualTo(String value) {
            addCriterion("lp_member_id_car <=", value, "lpMemberIdCar");
            return (Criteria) this;
        }

        public Criteria andLpMemberIdCarLike(String value) {
            addCriterion("lp_member_id_car like", value, "lpMemberIdCar");
            return (Criteria) this;
        }

        public Criteria andLpMemberIdCarNotLike(String value) {
            addCriterion("lp_member_id_car not like", value, "lpMemberIdCar");
            return (Criteria) this;
        }

        public Criteria andLpMemberIdCarIn(List<String> values) {
            addCriterion("lp_member_id_car in", values, "lpMemberIdCar");
            return (Criteria) this;
        }

        public Criteria andLpMemberIdCarNotIn(List<String> values) {
            addCriterion("lp_member_id_car not in", values, "lpMemberIdCar");
            return (Criteria) this;
        }

        public Criteria andLpMemberIdCarBetween(String value1, String value2) {
            addCriterion("lp_member_id_car between", value1, value2, "lpMemberIdCar");
            return (Criteria) this;
        }

        public Criteria andLpMemberIdCarNotBetween(String value1, String value2) {
            addCriterion("lp_member_id_car not between", value1, value2, "lpMemberIdCar");
            return (Criteria) this;
        }

        public Criteria andLpLincensePlateIdCarIsNull() {
            addCriterion("lp_lincense_plate_id_car is null");
            return (Criteria) this;
        }

        public Criteria andLpLincensePlateIdCarIsNotNull() {
            addCriterion("lp_lincense_plate_id_car is not null");
            return (Criteria) this;
        }

        public Criteria andLpLincensePlateIdCarEqualTo(String value) {
            addCriterion("lp_lincense_plate_id_car =", value, "lpLincensePlateIdCar");
            return (Criteria) this;
        }

        public Criteria andLpLincensePlateIdCarNotEqualTo(String value) {
            addCriterion("lp_lincense_plate_id_car <>", value, "lpLincensePlateIdCar");
            return (Criteria) this;
        }

        public Criteria andLpLincensePlateIdCarGreaterThan(String value) {
            addCriterion("lp_lincense_plate_id_car >", value, "lpLincensePlateIdCar");
            return (Criteria) this;
        }

        public Criteria andLpLincensePlateIdCarGreaterThanOrEqualTo(String value) {
            addCriterion("lp_lincense_plate_id_car >=", value, "lpLincensePlateIdCar");
            return (Criteria) this;
        }

        public Criteria andLpLincensePlateIdCarLessThan(String value) {
            addCriterion("lp_lincense_plate_id_car <", value, "lpLincensePlateIdCar");
            return (Criteria) this;
        }

        public Criteria andLpLincensePlateIdCarLessThanOrEqualTo(String value) {
            addCriterion("lp_lincense_plate_id_car <=", value, "lpLincensePlateIdCar");
            return (Criteria) this;
        }

        public Criteria andLpLincensePlateIdCarLike(String value) {
            addCriterion("lp_lincense_plate_id_car like", value, "lpLincensePlateIdCar");
            return (Criteria) this;
        }

        public Criteria andLpLincensePlateIdCarNotLike(String value) {
            addCriterion("lp_lincense_plate_id_car not like", value, "lpLincensePlateIdCar");
            return (Criteria) this;
        }

        public Criteria andLpLincensePlateIdCarIn(List<String> values) {
            addCriterion("lp_lincense_plate_id_car in", values, "lpLincensePlateIdCar");
            return (Criteria) this;
        }

        public Criteria andLpLincensePlateIdCarNotIn(List<String> values) {
            addCriterion("lp_lincense_plate_id_car not in", values, "lpLincensePlateIdCar");
            return (Criteria) this;
        }

        public Criteria andLpLincensePlateIdCarBetween(String value1, String value2) {
            addCriterion("lp_lincense_plate_id_car between", value1, value2, "lpLincensePlateIdCar");
            return (Criteria) this;
        }

        public Criteria andLpLincensePlateIdCarNotBetween(String value1, String value2) {
            addCriterion("lp_lincense_plate_id_car not between", value1, value2, "lpLincensePlateIdCar");
            return (Criteria) this;
        }

        public Criteria andLpServiceTypeCarIsNull() {
            addCriterion("lp_service_type_car is null");
            return (Criteria) this;
        }

        public Criteria andLpServiceTypeCarIsNotNull() {
            addCriterion("lp_service_type_car is not null");
            return (Criteria) this;
        }

        public Criteria andLpServiceTypeCarEqualTo(String value) {
            addCriterion("lp_service_type_car =", value, "lpServiceTypeCar");
            return (Criteria) this;
        }

        public Criteria andLpServiceTypeCarNotEqualTo(String value) {
            addCriterion("lp_service_type_car <>", value, "lpServiceTypeCar");
            return (Criteria) this;
        }

        public Criteria andLpServiceTypeCarGreaterThan(String value) {
            addCriterion("lp_service_type_car >", value, "lpServiceTypeCar");
            return (Criteria) this;
        }

        public Criteria andLpServiceTypeCarGreaterThanOrEqualTo(String value) {
            addCriterion("lp_service_type_car >=", value, "lpServiceTypeCar");
            return (Criteria) this;
        }

        public Criteria andLpServiceTypeCarLessThan(String value) {
            addCriterion("lp_service_type_car <", value, "lpServiceTypeCar");
            return (Criteria) this;
        }

        public Criteria andLpServiceTypeCarLessThanOrEqualTo(String value) {
            addCriterion("lp_service_type_car <=", value, "lpServiceTypeCar");
            return (Criteria) this;
        }

        public Criteria andLpServiceTypeCarLike(String value) {
            addCriterion("lp_service_type_car like", value, "lpServiceTypeCar");
            return (Criteria) this;
        }

        public Criteria andLpServiceTypeCarNotLike(String value) {
            addCriterion("lp_service_type_car not like", value, "lpServiceTypeCar");
            return (Criteria) this;
        }

        public Criteria andLpServiceTypeCarIn(List<String> values) {
            addCriterion("lp_service_type_car in", values, "lpServiceTypeCar");
            return (Criteria) this;
        }

        public Criteria andLpServiceTypeCarNotIn(List<String> values) {
            addCriterion("lp_service_type_car not in", values, "lpServiceTypeCar");
            return (Criteria) this;
        }

        public Criteria andLpServiceTypeCarBetween(String value1, String value2) {
            addCriterion("lp_service_type_car between", value1, value2, "lpServiceTypeCar");
            return (Criteria) this;
        }

        public Criteria andLpServiceTypeCarNotBetween(String value1, String value2) {
            addCriterion("lp_service_type_car not between", value1, value2, "lpServiceTypeCar");
            return (Criteria) this;
        }

        public Criteria andLpInboundTimeIsNull() {
            addCriterion("lp_inbound_time is null");
            return (Criteria) this;
        }

        public Criteria andLpInboundTimeIsNotNull() {
            addCriterion("lp_inbound_time is not null");
            return (Criteria) this;
        }

        public Criteria andLpInboundTimeEqualTo(Date value) {
            addCriterion("lp_inbound_time =", value, "lpInboundTime");
            return (Criteria) this;
        }

        public Criteria andLpInboundTimeNotEqualTo(Date value) {
            addCriterion("lp_inbound_time <>", value, "lpInboundTime");
            return (Criteria) this;
        }

        public Criteria andLpInboundTimeGreaterThan(Date value) {
            addCriterion("lp_inbound_time >", value, "lpInboundTime");
            return (Criteria) this;
        }

        public Criteria andLpInboundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lp_inbound_time >=", value, "lpInboundTime");
            return (Criteria) this;
        }

        public Criteria andLpInboundTimeLessThan(Date value) {
            addCriterion("lp_inbound_time <", value, "lpInboundTime");
            return (Criteria) this;
        }

        public Criteria andLpInboundTimeLessThanOrEqualTo(Date value) {
            addCriterion("lp_inbound_time <=", value, "lpInboundTime");
            return (Criteria) this;
        }

        public Criteria andLpInboundTimeIn(List<Date> values) {
            addCriterion("lp_inbound_time in", values, "lpInboundTime");
            return (Criteria) this;
        }

        public Criteria andLpInboundTimeNotIn(List<Date> values) {
            addCriterion("lp_inbound_time not in", values, "lpInboundTime");
            return (Criteria) this;
        }

        public Criteria andLpInboundTimeBetween(Date value1, Date value2) {
            addCriterion("lp_inbound_time between", value1, value2, "lpInboundTime");
            return (Criteria) this;
        }

        public Criteria andLpInboundTimeNotBetween(Date value1, Date value2) {
            addCriterion("lp_inbound_time not between", value1, value2, "lpInboundTime");
            return (Criteria) this;
        }

        public Criteria andLpDepartureTimeIsNull() {
            addCriterion("lp_departure_time is null");
            return (Criteria) this;
        }

        public Criteria andLpDepartureTimeIsNotNull() {
            addCriterion("lp_departure_time is not null");
            return (Criteria) this;
        }

        public Criteria andLpDepartureTimeEqualTo(Date value) {
            addCriterion("lp_departure_time =", value, "lpDepartureTime");
            return (Criteria) this;
        }

        public Criteria andLpDepartureTimeNotEqualTo(Date value) {
            addCriterion("lp_departure_time <>", value, "lpDepartureTime");
            return (Criteria) this;
        }

        public Criteria andLpDepartureTimeGreaterThan(Date value) {
            addCriterion("lp_departure_time >", value, "lpDepartureTime");
            return (Criteria) this;
        }

        public Criteria andLpDepartureTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lp_departure_time >=", value, "lpDepartureTime");
            return (Criteria) this;
        }

        public Criteria andLpDepartureTimeLessThan(Date value) {
            addCriterion("lp_departure_time <", value, "lpDepartureTime");
            return (Criteria) this;
        }

        public Criteria andLpDepartureTimeLessThanOrEqualTo(Date value) {
            addCriterion("lp_departure_time <=", value, "lpDepartureTime");
            return (Criteria) this;
        }

        public Criteria andLpDepartureTimeIn(List<Date> values) {
            addCriterion("lp_departure_time in", values, "lpDepartureTime");
            return (Criteria) this;
        }

        public Criteria andLpDepartureTimeNotIn(List<Date> values) {
            addCriterion("lp_departure_time not in", values, "lpDepartureTime");
            return (Criteria) this;
        }

        public Criteria andLpDepartureTimeBetween(Date value1, Date value2) {
            addCriterion("lp_departure_time between", value1, value2, "lpDepartureTime");
            return (Criteria) this;
        }

        public Criteria andLpDepartureTimeNotBetween(Date value1, Date value2) {
            addCriterion("lp_departure_time not between", value1, value2, "lpDepartureTime");
            return (Criteria) this;
        }

        public Criteria andLpRentTimeIsNull() {
            addCriterion("lp_rent_time is null");
            return (Criteria) this;
        }

        public Criteria andLpRentTimeIsNotNull() {
            addCriterion("lp_rent_time is not null");
            return (Criteria) this;
        }

        public Criteria andLpRentTimeEqualTo(String value) {
            addCriterion("lp_rent_time =", value, "lpRentTime");
            return (Criteria) this;
        }

        public Criteria andLpRentTimeNotEqualTo(String value) {
            addCriterion("lp_rent_time <>", value, "lpRentTime");
            return (Criteria) this;
        }

        public Criteria andLpRentTimeGreaterThan(String value) {
            addCriterion("lp_rent_time >", value, "lpRentTime");
            return (Criteria) this;
        }

        public Criteria andLpRentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("lp_rent_time >=", value, "lpRentTime");
            return (Criteria) this;
        }

        public Criteria andLpRentTimeLessThan(String value) {
            addCriterion("lp_rent_time <", value, "lpRentTime");
            return (Criteria) this;
        }

        public Criteria andLpRentTimeLessThanOrEqualTo(String value) {
            addCriterion("lp_rent_time <=", value, "lpRentTime");
            return (Criteria) this;
        }

        public Criteria andLpRentTimeLike(String value) {
            addCriterion("lp_rent_time like", value, "lpRentTime");
            return (Criteria) this;
        }

        public Criteria andLpRentTimeNotLike(String value) {
            addCriterion("lp_rent_time not like", value, "lpRentTime");
            return (Criteria) this;
        }

        public Criteria andLpRentTimeIn(List<String> values) {
            addCriterion("lp_rent_time in", values, "lpRentTime");
            return (Criteria) this;
        }

        public Criteria andLpRentTimeNotIn(List<String> values) {
            addCriterion("lp_rent_time not in", values, "lpRentTime");
            return (Criteria) this;
        }

        public Criteria andLpRentTimeBetween(String value1, String value2) {
            addCriterion("lp_rent_time between", value1, value2, "lpRentTime");
            return (Criteria) this;
        }

        public Criteria andLpRentTimeNotBetween(String value1, String value2) {
            addCriterion("lp_rent_time not between", value1, value2, "lpRentTime");
            return (Criteria) this;
        }

        public Criteria andLpCreateTimeIsNull() {
            addCriterion("lp_create_time is null");
            return (Criteria) this;
        }

        public Criteria andLpCreateTimeIsNotNull() {
            addCriterion("lp_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andLpCreateTimeEqualTo(Date value) {
            addCriterion("lp_create_time =", value, "lpCreateTime");
            return (Criteria) this;
        }

        public Criteria andLpCreateTimeNotEqualTo(Date value) {
            addCriterion("lp_create_time <>", value, "lpCreateTime");
            return (Criteria) this;
        }

        public Criteria andLpCreateTimeGreaterThan(Date value) {
            addCriterion("lp_create_time >", value, "lpCreateTime");
            return (Criteria) this;
        }

        public Criteria andLpCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lp_create_time >=", value, "lpCreateTime");
            return (Criteria) this;
        }

        public Criteria andLpCreateTimeLessThan(Date value) {
            addCriterion("lp_create_time <", value, "lpCreateTime");
            return (Criteria) this;
        }

        public Criteria andLpCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("lp_create_time <=", value, "lpCreateTime");
            return (Criteria) this;
        }

        public Criteria andLpCreateTimeIn(List<Date> values) {
            addCriterion("lp_create_time in", values, "lpCreateTime");
            return (Criteria) this;
        }

        public Criteria andLpCreateTimeNotIn(List<Date> values) {
            addCriterion("lp_create_time not in", values, "lpCreateTime");
            return (Criteria) this;
        }

        public Criteria andLpCreateTimeBetween(Date value1, Date value2) {
            addCriterion("lp_create_time between", value1, value2, "lpCreateTime");
            return (Criteria) this;
        }

        public Criteria andLpCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("lp_create_time not between", value1, value2, "lpCreateTime");
            return (Criteria) this;
        }

        public Criteria andLpOrderIdIsNull() {
            addCriterion("lp_order_id is null");
            return (Criteria) this;
        }

        public Criteria andLpOrderIdIsNotNull() {
            addCriterion("lp_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andLpOrderIdEqualTo(String value) {
            addCriterion("lp_order_id =", value, "lpOrderId");
            return (Criteria) this;
        }

        public Criteria andLpOrderIdNotEqualTo(String value) {
            addCriterion("lp_order_id <>", value, "lpOrderId");
            return (Criteria) this;
        }

        public Criteria andLpOrderIdGreaterThan(String value) {
            addCriterion("lp_order_id >", value, "lpOrderId");
            return (Criteria) this;
        }

        public Criteria andLpOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("lp_order_id >=", value, "lpOrderId");
            return (Criteria) this;
        }

        public Criteria andLpOrderIdLessThan(String value) {
            addCriterion("lp_order_id <", value, "lpOrderId");
            return (Criteria) this;
        }

        public Criteria andLpOrderIdLessThanOrEqualTo(String value) {
            addCriterion("lp_order_id <=", value, "lpOrderId");
            return (Criteria) this;
        }

        public Criteria andLpOrderIdLike(String value) {
            addCriterion("lp_order_id like", value, "lpOrderId");
            return (Criteria) this;
        }

        public Criteria andLpOrderIdNotLike(String value) {
            addCriterion("lp_order_id not like", value, "lpOrderId");
            return (Criteria) this;
        }

        public Criteria andLpOrderIdIn(List<String> values) {
            addCriterion("lp_order_id in", values, "lpOrderId");
            return (Criteria) this;
        }

        public Criteria andLpOrderIdNotIn(List<String> values) {
            addCriterion("lp_order_id not in", values, "lpOrderId");
            return (Criteria) this;
        }

        public Criteria andLpOrderIdBetween(String value1, String value2) {
            addCriterion("lp_order_id between", value1, value2, "lpOrderId");
            return (Criteria) this;
        }

        public Criteria andLpOrderIdNotBetween(String value1, String value2) {
            addCriterion("lp_order_id not between", value1, value2, "lpOrderId");
            return (Criteria) this;
        }

        public Criteria andLpCarTypeIsNull() {
            addCriterion("lp_car_type is null");
            return (Criteria) this;
        }

        public Criteria andLpCarTypeIsNotNull() {
            addCriterion("lp_car_type is not null");
            return (Criteria) this;
        }

        public Criteria andLpCarTypeEqualTo(String value) {
            addCriterion("lp_car_type =", value, "lpCarType");
            return (Criteria) this;
        }

        public Criteria andLpCarTypeNotEqualTo(String value) {
            addCriterion("lp_car_type <>", value, "lpCarType");
            return (Criteria) this;
        }

        public Criteria andLpCarTypeGreaterThan(String value) {
            addCriterion("lp_car_type >", value, "lpCarType");
            return (Criteria) this;
        }

        public Criteria andLpCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("lp_car_type >=", value, "lpCarType");
            return (Criteria) this;
        }

        public Criteria andLpCarTypeLessThan(String value) {
            addCriterion("lp_car_type <", value, "lpCarType");
            return (Criteria) this;
        }

        public Criteria andLpCarTypeLessThanOrEqualTo(String value) {
            addCriterion("lp_car_type <=", value, "lpCarType");
            return (Criteria) this;
        }

        public Criteria andLpCarTypeLike(String value) {
            addCriterion("lp_car_type like", value, "lpCarType");
            return (Criteria) this;
        }

        public Criteria andLpCarTypeNotLike(String value) {
            addCriterion("lp_car_type not like", value, "lpCarType");
            return (Criteria) this;
        }

        public Criteria andLpCarTypeIn(List<String> values) {
            addCriterion("lp_car_type in", values, "lpCarType");
            return (Criteria) this;
        }

        public Criteria andLpCarTypeNotIn(List<String> values) {
            addCriterion("lp_car_type not in", values, "lpCarType");
            return (Criteria) this;
        }

        public Criteria andLpCarTypeBetween(String value1, String value2) {
            addCriterion("lp_car_type between", value1, value2, "lpCarType");
            return (Criteria) this;
        }

        public Criteria andLpCarTypeNotBetween(String value1, String value2) {
            addCriterion("lp_car_type not between", value1, value2, "lpCarType");
            return (Criteria) this;
        }

        public Criteria andLpCarColorIsNull() {
            addCriterion("lp_car_color is null");
            return (Criteria) this;
        }

        public Criteria andLpCarColorIsNotNull() {
            addCriterion("lp_car_color is not null");
            return (Criteria) this;
        }

        public Criteria andLpCarColorEqualTo(String value) {
            addCriterion("lp_car_color =", value, "lpCarColor");
            return (Criteria) this;
        }

        public Criteria andLpCarColorNotEqualTo(String value) {
            addCriterion("lp_car_color <>", value, "lpCarColor");
            return (Criteria) this;
        }

        public Criteria andLpCarColorGreaterThan(String value) {
            addCriterion("lp_car_color >", value, "lpCarColor");
            return (Criteria) this;
        }

        public Criteria andLpCarColorGreaterThanOrEqualTo(String value) {
            addCriterion("lp_car_color >=", value, "lpCarColor");
            return (Criteria) this;
        }

        public Criteria andLpCarColorLessThan(String value) {
            addCriterion("lp_car_color <", value, "lpCarColor");
            return (Criteria) this;
        }

        public Criteria andLpCarColorLessThanOrEqualTo(String value) {
            addCriterion("lp_car_color <=", value, "lpCarColor");
            return (Criteria) this;
        }

        public Criteria andLpCarColorLike(String value) {
            addCriterion("lp_car_color like", value, "lpCarColor");
            return (Criteria) this;
        }

        public Criteria andLpCarColorNotLike(String value) {
            addCriterion("lp_car_color not like", value, "lpCarColor");
            return (Criteria) this;
        }

        public Criteria andLpCarColorIn(List<String> values) {
            addCriterion("lp_car_color in", values, "lpCarColor");
            return (Criteria) this;
        }

        public Criteria andLpCarColorNotIn(List<String> values) {
            addCriterion("lp_car_color not in", values, "lpCarColor");
            return (Criteria) this;
        }

        public Criteria andLpCarColorBetween(String value1, String value2) {
            addCriterion("lp_car_color between", value1, value2, "lpCarColor");
            return (Criteria) this;
        }

        public Criteria andLpCarColorNotBetween(String value1, String value2) {
            addCriterion("lp_car_color not between", value1, value2, "lpCarColor");
            return (Criteria) this;
        }

        public Criteria andLpLincenseTypeIsNull() {
            addCriterion("lp_lincense_type is null");
            return (Criteria) this;
        }

        public Criteria andLpLincenseTypeIsNotNull() {
            addCriterion("lp_lincense_type is not null");
            return (Criteria) this;
        }

        public Criteria andLpLincenseTypeEqualTo(String value) {
            addCriterion("lp_lincense_type =", value, "lpLincenseType");
            return (Criteria) this;
        }

        public Criteria andLpLincenseTypeNotEqualTo(String value) {
            addCriterion("lp_lincense_type <>", value, "lpLincenseType");
            return (Criteria) this;
        }

        public Criteria andLpLincenseTypeGreaterThan(String value) {
            addCriterion("lp_lincense_type >", value, "lpLincenseType");
            return (Criteria) this;
        }

        public Criteria andLpLincenseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("lp_lincense_type >=", value, "lpLincenseType");
            return (Criteria) this;
        }

        public Criteria andLpLincenseTypeLessThan(String value) {
            addCriterion("lp_lincense_type <", value, "lpLincenseType");
            return (Criteria) this;
        }

        public Criteria andLpLincenseTypeLessThanOrEqualTo(String value) {
            addCriterion("lp_lincense_type <=", value, "lpLincenseType");
            return (Criteria) this;
        }

        public Criteria andLpLincenseTypeLike(String value) {
            addCriterion("lp_lincense_type like", value, "lpLincenseType");
            return (Criteria) this;
        }

        public Criteria andLpLincenseTypeNotLike(String value) {
            addCriterion("lp_lincense_type not like", value, "lpLincenseType");
            return (Criteria) this;
        }

        public Criteria andLpLincenseTypeIn(List<String> values) {
            addCriterion("lp_lincense_type in", values, "lpLincenseType");
            return (Criteria) this;
        }

        public Criteria andLpLincenseTypeNotIn(List<String> values) {
            addCriterion("lp_lincense_type not in", values, "lpLincenseType");
            return (Criteria) this;
        }

        public Criteria andLpLincenseTypeBetween(String value1, String value2) {
            addCriterion("lp_lincense_type between", value1, value2, "lpLincenseType");
            return (Criteria) this;
        }

        public Criteria andLpLincenseTypeNotBetween(String value1, String value2) {
            addCriterion("lp_lincense_type not between", value1, value2, "lpLincenseType");
            return (Criteria) this;
        }

        public Criteria andLpParkingOftenIsNull() {
            addCriterion("lp_parking_often is null");
            return (Criteria) this;
        }

        public Criteria andLpParkingOftenIsNotNull() {
            addCriterion("lp_parking_often is not null");
            return (Criteria) this;
        }

        public Criteria andLpParkingOftenEqualTo(String value) {
            addCriterion("lp_parking_often =", value, "lpParkingOften");
            return (Criteria) this;
        }

        public Criteria andLpParkingOftenNotEqualTo(String value) {
            addCriterion("lp_parking_often <>", value, "lpParkingOften");
            return (Criteria) this;
        }

        public Criteria andLpParkingOftenGreaterThan(String value) {
            addCriterion("lp_parking_often >", value, "lpParkingOften");
            return (Criteria) this;
        }

        public Criteria andLpParkingOftenGreaterThanOrEqualTo(String value) {
            addCriterion("lp_parking_often >=", value, "lpParkingOften");
            return (Criteria) this;
        }

        public Criteria andLpParkingOftenLessThan(String value) {
            addCriterion("lp_parking_often <", value, "lpParkingOften");
            return (Criteria) this;
        }

        public Criteria andLpParkingOftenLessThanOrEqualTo(String value) {
            addCriterion("lp_parking_often <=", value, "lpParkingOften");
            return (Criteria) this;
        }

        public Criteria andLpParkingOftenLike(String value) {
            addCriterion("lp_parking_often like", value, "lpParkingOften");
            return (Criteria) this;
        }

        public Criteria andLpParkingOftenNotLike(String value) {
            addCriterion("lp_parking_often not like", value, "lpParkingOften");
            return (Criteria) this;
        }

        public Criteria andLpParkingOftenIn(List<String> values) {
            addCriterion("lp_parking_often in", values, "lpParkingOften");
            return (Criteria) this;
        }

        public Criteria andLpParkingOftenNotIn(List<String> values) {
            addCriterion("lp_parking_often not in", values, "lpParkingOften");
            return (Criteria) this;
        }

        public Criteria andLpParkingOftenBetween(String value1, String value2) {
            addCriterion("lp_parking_often between", value1, value2, "lpParkingOften");
            return (Criteria) this;
        }

        public Criteria andLpParkingOftenNotBetween(String value1, String value2) {
            addCriterion("lp_parking_often not between", value1, value2, "lpParkingOften");
            return (Criteria) this;
        }

        public Criteria andLpParkingCostIsNull() {
            addCriterion("lp_parking_cost is null");
            return (Criteria) this;
        }

        public Criteria andLpParkingCostIsNotNull() {
            addCriterion("lp_parking_cost is not null");
            return (Criteria) this;
        }

        public Criteria andLpParkingCostEqualTo(String value) {
            addCriterion("lp_parking_cost =", value, "lpParkingCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingCostNotEqualTo(String value) {
            addCriterion("lp_parking_cost <>", value, "lpParkingCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingCostGreaterThan(String value) {
            addCriterion("lp_parking_cost >", value, "lpParkingCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingCostGreaterThanOrEqualTo(String value) {
            addCriterion("lp_parking_cost >=", value, "lpParkingCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingCostLessThan(String value) {
            addCriterion("lp_parking_cost <", value, "lpParkingCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingCostLessThanOrEqualTo(String value) {
            addCriterion("lp_parking_cost <=", value, "lpParkingCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingCostLike(String value) {
            addCriterion("lp_parking_cost like", value, "lpParkingCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingCostNotLike(String value) {
            addCriterion("lp_parking_cost not like", value, "lpParkingCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingCostIn(List<String> values) {
            addCriterion("lp_parking_cost in", values, "lpParkingCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingCostNotIn(List<String> values) {
            addCriterion("lp_parking_cost not in", values, "lpParkingCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingCostBetween(String value1, String value2) {
            addCriterion("lp_parking_cost between", value1, value2, "lpParkingCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingCostNotBetween(String value1, String value2) {
            addCriterion("lp_parking_cost not between", value1, value2, "lpParkingCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingRealCostIsNull() {
            addCriterion("lp_parking_real_cost is null");
            return (Criteria) this;
        }

        public Criteria andLpParkingRealCostIsNotNull() {
            addCriterion("lp_parking_real_cost is not null");
            return (Criteria) this;
        }

        public Criteria andLpParkingRealCostEqualTo(String value) {
            addCriterion("lp_parking_real_cost =", value, "lpParkingRealCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingRealCostNotEqualTo(String value) {
            addCriterion("lp_parking_real_cost <>", value, "lpParkingRealCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingRealCostGreaterThan(String value) {
            addCriterion("lp_parking_real_cost >", value, "lpParkingRealCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingRealCostGreaterThanOrEqualTo(String value) {
            addCriterion("lp_parking_real_cost >=", value, "lpParkingRealCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingRealCostLessThan(String value) {
            addCriterion("lp_parking_real_cost <", value, "lpParkingRealCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingRealCostLessThanOrEqualTo(String value) {
            addCriterion("lp_parking_real_cost <=", value, "lpParkingRealCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingRealCostLike(String value) {
            addCriterion("lp_parking_real_cost like", value, "lpParkingRealCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingRealCostNotLike(String value) {
            addCriterion("lp_parking_real_cost not like", value, "lpParkingRealCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingRealCostIn(List<String> values) {
            addCriterion("lp_parking_real_cost in", values, "lpParkingRealCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingRealCostNotIn(List<String> values) {
            addCriterion("lp_parking_real_cost not in", values, "lpParkingRealCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingRealCostBetween(String value1, String value2) {
            addCriterion("lp_parking_real_cost between", value1, value2, "lpParkingRealCost");
            return (Criteria) this;
        }

        public Criteria andLpParkingRealCostNotBetween(String value1, String value2) {
            addCriterion("lp_parking_real_cost not between", value1, value2, "lpParkingRealCost");
            return (Criteria) this;
        }

        public Criteria andLpInboundCnameIsNull() {
            addCriterion("lp_inbound_cname is null");
            return (Criteria) this;
        }

        public Criteria andLpInboundCnameIsNotNull() {
            addCriterion("lp_inbound_cname is not null");
            return (Criteria) this;
        }

        public Criteria andLpInboundCnameEqualTo(String value) {
            addCriterion("lp_inbound_cname =", value, "lpInboundCname");
            return (Criteria) this;
        }

        public Criteria andLpInboundCnameNotEqualTo(String value) {
            addCriterion("lp_inbound_cname <>", value, "lpInboundCname");
            return (Criteria) this;
        }

        public Criteria andLpInboundCnameGreaterThan(String value) {
            addCriterion("lp_inbound_cname >", value, "lpInboundCname");
            return (Criteria) this;
        }

        public Criteria andLpInboundCnameGreaterThanOrEqualTo(String value) {
            addCriterion("lp_inbound_cname >=", value, "lpInboundCname");
            return (Criteria) this;
        }

        public Criteria andLpInboundCnameLessThan(String value) {
            addCriterion("lp_inbound_cname <", value, "lpInboundCname");
            return (Criteria) this;
        }

        public Criteria andLpInboundCnameLessThanOrEqualTo(String value) {
            addCriterion("lp_inbound_cname <=", value, "lpInboundCname");
            return (Criteria) this;
        }

        public Criteria andLpInboundCnameLike(String value) {
            addCriterion("lp_inbound_cname like", value, "lpInboundCname");
            return (Criteria) this;
        }

        public Criteria andLpInboundCnameNotLike(String value) {
            addCriterion("lp_inbound_cname not like", value, "lpInboundCname");
            return (Criteria) this;
        }

        public Criteria andLpInboundCnameIn(List<String> values) {
            addCriterion("lp_inbound_cname in", values, "lpInboundCname");
            return (Criteria) this;
        }

        public Criteria andLpInboundCnameNotIn(List<String> values) {
            addCriterion("lp_inbound_cname not in", values, "lpInboundCname");
            return (Criteria) this;
        }

        public Criteria andLpInboundCnameBetween(String value1, String value2) {
            addCriterion("lp_inbound_cname between", value1, value2, "lpInboundCname");
            return (Criteria) this;
        }

        public Criteria andLpInboundCnameNotBetween(String value1, String value2) {
            addCriterion("lp_inbound_cname not between", value1, value2, "lpInboundCname");
            return (Criteria) this;
        }

        public Criteria andLpDepartureCnameIsNull() {
            addCriterion("lp_departure_cname is null");
            return (Criteria) this;
        }

        public Criteria andLpDepartureCnameIsNotNull() {
            addCriterion("lp_departure_cname is not null");
            return (Criteria) this;
        }

        public Criteria andLpDepartureCnameEqualTo(String value) {
            addCriterion("lp_departure_cname =", value, "lpDepartureCname");
            return (Criteria) this;
        }

        public Criteria andLpDepartureCnameNotEqualTo(String value) {
            addCriterion("lp_departure_cname <>", value, "lpDepartureCname");
            return (Criteria) this;
        }

        public Criteria andLpDepartureCnameGreaterThan(String value) {
            addCriterion("lp_departure_cname >", value, "lpDepartureCname");
            return (Criteria) this;
        }

        public Criteria andLpDepartureCnameGreaterThanOrEqualTo(String value) {
            addCriterion("lp_departure_cname >=", value, "lpDepartureCname");
            return (Criteria) this;
        }

        public Criteria andLpDepartureCnameLessThan(String value) {
            addCriterion("lp_departure_cname <", value, "lpDepartureCname");
            return (Criteria) this;
        }

        public Criteria andLpDepartureCnameLessThanOrEqualTo(String value) {
            addCriterion("lp_departure_cname <=", value, "lpDepartureCname");
            return (Criteria) this;
        }

        public Criteria andLpDepartureCnameLike(String value) {
            addCriterion("lp_departure_cname like", value, "lpDepartureCname");
            return (Criteria) this;
        }

        public Criteria andLpDepartureCnameNotLike(String value) {
            addCriterion("lp_departure_cname not like", value, "lpDepartureCname");
            return (Criteria) this;
        }

        public Criteria andLpDepartureCnameIn(List<String> values) {
            addCriterion("lp_departure_cname in", values, "lpDepartureCname");
            return (Criteria) this;
        }

        public Criteria andLpDepartureCnameNotIn(List<String> values) {
            addCriterion("lp_departure_cname not in", values, "lpDepartureCname");
            return (Criteria) this;
        }

        public Criteria andLpDepartureCnameBetween(String value1, String value2) {
            addCriterion("lp_departure_cname between", value1, value2, "lpDepartureCname");
            return (Criteria) this;
        }

        public Criteria andLpDepartureCnameNotBetween(String value1, String value2) {
            addCriterion("lp_departure_cname not between", value1, value2, "lpDepartureCname");
            return (Criteria) this;
        }

        public Criteria andLpParkingNameIsNull() {
            addCriterion("lp_parking_name is null");
            return (Criteria) this;
        }

        public Criteria andLpParkingNameIsNotNull() {
            addCriterion("lp_parking_name is not null");
            return (Criteria) this;
        }

        public Criteria andLpParkingNameEqualTo(String value) {
            addCriterion("lp_parking_name =", value, "lpParkingName");
            return (Criteria) this;
        }

        public Criteria andLpParkingNameNotEqualTo(String value) {
            addCriterion("lp_parking_name <>", value, "lpParkingName");
            return (Criteria) this;
        }

        public Criteria andLpParkingNameGreaterThan(String value) {
            addCriterion("lp_parking_name >", value, "lpParkingName");
            return (Criteria) this;
        }

        public Criteria andLpParkingNameGreaterThanOrEqualTo(String value) {
            addCriterion("lp_parking_name >=", value, "lpParkingName");
            return (Criteria) this;
        }

        public Criteria andLpParkingNameLessThan(String value) {
            addCriterion("lp_parking_name <", value, "lpParkingName");
            return (Criteria) this;
        }

        public Criteria andLpParkingNameLessThanOrEqualTo(String value) {
            addCriterion("lp_parking_name <=", value, "lpParkingName");
            return (Criteria) this;
        }

        public Criteria andLpParkingNameLike(String value) {
            addCriterion("lp_parking_name like", value, "lpParkingName");
            return (Criteria) this;
        }

        public Criteria andLpParkingNameNotLike(String value) {
            addCriterion("lp_parking_name not like", value, "lpParkingName");
            return (Criteria) this;
        }

        public Criteria andLpParkingNameIn(List<String> values) {
            addCriterion("lp_parking_name in", values, "lpParkingName");
            return (Criteria) this;
        }

        public Criteria andLpParkingNameNotIn(List<String> values) {
            addCriterion("lp_parking_name not in", values, "lpParkingName");
            return (Criteria) this;
        }

        public Criteria andLpParkingNameBetween(String value1, String value2) {
            addCriterion("lp_parking_name between", value1, value2, "lpParkingName");
            return (Criteria) this;
        }

        public Criteria andLpParkingNameNotBetween(String value1, String value2) {
            addCriterion("lp_parking_name not between", value1, value2, "lpParkingName");
            return (Criteria) this;
        }

        public Criteria andLpAgentNameIsNull() {
            addCriterion("lp_agent_name is null");
            return (Criteria) this;
        }

        public Criteria andLpAgentNameIsNotNull() {
            addCriterion("lp_agent_name is not null");
            return (Criteria) this;
        }

        public Criteria andLpAgentNameEqualTo(String value) {
            addCriterion("lp_agent_name =", value, "lpAgentName");
            return (Criteria) this;
        }

        public Criteria andLpAgentNameNotEqualTo(String value) {
            addCriterion("lp_agent_name <>", value, "lpAgentName");
            return (Criteria) this;
        }

        public Criteria andLpAgentNameGreaterThan(String value) {
            addCriterion("lp_agent_name >", value, "lpAgentName");
            return (Criteria) this;
        }

        public Criteria andLpAgentNameGreaterThanOrEqualTo(String value) {
            addCriterion("lp_agent_name >=", value, "lpAgentName");
            return (Criteria) this;
        }

        public Criteria andLpAgentNameLessThan(String value) {
            addCriterion("lp_agent_name <", value, "lpAgentName");
            return (Criteria) this;
        }

        public Criteria andLpAgentNameLessThanOrEqualTo(String value) {
            addCriterion("lp_agent_name <=", value, "lpAgentName");
            return (Criteria) this;
        }

        public Criteria andLpAgentNameLike(String value) {
            addCriterion("lp_agent_name like", value, "lpAgentName");
            return (Criteria) this;
        }

        public Criteria andLpAgentNameNotLike(String value) {
            addCriterion("lp_agent_name not like", value, "lpAgentName");
            return (Criteria) this;
        }

        public Criteria andLpAgentNameIn(List<String> values) {
            addCriterion("lp_agent_name in", values, "lpAgentName");
            return (Criteria) this;
        }

        public Criteria andLpAgentNameNotIn(List<String> values) {
            addCriterion("lp_agent_name not in", values, "lpAgentName");
            return (Criteria) this;
        }

        public Criteria andLpAgentNameBetween(String value1, String value2) {
            addCriterion("lp_agent_name between", value1, value2, "lpAgentName");
            return (Criteria) this;
        }

        public Criteria andLpAgentNameNotBetween(String value1, String value2) {
            addCriterion("lp_agent_name not between", value1, value2, "lpAgentName");
            return (Criteria) this;
        }

        public Criteria andLpOrderStateIsNull() {
            addCriterion("lp_order_state is null");
            return (Criteria) this;
        }

        public Criteria andLpOrderStateIsNotNull() {
            addCriterion("lp_order_state is not null");
            return (Criteria) this;
        }

        public Criteria andLpOrderStateEqualTo(String value) {
            addCriterion("lp_order_state =", value, "lpOrderState");
            return (Criteria) this;
        }

        public Criteria andLpOrderStateNotEqualTo(String value) {
            addCriterion("lp_order_state <>", value, "lpOrderState");
            return (Criteria) this;
        }

        public Criteria andLpOrderStateGreaterThan(String value) {
            addCriterion("lp_order_state >", value, "lpOrderState");
            return (Criteria) this;
        }

        public Criteria andLpOrderStateGreaterThanOrEqualTo(String value) {
            addCriterion("lp_order_state >=", value, "lpOrderState");
            return (Criteria) this;
        }

        public Criteria andLpOrderStateLessThan(String value) {
            addCriterion("lp_order_state <", value, "lpOrderState");
            return (Criteria) this;
        }

        public Criteria andLpOrderStateLessThanOrEqualTo(String value) {
            addCriterion("lp_order_state <=", value, "lpOrderState");
            return (Criteria) this;
        }

        public Criteria andLpOrderStateLike(String value) {
            addCriterion("lp_order_state like", value, "lpOrderState");
            return (Criteria) this;
        }

        public Criteria andLpOrderStateNotLike(String value) {
            addCriterion("lp_order_state not like", value, "lpOrderState");
            return (Criteria) this;
        }

        public Criteria andLpOrderStateIn(List<String> values) {
            addCriterion("lp_order_state in", values, "lpOrderState");
            return (Criteria) this;
        }

        public Criteria andLpOrderStateNotIn(List<String> values) {
            addCriterion("lp_order_state not in", values, "lpOrderState");
            return (Criteria) this;
        }

        public Criteria andLpOrderStateBetween(String value1, String value2) {
            addCriterion("lp_order_state between", value1, value2, "lpOrderState");
            return (Criteria) this;
        }

        public Criteria andLpOrderStateNotBetween(String value1, String value2) {
            addCriterion("lp_order_state not between", value1, value2, "lpOrderState");
            return (Criteria) this;
        }

        public Criteria andLpPaymentTypeIsNull() {
            addCriterion("lp_payment_type is null");
            return (Criteria) this;
        }

        public Criteria andLpPaymentTypeIsNotNull() {
            addCriterion("lp_payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andLpPaymentTypeEqualTo(String value) {
            addCriterion("lp_payment_type =", value, "lpPaymentType");
            return (Criteria) this;
        }

        public Criteria andLpPaymentTypeNotEqualTo(String value) {
            addCriterion("lp_payment_type <>", value, "lpPaymentType");
            return (Criteria) this;
        }

        public Criteria andLpPaymentTypeGreaterThan(String value) {
            addCriterion("lp_payment_type >", value, "lpPaymentType");
            return (Criteria) this;
        }

        public Criteria andLpPaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("lp_payment_type >=", value, "lpPaymentType");
            return (Criteria) this;
        }

        public Criteria andLpPaymentTypeLessThan(String value) {
            addCriterion("lp_payment_type <", value, "lpPaymentType");
            return (Criteria) this;
        }

        public Criteria andLpPaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("lp_payment_type <=", value, "lpPaymentType");
            return (Criteria) this;
        }

        public Criteria andLpPaymentTypeLike(String value) {
            addCriterion("lp_payment_type like", value, "lpPaymentType");
            return (Criteria) this;
        }

        public Criteria andLpPaymentTypeNotLike(String value) {
            addCriterion("lp_payment_type not like", value, "lpPaymentType");
            return (Criteria) this;
        }

        public Criteria andLpPaymentTypeIn(List<String> values) {
            addCriterion("lp_payment_type in", values, "lpPaymentType");
            return (Criteria) this;
        }

        public Criteria andLpPaymentTypeNotIn(List<String> values) {
            addCriterion("lp_payment_type not in", values, "lpPaymentType");
            return (Criteria) this;
        }

        public Criteria andLpPaymentTypeBetween(String value1, String value2) {
            addCriterion("lp_payment_type between", value1, value2, "lpPaymentType");
            return (Criteria) this;
        }

        public Criteria andLpPaymentTypeNotBetween(String value1, String value2) {
            addCriterion("lp_payment_type not between", value1, value2, "lpPaymentType");
            return (Criteria) this;
        }

        public Criteria andLpLgIdIsNull() {
            addCriterion("lp_lg_id is null");
            return (Criteria) this;
        }

        public Criteria andLpLgIdIsNotNull() {
            addCriterion("lp_lg_id is not null");
            return (Criteria) this;
        }

        public Criteria andLpLgIdEqualTo(Integer value) {
            addCriterion("lp_lg_id =", value, "lpLgId");
            return (Criteria) this;
        }

        public Criteria andLpLgIdNotEqualTo(Integer value) {
            addCriterion("lp_lg_id <>", value, "lpLgId");
            return (Criteria) this;
        }

        public Criteria andLpLgIdGreaterThan(Integer value) {
            addCriterion("lp_lg_id >", value, "lpLgId");
            return (Criteria) this;
        }

        public Criteria andLpLgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lp_lg_id >=", value, "lpLgId");
            return (Criteria) this;
        }

        public Criteria andLpLgIdLessThan(Integer value) {
            addCriterion("lp_lg_id <", value, "lpLgId");
            return (Criteria) this;
        }

        public Criteria andLpLgIdLessThanOrEqualTo(Integer value) {
            addCriterion("lp_lg_id <=", value, "lpLgId");
            return (Criteria) this;
        }

        public Criteria andLpLgIdIn(List<Integer> values) {
            addCriterion("lp_lg_id in", values, "lpLgId");
            return (Criteria) this;
        }

        public Criteria andLpLgIdNotIn(List<Integer> values) {
            addCriterion("lp_lg_id not in", values, "lpLgId");
            return (Criteria) this;
        }

        public Criteria andLpLgIdBetween(Integer value1, Integer value2) {
            addCriterion("lp_lg_id between", value1, value2, "lpLgId");
            return (Criteria) this;
        }

        public Criteria andLpLgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lp_lg_id not between", value1, value2, "lpLgId");
            return (Criteria) this;
        }

        public Criteria andLpLgTypeIsNull() {
            addCriterion("lp_lg_type is null");
            return (Criteria) this;
        }

        public Criteria andLpLgTypeIsNotNull() {
            addCriterion("lp_lg_type is not null");
            return (Criteria) this;
        }

        public Criteria andLpLgTypeEqualTo(Integer value) {
            addCriterion("lp_lg_type =", value, "lpLgType");
            return (Criteria) this;
        }

        public Criteria andLpLgTypeNotEqualTo(Integer value) {
            addCriterion("lp_lg_type <>", value, "lpLgType");
            return (Criteria) this;
        }

        public Criteria andLpLgTypeGreaterThan(Integer value) {
            addCriterion("lp_lg_type >", value, "lpLgType");
            return (Criteria) this;
        }

        public Criteria andLpLgTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lp_lg_type >=", value, "lpLgType");
            return (Criteria) this;
        }

        public Criteria andLpLgTypeLessThan(Integer value) {
            addCriterion("lp_lg_type <", value, "lpLgType");
            return (Criteria) this;
        }

        public Criteria andLpLgTypeLessThanOrEqualTo(Integer value) {
            addCriterion("lp_lg_type <=", value, "lpLgType");
            return (Criteria) this;
        }

        public Criteria andLpLgTypeIn(List<Integer> values) {
            addCriterion("lp_lg_type in", values, "lpLgType");
            return (Criteria) this;
        }

        public Criteria andLpLgTypeNotIn(List<Integer> values) {
            addCriterion("lp_lg_type not in", values, "lpLgType");
            return (Criteria) this;
        }

        public Criteria andLpLgTypeBetween(Integer value1, Integer value2) {
            addCriterion("lp_lg_type between", value1, value2, "lpLgType");
            return (Criteria) this;
        }

        public Criteria andLpLgTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("lp_lg_type not between", value1, value2, "lpLgType");
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
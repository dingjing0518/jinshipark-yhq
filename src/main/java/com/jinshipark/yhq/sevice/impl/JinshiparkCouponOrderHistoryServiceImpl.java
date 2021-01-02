package com.jinshipark.yhq.sevice.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinshipark.yhq.mapper.JinshiparkCouponOrderHistoryMapper;
import com.jinshipark.yhq.model.JinshiparkCouponOrderHistory;
import com.jinshipark.yhq.model.JinshiparkCouponOrderHistoryExample;
import com.jinshipark.yhq.model.bo.SearchVO;
import com.jinshipark.yhq.model.vo.JinshiparkCouponOrderHistoryVO;
import com.jinshipark.yhq.sevice.JinshiparkCouponOrderHistoryService;
import com.jinshipark.yhq.utils.PagedGridResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Service
public class JinshiparkCouponOrderHistoryServiceImpl implements JinshiparkCouponOrderHistoryService {
    @Autowired
    private JinshiparkCouponOrderHistoryMapper jinshiparkCouponOrderHistoryMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public PagedGridResult searchCouponOrderHistory(SearchVO searchVO) throws ParseException {
        List<JinshiparkCouponOrderHistoryVO> jinshiparkCouponOrderHistoryVOS = new ArrayList<>();
        JinshiparkCouponOrderHistoryExample example = new JinshiparkCouponOrderHistoryExample();
        JinshiparkCouponOrderHistoryExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("CreateTime desc");
        criteria.andShopidEqualTo(searchVO.getShopId());
        criteria.andCreatetimeGreaterThanOrEqualTo(searchVO.getDateForStartTime());
        criteria.andCreatetimeLessThanOrEqualTo(searchVO.getDateForEndTime());
        criteria.andPlateLike("%" + searchVO.getKeyWord() + "%");
        // 分页
        PageHelper.startPage(searchVO.getPageNum(), searchVO.getPageSize());
        List<JinshiparkCouponOrderHistory> jinshiparkCouponOrderHistories = jinshiparkCouponOrderHistoryMapper.selectByExample(example);
        for (JinshiparkCouponOrderHistory jinshiparkCouponOrderHistory : jinshiparkCouponOrderHistories) {
            JinshiparkCouponOrderHistoryVO jinshiparkCouponOrderHistoryVO = new JinshiparkCouponOrderHistoryVO();
            BeanUtils.copyProperties(jinshiparkCouponOrderHistory,jinshiparkCouponOrderHistoryVO);
            jinshiparkCouponOrderHistoryVOS.add(jinshiparkCouponOrderHistoryVO);
        }
        PageInfo<?> pageList = new PageInfo<>(jinshiparkCouponOrderHistories);
        PagedGridResult grid = new PagedGridResult();
        grid.setPage(searchVO.getPageNum());
        grid.setRows(jinshiparkCouponOrderHistoryVOS);
        grid.setTotal(pageList.getPages());
        grid.setRecords(pageList.getTotal());
        return grid;
    }
}

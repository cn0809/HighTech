package com.ht.dao.mapper;

import com.ht.model.EnterpriseInfo;

public interface EnterpriseInfoMapper {
    int deleteByPrimaryKey(Integer enterpriseId);

    int insert(EnterpriseInfo record);

    int insertSelective(EnterpriseInfo record);

    EnterpriseInfo selectByPrimaryKey(Integer enterpriseId);

    int updateByPrimaryKeySelective(EnterpriseInfo record);

    int updateByPrimaryKey(EnterpriseInfo record);
}
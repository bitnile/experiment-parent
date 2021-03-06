package com.nanwulife.dao;

import com.nanwulife.pojo.Experiment;

import java.util.List;

public interface ExperimentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Experiment record);

    int insertSelective(Experiment record);

    Experiment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Experiment record);

    int updateByPrimaryKey(Experiment record);

    List<Experiment> selectAllExps();
}
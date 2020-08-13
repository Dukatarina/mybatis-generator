package com.xxx.mybatis.dao;

import com.xxx.mybatis.entity.Score;

public interface ScoreMapper {
    int insert(Score record);

    int insertSelective(Score record);
}
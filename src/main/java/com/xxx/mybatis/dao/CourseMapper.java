package com.xxx.mybatis.dao;

import com.xxx.mybatis.entity.Course;

public interface CourseMapper {
    int insert(Course record);

    int insertSelective(Course record);
}
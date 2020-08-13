package com.xxx.mybatis.dao;

import com.xxx.mybatis.entity.Teacher;

public interface TeacherMapper {
    int insert(Teacher record);

    int insertSelective(Teacher record);
}
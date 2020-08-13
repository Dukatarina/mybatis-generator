package com.xxx.mybatis.dao;

import com.xxx.mybatis.entity.Student;

public interface StudentMapper {
    int insert(Student record);

    int insertSelective(Student record);
}
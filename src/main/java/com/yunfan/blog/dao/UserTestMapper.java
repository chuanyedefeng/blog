package com.yunfan.blog.dao;

import com.yunfan.blog.domain.UserTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author fengyurong
 * @date 2020-08-10 23:02
 */
public interface UserTestMapper {
     @Select("select * from user_test")
     List<UserTest> findAllUserTests();

}

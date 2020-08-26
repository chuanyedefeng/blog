package com.yunfan.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunfan.blog.domain.BlogUserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author fengyurong
 * @date 2020-07-27 15:05
 */
@Mapper
public interface BlogUserMapper extends BaseMapper<BlogUserDO> {
    @Select("select * from blog_user")
    List<BlogUserDO> sewlectAll();
}


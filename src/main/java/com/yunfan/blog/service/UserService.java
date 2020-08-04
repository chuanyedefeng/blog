package com.yunfan.blog.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yunfan.blog.dao.BlogUserMapper;
import com.yunfan.blog.domain.BlogUserDO;
import com.yunfan.blog.dto.UserInfoDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.transform.Source;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

/**
 * @author fengyurong
 * @date 2020-07-27 15:16
 */
@Service
public class UserService {
    @Resource
    private BlogUserMapper blogUserMapper;

    /**
     * 注册和登录
     */
    public void registerAndLogin(UserInfoDTO infoDTO) {
        QueryWrapper<BlogUserDO> userWrapper = new QueryWrapper<>();
        userWrapper.eq("user_name",infoDTO.getUserName());
        BlogUserDO userDO = blogUserMapper.selectOne(userWrapper);
        //注册
        if(Objects.isNull(userDO)) {
            BlogUserDO insertDO = new BlogUserDO();
            insertDO.setUserName(infoDTO.getUserName());
            insertDO.setId(this.randomId());
            insertDO.setPhone(infoDTO.getPhone());
            blogUserMapper.insert(insertDO);
        }
    }

    //生成13为随机数
    public long randomId() {
        return ((long) ((Math.random() * 9 + 1) *  Math.pow(10, 12)));
    }
}

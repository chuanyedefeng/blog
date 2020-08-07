package com.yunfan.blog.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 *
 * @author fengyurong
 * @date 2020-07-27 15:09
 */
@Data
@TableName("blog_user")
@NoArgsConstructor
public class BlogUserDO {

    @TableId
    private Long id;

    private String userName;

    private String phone;

    private Date createdAt;

    private Date updatedAt;
}

package com.caidapao.asyncpagequery.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author caixuan
 * @date 2021/8/13 10:34
 **/
@Data
@Accessors(chain = true)
@TableName("t_user")
public class User {

    @TableField("user_id")
    private String userId;

    @TableField("user_account")
    private String userAccount;

    @TableField("nick_name")
    private String nickName;


}

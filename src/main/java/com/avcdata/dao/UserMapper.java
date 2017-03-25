package com.avcdata.dao;

import com.avcdata.model.User;
import com.avcdata.util.MyMapper;

import java.util.List;
import java.util.Map;

/**
 * Created by huangcheng on 2017/3/24.
 */
//继承了通用MyMapper，则可以根据Bean实现简单的增删改查
public interface UserMapper extends MyMapper<User> {
    List<Map<String,String>> query(String s);
}

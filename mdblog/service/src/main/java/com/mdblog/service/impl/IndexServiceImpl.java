package com.mdblog.service.impl;

import com.mdblog.po.JedisClient;
import com.mdblog.po.ResponResult;
import com.mdblog.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by loadi on 2017/2/17.
 */
@Service("IndexService")
public class IndexServiceImpl implements IndexService {

    @Autowired
    private JedisClient jedisClient;


    @Override
    public ResponResult getArts() {
        return null;
        // TODO: 2017/2/17  
    }
}

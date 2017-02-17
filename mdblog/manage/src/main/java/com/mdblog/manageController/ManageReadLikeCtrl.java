package com.mdblog.manageController;

import com.mdblog.po.ResponResult;
import com.mdblog.service.ManageReadLikeCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by loadi on 2017/2/17.
 */
@Controller
@RequestMapping("/readlike")
public class ManageReadLikeCtrl {

    @Autowired
    private ManageReadLikeCount manageReadLikeCount;

    @RequestMapping("/update")
    @ResponseBody
    public ResponResult update() {
        return manageReadLikeCount.updateCount();
    }
}

package com.jk.service;

import com.jk.mapper.HighcharsMapper;
import com.jk.model.BookingOrder_xc;
import com.jk.model.Houseinfo;
import com.jk.model.UserBean;
import com.jk.model.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author ccl
 * @create 2019/12/23
 * @since 1.0.0
 */
@Service
public class HighcharsServiceImpl implements HighcharsService{

    @Autowired
    private HighcharsMapper highcharsMapper;

    @Override
    public List<Visitor> queryVisitorCount() {
        return highcharsMapper.queryVisitorCount();
    }

    @Override
    public List<UserBean> queryUserCount() {
        return highcharsMapper.queryUserCount();
    }

    @Override
    public List<Houseinfo> queryHouseCount() {
        return highcharsMapper.queryHouseCount();
    }

    @Override
    public List<BookingOrder_xc> queryOrderCount() {
        return highcharsMapper.queryOrderCount();
    }
}
package com.jk.mapper;

import com.jk.model.BookingOrder_xc;
import com.jk.model.Houseinfo;
import com.jk.model.UserBean;
import com.jk.model.Visitor;

import java.util.List;

public interface HighcharsMapper {


    List<Visitor> queryVisitorCount();

    List<UserBean> queryUserCount();

    List<Houseinfo> queryHouseCount();

    List<BookingOrder_xc> queryOrderCount();
}

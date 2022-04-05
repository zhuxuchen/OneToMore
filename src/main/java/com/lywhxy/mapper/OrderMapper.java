package com.lywhxy.mapper;

import com.lywhxy.pojo.Order;
import com.lywhxy.pojo.User;

public interface OrderMapper {
    Order selectOrderByIdMethod1(String id);
    Order selectOrderByIdMethod2(String id);
}

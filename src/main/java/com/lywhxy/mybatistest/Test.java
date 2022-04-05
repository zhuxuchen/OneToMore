package com.lywhxy.mybatistest;

import com.lywhxy.mapper.OrderMapper;
import com.lywhxy.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		SqlSession sqlSession = MyBatisUtils.getSession();
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		System.out.println(orderMapper.selectOrderByIdMethod2("0c0796f2-0124-4a13-a891-5efbb63b04f9"));
		sqlSession.close();
	}
}

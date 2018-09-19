package com.litiezhu.shop.dao;

import com.litiezhu.entity.Goods;

import java.util.List;

public interface IGoodsDao {
    List<Goods> queryAll();
}

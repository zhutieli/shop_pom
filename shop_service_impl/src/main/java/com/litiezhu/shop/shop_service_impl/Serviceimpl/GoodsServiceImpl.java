package com.litiezhu.shop.shop_service_impl.Serviceimpl;

import java.util.List;
@Service
public class GoodsServiceImpl implements IGoodsService {
    @Autowired
    private  IGoodsDao goodsDao;
public List<Goods> queryAll(){


    System.out.println("调用了service实现了in");
    return  goodsDao.queryAll();
    return  null;
}



}

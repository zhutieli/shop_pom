package com.litiezhu.shop.shop_back;

        import jdk.nashorn.internal.ir.annotations.Reference;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;

        import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Reference
    private  IGoodsService goodsService;

    @RequestMapping("/goodslist")
    public  String goodsManager(){
        //  List<Goods> goods=goodsService.querAll;
        return "goodslist";

    }
}

package com.litiezhu.shop.shop_service_impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
@DubboComponentScan("com.litiezhu.shop.shop_service_impl.serviceimpl")
@MapperScan("com.litiezhu.shop.dao")
public class ShopServiceImplApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ShopServiceImplApplication.class, args);
	}
}

package com.hello.core.Order.Service;
/*
Created on 2022/12/31 11:17 PM In Intelli J IDEA 
by jeon-wangi
*/

import com.hello.core.Order.Entity.Order;

public interface OrderService {

    /**
     * @param memberId 회원 ID
     * @param itemName 상품명
     * @param price 가격
     * @return 주문 결과
     */
    Order create(Long memberId, String itemName, int price);

}

package com.hello.core.Discount;
/*
Created on 2022/12/31 11:05 PM In Intelli J IDEA 
by jeon-wangi
*/

import com.hello.core.Member.Entity.Member;

public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);

}

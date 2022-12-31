package com.hello.core.Discount.Service;
/*
Created on 2022/12/31 11:14 PM In Intelli J IDEA 
by jeon-wangi
*/

import com.hello.core.Discount.DiscountPolicy;
import com.hello.core.Member.Entity.Member;
import com.hello.core.Member.Grade.Grade;

public class FixDiscountPolicy implements DiscountPolicy {

    private final int AMOUNT = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP)
            return AMOUNT;
        return 0;
    }
}

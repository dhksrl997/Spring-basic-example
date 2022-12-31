package com.hello.core.Order.Service;
/*
Created on 2022/12/31 11:18 PM In Intelli J IDEA 
by jeon-wangi
*/

import com.hello.core.Discount.DiscountPolicy;
import com.hello.core.Discount.Service.FixDiscountPolicy;
import com.hello.core.Member.Entity.Member;
import com.hello.core.Member.Repository.MemberRepository;
import com.hello.core.Member.Repository.MemoryMemberRepository;
import com.hello.core.Order.Entity.Order;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order create(Long memberId, String itemName, int price) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, price);
        return new Order(memberId, itemName, price, discountPrice);
    }
}

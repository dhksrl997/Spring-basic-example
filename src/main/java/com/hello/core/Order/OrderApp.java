package com.hello.core.Order;
/*
Created on 2022/12/31 11:23 PM In Intelli J IDEA 
by jeon-wangi
*/

import com.hello.core.Member.Entity.Member;
import com.hello.core.Member.Grade.Grade;
import com.hello.core.Member.Service.MemberService;
import com.hello.core.Member.Service.MemberServiceImpl;
import com.hello.core.Order.Entity.Order;
import com.hello.core.Order.Service.OrderService;
import com.hello.core.Order.Service.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.create(member.getId(), "TestItem", 10000);
        System.out.println("! order = " + order);
        System.out.println("! discount = " + order.calculatePrice());
    }
}

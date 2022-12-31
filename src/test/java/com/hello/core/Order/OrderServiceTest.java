package com.hello.core.Order;
/*
Created on 2022/12/31 11:26 PM In Intelli J IDEA 
by jeon-wangi
*/

import com.hello.core.Member.Entity.Member;
import com.hello.core.Member.Grade.Grade;
import com.hello.core.Member.Service.MemberService;
import com.hello.core.Member.Service.MemberServiceImpl;
import com.hello.core.Order.Entity.Order;
import com.hello.core.Order.Service.OrderService;
import com.hello.core.Order.Service.OrderServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    @DisplayName("VIP 회원 할인 테스트")
    void createOrder() {
        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);

        Order order = orderService.create(memberA.getId(), "itemA", 10000);
        Assertions.assertEquals(order.getDiscountPrice(), 1000, () -> "할인금액이 1000원이 아님");
    }
}

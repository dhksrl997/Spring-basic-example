package com.hello.core.Member;
/*
Created on 2022/12/31 10:46 PM In Intelli J IDEA 
by jeon-wangi
*/

import com.hello.core.Member.Entity.Member;
import com.hello.core.Member.Grade.Grade;
import com.hello.core.Member.Service.MemberService;
import com.hello.core.Member.Service.MemberServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MemberSericeTest {

    MemberService service = new MemberServiceImpl();

    @Test
    @DisplayName("회원가입 테스트")
    void join() {
        //given
        Member member = new Member(1L, "member1", Grade.VIP);
        //when
        service.join(member);
        Member find = service.find(member.getId());
        //then
        Assertions.assertEquals(member, find);
    }
}

package com.hello.core.Member;
/*
Created on 2022/12/31 10:42 PM In Intelli J IDEA 
by jeon-wangi
*/

import com.hello.core.Member.Entity.Member;
import com.hello.core.Member.Grade.Grade;
import com.hello.core.Member.Service.MemberService;
import com.hello.core.Member.Service.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "Member1", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.find(member.getId());
        System.out.println("member = " + member.getMame());
        System.out.println("findMember = " + findMember.getMame());
    }
}

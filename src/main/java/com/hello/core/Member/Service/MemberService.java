package com.hello.core.Member.Service;
/*
Created on 2022/12/31 10:34 PM In Intelli J IDEA 
by jeon-wangi
*/

import com.hello.core.Member.Entity.Member;

public interface MemberService {

    void join(Member member);

    Member find(Long id);

}

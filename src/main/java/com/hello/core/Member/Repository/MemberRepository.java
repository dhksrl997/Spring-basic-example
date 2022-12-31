package com.hello.core.Member.Repository;
/*
Created on 2022/12/31 10:31 PM In Intelli J IDEA 
by jeon-wangi
*/

import com.hello.core.Member.Entity.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);

}

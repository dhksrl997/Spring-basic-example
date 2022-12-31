package com.hello.core.Member.Entity;
/*
Created on 2022/12/31 10:28 PM In Intelli J IDEA 
by jeon-wangi
*/

import com.hello.core.Member.Grade.Grade;

public class Member {
    private Long id;
    private String mame;
    private Grade grade;

    public Member(Long id, String mame, Grade grade) {
        this.id = id;
        this.mame = mame;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMame() {
        return mame;
    }

    public void setMame(String mame) {
        this.mame = mame;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}

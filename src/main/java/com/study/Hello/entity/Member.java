package com.study.Hello.entity;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Member {

    private Long id;                // 고유 ID(식별용) 나중에 DB 연동시  프로그램에서 자동으로 ID값 부여함

    @NotEmpty
    private String loginId;         // 로그인 아이디
    @NotEmpty
    private String name;            // 이름
    @NotEmpty
    private String password;        // 비밀번호
}

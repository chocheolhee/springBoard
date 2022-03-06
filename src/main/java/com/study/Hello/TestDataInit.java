package com.study.Hello;

import com.study.Hello.entity.Member;
import com.study.Hello.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class TestDataInit {

    private final MemberRepository memberRepository;

    @PostConstruct
    public void init() {
        Member member = new Member();
        member.setLoginId("test");
        member.setPassword("asd123");
        member.setName("테스터");
        memberRepository.save(member);
    }
}

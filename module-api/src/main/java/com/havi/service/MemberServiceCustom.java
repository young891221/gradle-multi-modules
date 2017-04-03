package com.havi.service;

import com.havi.domain.Member;
import com.havi.repository.MemberRepository;

import org.springframework.stereotype.Service;

/**
 * Created by KimYJ on 2017-04-03.
 */
@Service
public class MemberServiceCustom {
    private MemberRepository memberRepository;

    public MemberServiceCustom(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Long singup(Member member) {
        return memberRepository.save(member).getId();
    }
}

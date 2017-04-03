package com.havi.repository;

import com.havi.domain.Member;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by KimYJ on 2017-04-03.
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
}

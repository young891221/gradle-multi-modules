package com.havi.member;

import com.havi.domain.Member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by KimYJ on 2017-04-03.
 */
@RestController
public class MemberController {

    @GetMapping("/")
    public Member get() {
        return new Member("havi2", "havi@gmail.com");
    }
}

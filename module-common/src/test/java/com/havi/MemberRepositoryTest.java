package com.havi;

import com.havi.domain.Member;
import com.havi.repository.MemberRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MemberRepositoryTest {

	@Autowired
	private MemberRepository memberRepository;

	@Test
	public void add() {
		memberRepository.save(new Member("havi", "havi@gmail.com"));
		Member saved = memberRepository.findOne(1L);
		assertThat(saved.getName(), is("havi"));
	}

}

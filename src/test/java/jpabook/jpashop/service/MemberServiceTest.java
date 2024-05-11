package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;



class MemberServiceTest {

    @Autowired
    private MemberService memberService;


    @Test
    void join() {
        // given
        Member member = new Member();
        member.setName("Kim");
        //when
        Long saveId = memberService.join(member);
        Member findMember = memberService.findOne(saveId);
        //then
        Assertions.assertThat(findMember).isEqualTo(member);

    }

    @Test
    void DuplicateMemberException(){
        // given
        Member member1 = new Member();
        member1.setName("Kim");

        Member member2 = new Member();
        member2.setName("Kim");


        //when
        memberService.join(member1);

        //then
        org.junit.jupiter.api.Assertions.assertThrows(IllegalStateException.class,
                ()->memberService.join(member2));
//        memberService.join(member2);
    }
}
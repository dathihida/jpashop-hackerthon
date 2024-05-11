package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.metamodel.internal.MemberResolver;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    // JoinMember
    @Transactional(readOnly = false)
    public Long join(Member member){
        valitateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();
    }

    private void valitateDuplicateMember(Member member) {
         List<Member> memberList = memberRepository.findByName(member.getName());
         if(!memberList.isEmpty()){
             throw new IllegalStateException("This member already exists");
         }
    }

    //find All Member
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    //find single member by memberId
    public Member findOne(Long id){
        return memberRepository.findOne(id);
    }
}

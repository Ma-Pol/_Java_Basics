package kyh_4_advanced2.io.member.impl;

import kyh_4_advanced2.io.member.Member;
import kyh_4_advanced2.io.member.MemberRepository;

import java.util.ArrayList;
import java.util.List;

// members 리스트(메모리)에 회원 데이터 저장
public class MemoryMemberRepository implements MemberRepository {
    private final List<Member> members = new ArrayList<>();

    @Override
    public void add(Member member) {
        members.add(member);
    }

    @Override
    public List<Member> findAll() {
        return members;
    }
}
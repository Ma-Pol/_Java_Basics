package kyh_4_advanced2.examples.io.member.impl;

import kyh_4_advanced2.examples.io.member.Member;
import kyh_4_advanced2.examples.io.member.MemberRepository;

import java.util.ArrayList;
import java.util.List;

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

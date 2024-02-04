package sudobito.rehabilitation.servlet.basic.servlet.project.repository;

import sudobito.rehabilitation.servlet.basic.servlet.project.model.Member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    private static Map<Long, Member> storedDate = new HashMap<>();
    private static long sequence = 0L;

    private static final MemberRepository instance = new MemberRepository();

    public static MemberRepository getInstance() {
        return instance;
    }

    private MemberRepository() {

    }

    public Member save(Member member) {
        member.setId(++sequence);
        storedDate.put(member.getId(), member);
        return member;
    }
    // 기타 코드들
}

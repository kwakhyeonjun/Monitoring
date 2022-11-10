package member;

import java.util.List;
import java.util.Optional;

/**
 * 서비스를 사용하는 회원에 대한 기능을 수행한다.
 */
public interface MemberService {

    /**
     * 회원가입 <p>
     * 사용자가 입력한 데이터를 통해 사용자를 저장한다.
     * @param member member's data for save
     * @return member id received while saving
     */
    long join(Member member);

    /**
     * 회원조회<p>
     * 전체 사용자 중 특정 조건의 사용자를 조회할 수 있다.
     * @param member condition for search
     * @return members who meet the conditions
     */
    List<Member> find(Member member);
}

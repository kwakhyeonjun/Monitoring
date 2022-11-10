package member;

import lombok.Data;

/**
 * 사용자의 데이터를 관리하기 위한 VO
 */
@Data
public class Member {
    long id;
    String name;
    Grade grade;
    // add else
}

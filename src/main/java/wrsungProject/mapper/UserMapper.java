package wrsungProject.mapper;

import wrsungProject.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {   // Mapper 메서드 이름은 DB 관점에서!
    List<UserVo> getUserList(); // User 테이블 가져오기 
    void insertUser(UserVo userVo); // 회원가입
    UserVo getUserByEmail(String email);    // 회원 정보 가져오기
    UserVo getUserById(Long id);
    void updateUser(UserVo userVo); // 회원 정보 수정
    void deleteUser(Long id); // 회원 탈퇴
}

package wrsungProject.service;

import wrsungProject.mapper.UserMapper;
import wrsungProject.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<UserVo> getUserList() {
        return userMapper.getUserList();
    }

    public UserVo getUserById(Long id) {
        return userMapper.getUserById(id);
    }

    public void signup(UserVo userVo) {
        userMapper.insertUser(userVo);
    }

    public Long login(String email, String password) {
        UserVo userVo = userMapper.getUserByEmail(email);
        if (userVo.getPassword().equals(password)) {
            return userVo.getId();
        }
        return null;
    }

    public void modifyInfo(UserVo userVo) {
        userMapper.updateUser(userVo);
    }

    public void withdraw(Long id) {
        userMapper.deleteUser(id);
    }
}

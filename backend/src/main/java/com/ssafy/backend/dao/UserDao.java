package com.ssafy.backend.dao;

import com.ssafy.backend.dto.Track;
import com.ssafy.backend.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User, String> {
    User findUserByEmail(String email);
    User findUserByUserId(int userId);
    User findUserByName(String name);
    List<User> findUserByTrack(Track track);
    List<User> findUserByOrdinalNo(int ordinalNo);
    User findUserByUserIdAndPhone(int userId, String phone);
    User findUserByUserIdAndEmailAndPhone(int userId, String email, String phone);
}

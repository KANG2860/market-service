package com.market.marketservice.Repository;

import com.market.marketservice.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findAllByEmail(String email); // email로 사용자 정보 가져옴
}

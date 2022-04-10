package com.bharat.finansee.repository;

import com.bharat.finansee.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : bharat.verma
 * @created : 10/04/22, Sunday
 **/

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

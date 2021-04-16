package org.pavan.fsd.p4.api.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.pavan.fsd.p4.api.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

	Optional<User> findByEmailAndPassword(String email, String password);

}

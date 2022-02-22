package com.axess.smartbankapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.axess.smartbankapi.model.CCUser;

@Repository
public interface CCUserRepository extends JpaRepository<CCUser, Long>{

	@Query(value = "select * from cc_user where cc_user.user_id = userId and cc_user.password = password", nativeQuery = true)
	Optional<CCUser> findByUserIdAndPassword(String userId, String password);

}

/**
 * 
 */
package com.User.userService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.User.userService.Entity.User;

/**
 * @author ustjavafsdb411
 *
 */

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("Select u from User u where u.workDetails =:workDetails")
	List<User> findAllUsersByWork(@Param("workDetails") String workDetails);

}

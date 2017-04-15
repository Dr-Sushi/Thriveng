package com.thriveng.repository;

import com.thriveng.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by DoctorSushi on 4/15/17.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}

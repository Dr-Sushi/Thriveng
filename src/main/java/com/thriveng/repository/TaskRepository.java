package com.thriveng.repository;

import com.thriveng.domain.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by DoctorSushi on 4/15/17.
 */
@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
}

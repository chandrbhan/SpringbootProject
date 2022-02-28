package com.dubey.cd.repository;

import com.dubey.cd.entites.Tasks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Tasks,Long> {
}

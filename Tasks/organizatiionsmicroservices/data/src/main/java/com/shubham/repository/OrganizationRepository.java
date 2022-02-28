package com.shubham.repository;

import com.shubham.entites.Organizations;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends CrudRepository<Organizations,Long> {
}

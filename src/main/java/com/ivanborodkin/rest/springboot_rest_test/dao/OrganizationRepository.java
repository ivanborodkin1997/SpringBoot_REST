package com.ivanborodkin.rest.springboot_rest_test.dao;

import com.ivanborodkin.rest.springboot_rest_test.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
}

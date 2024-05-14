package com.incture.cpm.Repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incture.cpm.Entity.Regularize;

@Repository
public interface RegularizeRepository extends JpaRepository<Regularize, Long> {
    List<Regularize> findByApprovalStatus(String string);
}

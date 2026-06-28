// ClaimRepository.java
package com.insurance.claimsservice.repository;

import com.insurance.claimsservice.entity.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long> {
}
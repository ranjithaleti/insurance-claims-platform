package com.insurance.claimsservice.service;

import com.insurance.claimsservice.entity.Claim;
import java.util.List;

public interface ClaimService {

    Claim createClaim(Claim claim);

    Claim getClaimById(Long id);

    List<Claim> getAllClaims();

    Claim updateClaimStatus(Long id, String status);
}
package com.example.campus.carinsurance.service;

import com.example.campus.carinsurance.entity.Claim;
import com.example.campus.carinsurance.repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClainService {

    @Autowired
    private ClaimRepository userRepository;
    public String fileClaim(String username, String claimDetails)
    {
        Claim claim = new Claim();
        claim.setUsername(username);
        claim.setClaimDetails(claimDetails);
        userRepository.save(claim);
        //模拟理赔处理逻辑
        return "用户" + username + "理赔申请已经提交， 详情" + claimDetails;
    }
}

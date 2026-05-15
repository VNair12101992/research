package com.learn.research.service;

import com.learn.research.model.DealCompletenessIssues;
import com.learn.research.repository.DealCompletenessIssueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DealCompletenessIssueService {

    private final DealCompletenessIssueRepository dealCompletenessIssueRepository;

    public DealCompletenessIssueService(DealCompletenessIssueRepository dealCompletenessIssueRepository) {
        this.dealCompletenessIssueRepository = dealCompletenessIssueRepository;
    }

    public List<DealCompletenessIssues> findByDealId(String dealId) {
        return dealCompletenessIssueRepository.findByDealId(dealId);
    }
}

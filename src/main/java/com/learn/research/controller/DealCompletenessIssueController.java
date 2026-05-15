package com.learn.research.controller;

import com.learn.research.model.DealCompletenessIssues;
import com.learn.research.service.DealCompletenessIssueService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class DealCompletenessIssueController {

    private final DealCompletenessIssueService dealCompletenessIssueService;

    public DealCompletenessIssueController(DealCompletenessIssueService dealCompletenessIssueService) {
        this.dealCompletenessIssueService = dealCompletenessIssueService;
    }

    @GetMapping("/deal/{dealId}/completeness/issues")
    public List<DealCompletenessIssues> getDealCompletenessIssues(@PathVariable String dealId) {
        return dealCompletenessIssueService.findByDealId(dealId);
    }


}

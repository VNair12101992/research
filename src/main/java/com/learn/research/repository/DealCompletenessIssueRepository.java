package com.learn.research.repository;

import com.learn.research.model.DealCompletenessIssues;
import com.learn.research.model.DealCompletenessIssuesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DealCompletenessIssueRepository extends JpaRepository<DealCompletenessIssues, DealCompletenessIssuesId> {

    @Query("SELECT d FROM DealCompletenessIssues d WHERE d.dealId = :dealId")
    List<DealCompletenessIssues> findByDealId(String dealId);
}

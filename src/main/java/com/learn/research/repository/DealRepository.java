package com.learn.research.repository;

import com.learn.research.model.Deal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DealRepository extends JpaRepository<Deal, String> {

    @Query("SELECT d FROM Deal d WHERE d.dealId = :dealId")
    Deal findByDealId(String dealId);

    List<Deal> findBySubmittedBy(String submittedBy);
}

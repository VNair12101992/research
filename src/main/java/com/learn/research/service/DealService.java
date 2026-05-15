package com.learn.research.service;

import com.learn.research.model.Deal;
import com.learn.research.repository.DealRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import java.util.List;

@Service
public class DealService {
    private final DealRepository dealRepository;

    public DealService(DealRepository dealRepository) {
        this.dealRepository = dealRepository;
    }

    public Deal getDealById(String dealId) {
        Deal deal = dealRepository.findByDealId(dealId);
        if (deal == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Deal not found with id: " + dealId);
        }
        return deal;
    }

    public List<Deal> getDealBySubmittedBy(String submittedBy) {
        return dealRepository.findBySubmittedBy(submittedBy);
    }
}

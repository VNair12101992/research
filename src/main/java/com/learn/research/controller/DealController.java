package com.learn.research.controller;

import com.learn.research.model.Deal;
import com.learn.research.service.DealService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DealController {

    private final DealService dealService;

    public DealController(DealService dealService) {
        this.dealService = dealService;
    }

    @GetMapping("/deal/{dealId}")
    public ResponseEntity<Deal> getDealById(@PathVariable String dealId) {
        return ResponseEntity.ok(dealService.getDealById(dealId));
    }

    @GetMapping("/deal/submittedBy/{submittedBy}")
    public List<Deal> getDealBySubmittedBy(@PathVariable String submittedBy) {
        return dealService.getDealBySubmittedBy(submittedBy);
    }



}

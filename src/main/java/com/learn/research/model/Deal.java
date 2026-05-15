package com.learn.research.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "Deal")
public class Deal {

    @Id
    @Column(name = "dealId", length = 20)
    private String dealId;

    @Column(name = "submittedBy", length = 20)
    private String submittedBy;

    @Column(name = "dealType", length = 10)
    private String dealType;

    @Column(name = "submittedDate")
    private LocalDateTime submittedDate;

    @ManyToOne
    @JoinColumn(name = "submittedBy", referencedColumnName = "empId",
            insertable = false, updatable = false)
    private Employee submittedByEmployee;

    @OneToMany(mappedBy = "deal", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DealTeamMember> dealTeamMembers;

    // Constructors
    public Deal() {
    }

    public Deal(String dealId, String submittedBy, String dealType, LocalDateTime submittedDate) {
        this.dealId = dealId;
        this.submittedBy = submittedBy;
        this.dealType = dealType;
        this.submittedDate = submittedDate;
    }

    // Getters and Setters
    public String getDealId() {
        return dealId;
    }

    public void setDealId(String dealId) {
        this.dealId = dealId;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public LocalDateTime getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(LocalDateTime submittedDate) {
        this.submittedDate = submittedDate;
    }

    public Employee getSubmittedByEmployee() {
        return submittedByEmployee;
    }

    public void setSubmittedByEmployee(Employee submittedByEmployee) {
        this.submittedByEmployee = submittedByEmployee;
    }

    public Set<DealTeamMember> getDealTeamMembers() {
        return dealTeamMembers;
    }

    public void setDealTeamMembers(Set<DealTeamMember> dealTeamMembers) {
        this.dealTeamMembers = dealTeamMembers;
    }

    @Override
    public String toString() {
        return "Deal{" +
                "dealId='" + dealId + '\'' +
                ", submittedBy='" + submittedBy + '\'' +
                ", dealType='" + dealType + '\'' +
                ", submittedDate=" + submittedDate +
                '}';
    }
}


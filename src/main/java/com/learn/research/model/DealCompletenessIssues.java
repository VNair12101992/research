package com.learn.research.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DealCompletenessIssues")
@IdClass(DealCompletenessIssuesId.class)
public class DealCompletenessIssues implements Serializable {

    @Id
    @Column(name = "dealId", length = 20, nullable = false)
    private String dealId;

    @Id
    @Column(name = "issueType", length = 30, nullable = false)
    private String issueType;

    @Lob
    @Column(name = "issues", columnDefinition = "CLOB")
    private String issues;

    // Constructors
    public DealCompletenessIssues() {}

    public DealCompletenessIssues(String dealId, String issueType, String issues) {
        this.dealId = dealId;
        this.issueType = issueType;
        this.issues = issues;
    }

    // Getters and Setters
    public String getDealId() {
        return dealId;
    }

    public void setDealId(String dealId) {
        this.dealId = dealId;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getIssues() {
        return issues;
    }

    public void setIssues(String issues) {
        this.issues = issues;
    }

    @Override
    public String toString() {
        return "DealCompletenessIssues{" +
                "dealId='" + dealId + '\'' +
                ", issueType='" + issueType + '\'' +
                ", issues='" + issues + '\'' +
                '}';
    }
}

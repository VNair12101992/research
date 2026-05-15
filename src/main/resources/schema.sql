-- H2 Database Schema and Data
-- Drop tables if they exist (for clean re-runs)
DROP TABLE IF EXISTS DealTeamMember;
DROP TABLE IF EXISTS Deal;
DROP TABLE IF EXISTS Employee;

-- Create Employee Table
CREATE TABLE Employee (
    empId VARCHAR(20) PRIMARY KEY,
    designation VARCHAR(20),
    firstName VARCHAR(20),
    lastName VARCHAR(20),
    location VARCHAR(20),
    country VARCHAR(3),
    region VARCHAR(10)
);

-- Create Deal Table
CREATE TABLE Deal (
    dealId VARCHAR(20) PRIMARY KEY,
    submittedBy VARCHAR(20),
    dealType VARCHAR(10),
    submittedDate TIMESTAMP,
    region VARCHAR(10),
    size VARCHAR(20),
    FOREIGN KEY (submittedBy) REFERENCES Employee(empId)
);

-- Create DealTeamMember Table
CREATE TABLE DealTeamMember (
    dealId VARCHAR(20),
    hrId VARCHAR(20),
    role VARCHAR(20) CHECK (role IN ('LEAD_BANKER', 'KEY_CONTACT')),
    PRIMARY KEY (dealId, hrId),
    FOREIGN KEY (dealId) REFERENCES Deal(dealId),
    FOREIGN KEY (hrId) REFERENCES Employee(empId)
);

-- Drop table if exists
DROP TABLE IF EXISTS DealCompletenessIssues;

-- Create DealCompletenessIssues Table
CREATE TABLE DealCompletenessIssues (
    dealId VARCHAR(20),
    issueType VARCHAR(30) CHECK (issueType IN ('DEAL_MEMBER_DESIGNATION','DEAL_BANKER_REGION','DEAL_DUPLICATE')),
    issues CLOB,
    PRIMARY KEY (dealId, issueType)
);

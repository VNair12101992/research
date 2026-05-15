-- Insert dummy data into Employee Table
INSERT INTO Employee (empId, designation, firstName, lastName, location, country, region) VALUES
('EMP001', 'Vice President', 'John', 'Smith', 'New York', 'USA', 'Americas'),
('EMP002', 'Director', 'Sarah', 'Johnson', 'London', 'GBR', 'EMEA'),
('EMP003', 'Manging Director', 'Michael', 'Brown', 'Hong Kong', 'HKG', 'APAC'),
('EMP004', 'Associate', 'Emily', 'Davis', 'Mumbai', 'IND', 'APAC'),
('EMP005', 'Vice President', 'David', 'Wilson', 'Singapore', 'SGP', 'APAC'),
('EMP006', 'Director', 'Lisa', 'Anderson', 'Frankfurt', 'DEU', 'EMEA'),
('EMP007', 'Analyst', 'Robert', 'Taylor', 'New York', 'USA', 'Americas'),
('EMP008', 'Associate', 'Jennifer', 'Martinez', 'San Francisco', 'USA', 'Americas'),
('EMP009', 'Manging Director', 'William', 'Garcia', 'Tokyo', 'JPN', 'APAC'),
('EMP010', 'Vice President', 'Amanda', 'Rodriguez', 'Paris', 'FRA', 'EMEA');

-- Insert dummy data into Deal Table
INSERT INTO Deal (dealId, submittedBy, dealType, submittedDate, region, size) VALUES
('DEAL001', 'EMP001', 'M&A', '2024-01-15 10:30:00','APAC','10000000'),
('DEAL002', 'EMP001', 'M&A', '2024-02-20 14:45:00','APAC','10000000'),
('DEAL003', 'EMP003', 'M&A', '2024-03-10 09:15:00','APAC','10000001092'),
('DEAL004', 'EMP005', 'BOND', '2024-03-25 11:20:00','APAC','100000004234'),
('DEAL005', 'EMP006', 'EQUITY', '2024-04-05 16:00:00','EMEA','32435345345'),
('DEAL006', 'EMP001', 'M&A', '2024-04-18 13:30:00','Americas','789879080'),
('DEAL007', 'EMP009', 'IPO', '2024-05-02 10:00:00','EMEA','233243454'),
('DEAL008', 'EMP010', 'BOND', '2024-05-15 15:45:00','APAC','214345436456');

-- Insert dummy data into DealTeamMember Table
INSERT INTO DealTeamMember (dealId, hrId, role) VALUES
-- DEAL001 Team
('DEAL001', 'EMP001', 'LEAD_BANKER'),
('DEAL001', 'EMP007', 'KEY_CONTACT'),
('DEAL001', 'EMP008', 'KEY_CONTACT'),

-- DEAL002 Team
('DEAL002', 'EMP001', 'LEAD_BANKER'),
('DEAL002', 'EMP007', 'KEY_CONTACT'),

-- DEAL003 Team
('DEAL003', 'EMP003', 'LEAD_BANKER'),
('DEAL003', 'EMP004', 'KEY_CONTACT'),
('DEAL003', 'EMP005', 'KEY_CONTACT'),

-- DEAL004 Team
('DEAL004', 'EMP005', 'LEAD_BANKER'),
('DEAL004', 'EMP004', 'KEY_CONTACT'),

-- DEAL005 Team
('DEAL005', 'EMP006', 'LEAD_BANKER'),
('DEAL005', 'EMP010', 'KEY_CONTACT'),
('DEAL005', 'EMP002', 'KEY_CONTACT'),

-- DEAL006 Team
('DEAL006', 'EMP001', 'LEAD_BANKER'),
('DEAL006', 'EMP007', 'KEY_CONTACT'),

-- DEAL007 Team
('DEAL007', 'EMP009', 'LEAD_BANKER'),
('DEAL007', 'EMP003', 'KEY_CONTACT'),
('DEAL007', 'EMP005', 'KEY_CONTACT'),

-- DEAL008 Team
('DEAL008', 'EMP010', 'LEAD_BANKER'),
('DEAL008', 'EMP006', 'KEY_CONTACT');


-- Issue: Lead Banker Designation mismatch
INSERT INTO DealCompletenessIssues (dealId, issueType, issues) VALUES (
    'DEAL001',
    'DEAL_MEMBER_DESIGNATION',
    '{
        "dealId":"DEAL001",
        "leadBankerDesignation":"Vice President",
        "leadBankerHrId":"EMP001"
    }'
);

-- Issue: Lead Banker Region mismatch
INSERT INTO DealCompletenessIssues (dealId, issueType, issues) VALUES (
    'DEAL001',
    'DEAL_BANKER_REGION',
    '{
        "dealId":"DEAL001",
        "leadBankerRegion":"Americas",
        "dealRegion":"APAC"
    }'
);

-- Issue: Duplicate Deal
INSERT INTO DealCompletenessIssues (dealId, issueType, issues) VALUES (
    'DEAL001',
    'DEAL_DUPLICATE',
    '{
        "dealId":"DEAL001",
        "duplicateDealIds":["DEAL002"],
        "duplicateDealSize":"10000000",
        "overlappingDealTeamMembers":["EMP001","EMP007"]
    }'
);

INSERT INTO DealCompletenessIssues (dealId, issueType, issues) VALUES (
    'DEAL005',
    'DEAL_MEMBER_DESIGNATION',
    '{
        "dealId":"DEAL005",
        "leadBankerDesignation":"Director",
        "leadBankerHrId":"EMP006"
    }'
);

INSERT INTO DealCompletenessIssues (dealId, issueType, issues) VALUES (
    'DEAL004',
    'DEAL_MEMBER_DESIGNATION',
    '{
            "dealId":"DEAL004",
            "leadBankerDesignation":"Vice President",
            "leadBankerHrId":"EMP005"
        }'
);

INSERT INTO DealCompletenessIssues (dealId, issueType, issues) VALUES (
    'DEAL010',
    'DEAL_MEMBER_DESIGNATION',
    '{
            "dealId":"DEAL010",
            "leadBankerDesignation":"Vice President",
            "leadBankerHrId":"EMP010"
        }'
);

INSERT INTO DealCompletenessIssues (dealId, issueType, issues) VALUES (
    'DEAL002',
    'DEAL_MEMBER_DESIGNATION',
    '{
            "dealId":"DEAL002",
            "leadBankerDesignation":"Vice President",
            "leadBankerHrId":"EMP001"
        }'
);
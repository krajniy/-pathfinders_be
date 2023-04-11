INSERT INTO role(id, name) VALUES (1, 'Quantitative Analyst');
INSERT INTO role(id, name) VALUES (2, 'Financial Analyst');
INSERT INTO role(id, name) VALUES (3, 'Sofware Engineer');
INSERT INTO role(id, name) VALUES (4, 'Compliance Officer');
INSERT INTO role(id, name) VALUES (5, 'Project Manager');
INSERT INTO role(id, name) VALUES (6, 'Nurse');
INSERT INTO role(id, name) VALUES (7, 'Marketing Manager');
INSERT INTO role(id, name) VALUES (8, 'Growth Manager');
INSERT INTO role(id, name) VALUES (9, 'Talent Acquisition');
INSERT INTO role(id, name) VALUES (10, 'Corporate Lawyer');
INSERT INTO role(id, name) VALUES (11, 'Business Development Manager');
INSERT INTO role(id, name) VALUES (12, 'Quality Assurance');
INSERT INTO role(id, name) VALUES (13, 'Flight Attendant');
INSERT INTO role(id, name) VALUES (14, 'Accountant');
INSERT INTO role(id, name) VALUES (15, 'Business Analyst');
INSERT INTO role(id, name) VALUES (16, 'Product Manager');
INSERT INTO role(id, name) VALUES (17, 'Management Consultant');
INSERT INTO role(id, name) VALUES (18, 'Regulatory Affairs Manager');
INSERT INTO role(id, name) VALUES (19, 'Biotechnologist');
INSERT INTO role(id, name) VALUES (20, 'Biomedical Engineer');
INSERT INTO role(id, name) VALUES (21, 'Front End Developer');
INSERT INTO role(id, name) VALUES (22, 'Back End Developer');
INSERT INTO role(id, name) VALUES (23, 'Teacher ');
INSERT INTO role(id, name) VALUES (24, 'Customer Service Representative');
INSERT INTO role(id, name) VALUES (25, 'Information Security Analyst');
INSERT INTO role(id, name) VALUES (26, 'Photographer');
INSERT INTO role(id, name) VALUES (27, 'Journalist');
INSERT INTO role(id, name) VALUES (28, 'Reporter');

INSERT INTO major(id, name) VALUES (1, 'Finance');
INSERT INTO major(id, name) VALUES (2, 'IT');
INSERT INTO major(id, name) VALUES (3, 'Management');
INSERT INTO major(id, name) VALUES (4, 'Nursing');
INSERT INTO major(id, name) VALUES (5, 'Marketing');
INSERT INTO major(id, name) VALUES (6, 'Legal Studies');
INSERT INTO major(id, name) VALUES (7, 'Healthcare Administration');
INSERT INTO major(id, name) VALUES (8, 'Mechanical Engineering');
INSERT INTO major(id, name) VALUES (9, 'Business');
INSERT INTO major(id, name) VALUES (10, 'Public Relations');
INSERT INTO major(id, name) VALUES (11, 'Accounting');
INSERT INTO major(id, name) VALUES (12, 'Business Intelligence');
INSERT INTO major(id, name) VALUES (13, 'Biotechnology');
INSERT INTO major(id, name) VALUES (14, 'Biomedical engineering');
INSERT INTO major(id, name) VALUES (15, 'Web Development');
INSERT INTO major(id, name) VALUES (16, 'Education');
INSERT INTO major(id, name) VALUES (17, 'Cybersecurity');
INSERT INTO major(id, name) VALUES (18, 'Photography');
INSERT INTO major(id, name) VALUES (19, 'Media Communication');

INSERT INTO industry(id, name) VALUES (1, 'BFSI');
INSERT INTO industry(id, name) VALUES (2, 'Energy');
INSERT INTO industry(id, name) VALUES (3, 'IT');
INSERT INTO industry(id, name) VALUES (4, 'Ecommerce');
INSERT INTO industry(id, name) VALUES (5, 'Entertainment&Media');
INSERT INTO industry(id, name) VALUES (6, 'Public Service');
INSERT INTO industry(id, name) VALUES (7, 'Non-Profit');
INSERT INTO industry(id, name) VALUES (8, 'Retail & FMCG');
INSERT INTO industry(id, name) VALUES (9, 'Legal');
INSERT INTO industry(id, name) VALUES (10, 'Pharmaceuticals and Life Sciences');
INSERT INTO industry(id, name) VALUES (11, 'Aerospace and Defense');
INSERT INTO industry(id, name) VALUES (12, 'Aviation');
INSERT INTO industry(id, name) VALUES (13, 'Healthcare & Social Assistance');

INSERT INTO size_table(id, name) VALUES (1, 'Small Co');
INSERT INTO size_table(id, name) VALUES (2, 'Medium Co');
INSERT INTO size_table(id, name) VALUES (3, 'Large Co');
INSERT INTO size_table(id, name) VALUES (4, 'Micro Co');

INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id)
    VALUES (1, 'Finance/BFSI/Large Co', 'https://youtu.be/Qd2Kh80ZK6k', 1, 1, 1, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id)
    VALUES (2, 'Finance/BFSI/Large Co', 'https://youtu.be/J9nV8U8gLec', 1, 1, 1, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id)
    VALUES (3, 'Finance/BFSI/Large Co', 'https://youtu.be/VLPRxRe42kM', 1, 1, 1, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id)
    VALUES (4, 'Finance/Energy/Large Co', 'https://youtu.be/QcCWRXzrnRk', 2, 1, 2, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id)
    VALUES (5, 'Finance/BFSI/Large Co', 'https://youtu.be/OmPkgkoKniA', 2, 1, 1, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id)
    VALUES (6, 'Finance/IT/Small Co', 'https://youtu.be/mWlRwKnVgfw', 2, 1, 3, 1);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id)
    VALUES (7, 'IT/Ecommerce/Large Co', 'https://youtu.be/deLf6eynC40', 3, 2, 4, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, size_id)
    VALUES (8, 'IT/NA/Small Co', 'https://youtu.be/j1fc0FlCjyI', 3, 2, 1);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id)
    VALUES (9, 'IT/IT/Large Co', 'https://youtu.be/9qIRJZnoeWE', 3, 2, 3, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id)
    VALUES (10, 'IT/IT/Large Co', 'https://youtu.be/LGDughLj1Oo', 3, 2, 3, 3);
INSERT INTO article(id, title, video_url, role_id, major_id)
    VALUES (11, 'IT/NA/NA', 'https://youtu.be/1LSXEC0Clow', 3, 2);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id)
    VALUES (12, 'Finance/BFSI/Large Co', 'https://youtu.be/94O725eWuXs', 4, 1, 1, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id)
    VALUES (13, 'Finance/BFSI/Large Co', 'https://youtu.be/akloeARw-Xs', 4, 1, 1, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id)
    VALUES (14, 'Finance/BFSI/Large Co', 'https://youtu.be/aDLRMcoBxY8', 4, 1, 1, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id)
    VALUES (15, 'Management/Entertainment&Media/Medium Sized Co', 'https://youtu.be/AzQ3Xso7sLA', 5, 3, 5, 2);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id)
    VALUES (16, 'Management/Entertainment&Media/Small Co', 'https://youtu.be/_LDEHVlWV18', 5, 3, 5, 1);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id)
    VALUES (17, 'Management/IT/NA', 'https://youtu.be/HTJxsrW_Kow', 5, 3, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id)
    VALUES (18, 'Management/Energy/Large Co', 'https://youtu.be/rpdjz75zmH0', 5, 3, 2, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id)
    VALUES (19, 'Nursing/Public Service/Large Co', 'https://youtu.be/4ihHeSps6mY', 6, 4, 6, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id)
    VALUES (20, 'Nursing/Public Service/Large Co', 'https://youtu.be/MII2rqttl1k', 6, 4, 6, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id)
    VALUES (21, 'Nursing/Public Service/Large Co', 'https://youtu.be/Qy6LnAByZo4', 6, 4, 6, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id)
    VALUES (22, 'Nursing/Public Service/Large Co', 'https://youtu.be/DREvmmE7wlg', 6, 4, 6, 3);

INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (23, 'Nursing/Public Service/Large Co', 'https://youtu.be/4FkpY5OLsQs', 6, 4, 6, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (24, 'Marketing/BFSI/Micro Co', 'https://youtu.be/vOZ-VFnYvuA', 7, 5, 1, 4);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (25, 'Marketing/Non-Profit/Small Co', 'https://youtu.be/ydvowqCgiRo', 7, 5, 7, 1);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (26, 'Marketing/IT/Micro Co', 'https://youtu.be/b0_RAe_Arr8', 7, 5, 3, 4);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (27, 'Marketing/Retail & FMCG/Large Co', 'https://youtu.be/dOXKf7FlzIM', 7, 5, 8, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (28, 'Marketing/NA/NA', 'https://youtu.be/Q1AhBgVY-kE', 7, 5, null, null);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (29, 'Marketing/Entertainment&Media/Micro Co', 'https://youtu.be/XmS-QbYx18A', 8, 5, 5, 4);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (30, 'Marketing/IT/Small Co', 'https://youtu.be/f_2B2WQHWAU', 8, 5, 3, 1);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (31, 'Marketing/IT/Large Co', 'https://youtu.be/PtOo9hkznhE', 8, 5, 3, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (32, 'Management/IT/Large Co', 'https://youtu.be/kpqHNVInSaQ', 9, 3, 3, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (33, 'Management/NA/Large Co', 'https://youtu.be/BqaRa-w1b5A', 9, 3, null, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (34, 'Management/IT/Large Co', 'https://youtu.be/yF0z09S1CtU', 9, 3, 3, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (35, 'Legal Studies/Legal/Large Co', 'https://youtu.be/FsJqRRWtkjM', 10, 6, 9, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (36, 'Legal Studies/Legal/Large Co', 'https://youtu.be/lKERxB77fH0', 10, 6, 9, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (37, 'Legal Studies/IT/Large Co', 'https://youtu.be/U0zIdwhCf4g', 10, 6, 9, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (38, 'Marketing/IT/Medium Sized Co', 'https://youtu.be/eRNo4RKsumE', 11, 5, 3, 2);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (39, 'Marketing/Pharmaceuticals and Life Sciences/LargeCo', 'https://youtu.be/CJrxyFLvx34', 11, 5, 10, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (40, 'Marketing/IT/Large Co', 'https://youtu.be/-Tj-v4wjqRc', 11, 5, 3, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (41, 'Marketing/IT/Micro Co', 'https://youtu.be/-Tj-v4wjqRc', 11, 5, 3, 4);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (42, 'Healthcare Administration/Pharmaceuticals and Life Sciences/Large Co', 'https://youtu.be/VUA1V2qF_EE', 12, 7, 10, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (43, 'IT/IT/Large Co', 'https://youtu.be/8wd_f58VQNA', 12, 2, 3, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (44, 'IT/IT/Large Co', 'https://youtu.be/ChhYCujkMZ0', 12, 2, 3, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (45, 'Mechanical Engineering/Aerospace and Defense/Large Co', 'https://youtu.be/cE_rxK-Pmco', 12, 8, 11, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (46, 'Nursing/Aviation/Large Co', 'https://youtu.be/MSmm5OXC27Q', 13, 4, 12, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (47, 'Nursing/Aviation/Large Co', 'https://youtu.be/lhVEddhkLbQ', 13, 4, 12, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (48, 'Nursing/Aviation/Large Co', 'https://youtu.be/eklmtDGUZBI', 13, 4, 12, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (49, 'Business/Aviation/Large Co', 'https://youtu.be/MSmm5OXC27Q', 13, 9, 12, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (50, 'Business/Aviation/Large Co', 'https://youtu.be/lhVEddhkLbQ', 13, 9, 12, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (51, 'Business/Aviation/Large Co', 'https://youtu.be/eklmtDGUZBI', 13, 9, 12, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (52, 'Public Relations/Aviation/Large Co', 'https://youtu.be/MSmm5OXC27Q', 13, 10, 12, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (53, 'Public Relations/Aviation/Large Co', 'https://youtu.be/lhVEddhkLbQ', 13, 10, 12, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (54, 'Public Relations/Aviation/Large Co', 'https://youtu.be/eklmtDGUZBI', 13, 10, 12, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (55, 'Accounting/BFSI/Micro Co', 'https://youtu.be/Abi56urip1M', 14, 11, 1, 4);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (56, 'Accounting/BFSI/Small Co', 'https://youtu.be/5h_W0Co5vbg', 14, 11, 1, 1);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (57, 'Accounting/BFSI/Large Co', 'https://youtu.be/mij5cf_vRgQ', 14, 11, 1, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (58, 'Business Intelligence/IT/Large Co', 'https://youtu.be/pLon_Mit7sk', 15, 12, 3, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (59, 'Business Intelligence/NA/NA', 'https://youtu.be/9rMYgG6tNkg', 15, 12, null, null);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (60, 'Business Intelligence/BFSI/Large Co', 'https://youtu.be/N4kf3RQiryA', 15, 12, 1, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (61, 'Marketing/IT/Medium Sized Co', 'https://youtu.be/oAN2GN1-ZEY', 16, 5, 3, 2);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (62, 'Marketing/IT/NA', 'https://youtu.be/vrIsqvzmvTE', 16, 5, 3, null);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (63, 'Marketing/IT/Large Co', 'https://youtu.be/xlq7zObLfXo', 16, 5, 3, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (64, 'Management/BFSI/Large Co', 'https://youtu.be/Z_ITiLOvWtE', 17, 3, 1, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (65, 'Management/BFSI/Large Co', 'https://youtu.be/AxBAlym_418', 17, 3, 1, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (66, 'Management/BFSI/Large Co', 'https://youtu.be/_pDIFb6FOuY', 17, 3, 1, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (67, 'Biotechnology/Pharmaceuticals and Life sciences/Large Co', 'https://youtu.be/uGdrxFEf4SM', 18, 13, 10, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (68, 'Biotechnology/Pharmaceuticals and Life sciences/Large Co', 'https://youtu.be/UtVY1bgzbyM', 18, 13, 10, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (69, 'Biotechnology/Pharmaceuticals and Life sciences/Large Co', 'https://youtu.be/VnIAJwbCc7k', 18, 13, 10, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (70, 'Biotechnology/Pharmaceuticals and Life sciences/Large Co', 'https://youtu.be/LXHUVXpy9bs', 19, 13, 10, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (71, 'Biotechnology/Pharmaceuticals and Life sciences/Large Co', 'https://youtu.be/1TGXGjZhEp4', 19, 13, 10, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (72, 'Biomedical engineering/Pharmaceuticals and Life sciences/NA', 'https://youtu.be/0GyvH2l1ZVg', 20, 14, 10, null);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (73, 'Biomedical engineering/Pharmaceuticals and Life sciences/NA', 'https://youtu.be/yA5Oo4aGczo', 20, 14, 10, null);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (74, 'Biomedical engineering/Pharmaceuticals and Life sciences/NA', 'https://youtu.be/YFv5ibnPQSw', 20, 14, 10, null);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (75, 'Web Development/Entertainment & Media/NA', 'https://youtu.be/F205pO9iCzk', 21, 15, 5, null);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (76, 'Web Development/NA/NA', 'https://youtu.be/MCy5zXmlrfc', 21, 15, null, null);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (77, 'Web Development/IT/Large Co', 'https://youtu.be/SarSWcquizU', 21, 15, 3, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (78, 'Web Development/NA/NA', 'https://youtu.be/qoDPvFAk2Vg', 21, 15, null, null);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (79, 'Web Development/Entertainment & Media/Medium Sized Co', 'https://youtu.be/aRPOYPJPCho', 22, 15, 5, 2);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (80, 'Web Development/BFSI/Large Co', 'https://youtu.be/KJheEMdHEuc', 22, 15, 1, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (81, 'Education/Public Services/Large Co', 'https://youtu.be/Ln2oLAEB7JI', 23, 16, 6, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (82, 'Education/Public Services/Large Co', 'https://youtu.be/Ohb3Vv0bQqE', 23, 16, 6, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (83, 'Education/Public Services/Large Co', 'https://youtu.be/JdTp3M9loV8', 23, 16, 6, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (84, 'Education/Public Services/Large Co', 'https://youtu.be/H_8RZiScdpo', 23, 16, 6, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (85, 'Public Relations/Healthcare & Social Assistance/Small Co', 'https://youtu.be/CrFUxjJw_CY', 24, 10, 13, 1);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (86, 'Public Relations/BFSI/Large Co', 'https://youtu.be/aeWGQqp-M70', 24, 10, 1, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (87, 'Public Relations/IT/Large Co', 'https://youtu.be/m6HBVoMsX2g', 24, 10, 3, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (88, 'Public Relations/IT/Large Co', 'https://youtu.be/hFlPKstmqyA', 24, 10, 3, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (89, 'Cybersecurity/NA/NA', 'https://youtu.be/TKTAyerhggQ', 25, 17, null, null);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (90, 'Cybersecurity/Aerospace and Defense/NA', 'https://youtu.be/wet-O_W-ezE', 25, 17, 11, null);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (91, 'Cybersecurity/NA/NA', 'https://youtu.be/fU3ChpfUvPw', 25, 17, null, null);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (92, 'Photography/Entertainment & Media/Micro Co', 'https://youtu.be/U4Um8DCx1bk', 26, 18, 5, 4);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (93, 'Photography/Entertainment & Media/Micro Co', 'https://youtu.be/xA0ACbPaLmk', 26, 18, 5, 4);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (94, 'Photography/Entertainment & Media/Micro Co', 'https://youtu.be/Ezw2StDZ-2w', 26, 18, 5, 4);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (95, 'Photography/Entertainment & Media/Micro Co', 'https://youtu.be/Ptqqdz5nFf0', 26, 18, 5, 4);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (96, 'Media Communication/Entertainment & Media/NA', 'https://youtu.be/OrHwF7edAew', 27, 19, 5, null);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (97, 'Media Communication/Entertainment & Media/NA', 'https://youtu.be/wVm0lp7fJQk', 27, 19, 5, null);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (98, 'Media Communication/Entertainment & Media/Large Co', 'https://youtu.be/HGrE_hETgTA', 27, 19, 5, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (99, 'Media Communication/Entertainment & Media/Medium Sized Co', 'https://youtu.be/sPibZLE8nTw', 28, 19, 5, 2);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (100, 'Media Communication/Entertainment & Media/Large Co', 'https://youtu.be/SATFMmhm3ys', 28, 19, 5, 3);
INSERT INTO article(id, title, video_url, role_id, major_id, industry_id, size_id) VALUES (101, 'Media Communication/Entertainment & Media/Large Co', 'https://youtu.be/WJb9K6jflO0', 28, 19, 5, 3);
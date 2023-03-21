INSERT INTO role(id, name) VALUES (1, 'Quantitative Analyst');
INSERT INTO role(id, name) VALUES (2, 'Financial Analyst');
INSERT INTO role(id, name) VALUES (3, 'Sofware Engineer');
INSERT INTO role(id, name) VALUES (4, 'Compliance Officer');
INSERT INTO role(id, name) VALUES (5, 'Project Manager');
INSERT INTO role(id, name) VALUES (6, 'Nurse');

INSERT INTO major(id, name) VALUES (1, 'Finance');
INSERT INTO major(id, name) VALUES (2, 'IT');
INSERT INTO major(id, name) VALUES (3, 'Management');
INSERT INTO major(id, name) VALUES (4, 'Nursing');

INSERT INTO industry(id, name) VALUES (1, 'BFSI');
INSERT INTO industry(id, name) VALUES (2, 'Energy');
INSERT INTO industry(id, name) VALUES (3, 'IT');
INSERT INTO industry(id, name) VALUES (4, 'Ecommerce');
INSERT INTO industry(id, name) VALUES (5, 'Entertainment&Media');
INSERT INTO industry(id, name) VALUES (6, 'Public Service');

INSERT INTO size_table(id, name) VALUES (1, 'Small Co');
INSERT INTO size_table(id, name) VALUES (2, 'Medium Co');
INSERT INTO size_table(id, name) VALUES (3, 'Large Co');

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


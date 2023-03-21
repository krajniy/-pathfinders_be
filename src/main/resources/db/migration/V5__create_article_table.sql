CREATE TABLE article(
        id INT NOT NULL PRIMARY KEY,
        title VARCHAR(255) NOT NULL ,
        video_url VARCHAR(1000) NOT NULL ,
        role_id INT NOT NULL,
        major_id INT,
        industry_id INT,
        size_id INT,

        FOREIGN KEY (role_id) REFERENCES role(id),
        FOREIGN KEY (major_id) REFERENCES major(id),
        FOREIGN KEY (industry_id) REFERENCES industry(id),
        FOREIGN KEY (size_id) REFERENCES size_table(id)
)
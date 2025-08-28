CREATE TABLE post (
    pkNumber BIGINT AUTO_INCREMENT PRIMARY KEY,  -- 게시글 PK
    title VARCHAR(50) NOT NULL,                  -- 제목
    content TEXT NOT NULL,                       -- 내용
    thumbnail TEXT,                              -- 썸네일
    likes INT DEFAULT 0,                         -- 좋아요 수
    user_id VARCHAR(50) NOT NULL,                -- 작성자 ID (FK)
    year INT,                                    -- 연도
    grade INT,                                   -- 학년
    semester INT,                                -- 학기
    CONSTRAINT FK_post_user FOREIGN KEY (user_id) REFERENCES user(id)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);


CREATE TABLE user (
    pkNumber INT AUTO_INCREMENT PRIMARY KEY,  -- 기본키
    id VARCHAR(50) NOT NULL UNIQUE,           -- 사용자 ID (로그인용, 중복 불가)
    password VARCHAR(50) NOT NULL,            -- 비밀번호
    name VARCHAR(50) NOT NULL,                -- 이름
    email VARCHAR(50),                        -- 이메일
    mobile VARCHAR(50)                        -- 전화번호
);
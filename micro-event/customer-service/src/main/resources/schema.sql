DROP TABLE IF EXISTS user;
CREATE TABLE user
(
  id            BIGINT(20) PRIMARY KEY NOT NULL,
  email         VARCHAR(255),
  first_name    VARCHAR(255),
  last_name     VARCHAR(255),
  username      VARCHAR(255)
);
DROP TABLE IF EXISTS PALINDROME;

CREATE TABLE PALINDROME (
ID INT AUTO_INCREMENT PRIMARY_KEY,
LONGESTPALINDROME VARCHAR(2000) NOT NULL
);

INSERT INTO PALINDROME(ID,LONGESTPALINDROME) values (1,"abcba");
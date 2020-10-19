DROP USER IF EXISTS 'chinedu'@'localhost';
CREATE USER 'chinedu'@'localhost' IDENTIFIED BY 'chineduvictor84';
GRANT ALL PRIVILEGES ON weconnectdb.* TO 'weconnect'@'localhost';
FLUSH PRIVILEGES

DROP DATABASE IF EXISTS weconnect;
CREATE DATABASE weconnect;
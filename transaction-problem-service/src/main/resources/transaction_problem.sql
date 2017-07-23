CREATE DATABASE `transaction_problem` /*!40100 DEFAULT CHARACTER SET utf8 */;

CREATE TABLE `TP_ACCOUNT` (
  `ACCOUNT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `BALANCE_AMOUNT` decimal(10,0) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ACCOUNT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

CREATE TABLE `TP_USER` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` VARCHAR(255) DEFAULT NULL,
  `DESCRIPTION` VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

insert into TP_ACCOUNT (ACCOUNT_ID, BALANCE_AMOUNT, USER_ID) VALUES (1,100,1);

INSERT INTO TP_USER (USER_ID, NAME, DESCRIPTION) VALUES (1,"bobby.peng","wower");
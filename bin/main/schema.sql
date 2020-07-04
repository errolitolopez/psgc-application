DROP TABLE IF EXISTS PROVINCE;
DROP TABLE IF EXISTS MUNICIPALITY;

CREATE TABLE IF NOT EXISTS PROVINCE(ID INTEGER PRIMARY KEY, NAME VARCHAR(250));
CREATE TABLE IF NOT EXISTS MUNICIPALITY(ID INTEGER PRIMARY KEY, NAME VARCHAR(250), PROVINCE_ID INTEGER, ZIPCODE INTEGER);
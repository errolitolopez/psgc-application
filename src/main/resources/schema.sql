DROP TABLE IF EXISTS "region";
CREATE TABLE "region" (
  "id" int(11) PRIMARY KEY,
  "psgc_code" varchar(255),
  "name" varchar(255),
  "region_code" varchar(255)
); 


DROP TABLE IF EXISTS "province";
CREATE TABLE "province" (
  "id" int(11) PRIMARY KEY,
  "psgc_code" varchar(255),
  "name" varchar(255),
  "region_code" varchar(255),
  "province_code" varchar(255) 
); 


DROP TABLE IF EXISTS "municipality";
CREATE TABLE "municipality" (
  "id" int(255) PRIMARY KEY,
  "psgc_code" varchar(255),
  "name" varchar(255),
  "region_code" varchar(255),
  "province_code" varchar(255), 
  "municipality_code" varchar(255)
);
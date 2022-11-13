CREATE SEQUENCE "PERSON_SEQ" 
MINVALUE 1 
MAXVALUE 999999999 
INCREMENT BY 1 
START WITH 1 
NOCACHE 
NOCYCLE;

CREATE TABLE PERSON (
    id BIGINT DEFAULT NEXT VALUE FOR PERSON_SEQ,
    name varchar(50) NOT NULL,
    email varchar(500) NOT NULL,
    PRIMARY KEY (`id`)
);
INSERT INTO PERSON(name, email) VALUES ('NAHLA','gnahla@hotmail.com');
INSERT INTO PERSON(name, email) VALUES ('REDOUANE','chaibi.redouane@gmail.com');
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
    state BOOLEAN NOT NULL,
    PRIMARY KEY (`id`)
);
INSERT INTO PERSON(name, email, state) VALUES ('NAHLA','gnahla@hotmail.com', 1);
INSERT INTO PERSON(name, email, state) VALUES ('REDOUANE','chaibi.redouane@gmail.com', 1);
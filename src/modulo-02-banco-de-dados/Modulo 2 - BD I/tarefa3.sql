-- Gerado por Oracle SQL Developer Data Modeler 4.1.5.907
--   em:        2016-10-18 17:46:35 BRST
--   site:      Oracle Database 11g
--   tipo:      Oracle Database 11g




CREATE TABLE Candidatos
  (
    IDCandidato       NUMBER NOT NULL ,
    NomeCompleto      VARCHAR2 (100) NOT NULL ,
    NomePopular       VARCHAR2 (60) NOT NULL ,
    DataNascimento    DATE NOT NULL ,
    RegistroTRE       VARCHAR2 (30) NOT NULL ,
    Foto              VARCHAR2 (200) ,
    Cargo_IDCargo     NUMBER NOT NULL ,
    UF_IDUf           NUMBER NOT NULL ,
    Cidade_IDCidade   NUMBER NOT NULL ,
    Partido_IDPartido NUMBER NOT NULL
  ) ;
ALTER TABLE Candidatos ADD CONSTRAINT Candidatos_PK PRIMARY KEY ( IDCandidato ) ;


CREATE TABLE Cargo
  (
    IDCargo NUMBER NOT NULL ,
    Nome    VARCHAR2 (12) ,
    Numero  NUMBER NOT NULL
  ) ;
ALTER TABLE Cargo ADD CONSTRAINT Cargo_PK PRIMARY KEY ( IDCargo ) ;
ALTER TABLE Cargo ADD CONSTRAINT Cargo__UN UNIQUE ( Numero ) ;


CREATE TABLE Cidade
  (
    IDCidade NUMBER NOT NULL ,
    Nome     VARCHAR2 (20) NOT NULL
  ) ;
ALTER TABLE Cidade ADD CONSTRAINT Cidade_PK PRIMARY KEY ( IDCidade ) ;


CREATE TABLE Eleitor
  (
    IDEleitor      NUMBER NOT NULL ,
    NomeCompleto   VARCHAR2 (60) NOT NULL ,
    TituloEleitor  VARCHAR2 (12) NOT NULL ,
    RG             VARCHAR2 (10) NOT NULL ,
    DataNascimento DATE NOT NULL ,
    Zona           VARCHAR2 (10) NOT NULL ,
    Secao          VARCHAR2 (10) NOT NULL ,
    Votou          CHAR (1)
  ) ;
ALTER TABLE Eleitor ADD CONSTRAINT Entity_2_PK PRIMARY KEY ( IDEleitor ) ;
ALTER TABLE Eleitor ADD CONSTRAINT Eleitor__UN UNIQUE ( RG , TituloEleitor ) ;


CREATE TABLE Partido
  (
    IDPartido NUMBER NOT NULL ,
    Nome      VARCHAR2 (20) NOT NULL ,
    Sigla     VARCHAR2 (5) NOT NULL
  ) ;
ALTER TABLE Partido ADD CONSTRAINT Partido_PK PRIMARY KEY ( IDPartido ) ;


CREATE TABLE UF
  (
    IDUf  NUMBER NOT NULL ,
    Nome  VARCHAR2 (20) NOT NULL ,
    Sigla VARCHAR2 (2) NOT NULL
  ) ;
ALTER TABLE UF ADD CONSTRAINT UF_PK PRIMARY KEY ( IDUf ) ;


CREATE TABLE Voto
  (
    IDVoto                 NUMBER NOT NULL ,
    Quantidade             NUMBER ,
    Candidatos_IDCandidato NUMBER NOT NULL
  ) ;
ALTER TABLE Voto ADD CONSTRAINT Voto_PK PRIMARY KEY ( IDVoto ) ;


ALTER TABLE Candidatos ADD CONSTRAINT Candidatos_Cargo_FK FOREIGN KEY ( Cargo_IDCargo ) REFERENCES Cargo ( IDCargo ) ;

ALTER TABLE Candidatos ADD CONSTRAINT Candidatos_Cidade_FK FOREIGN KEY ( Cidade_IDCidade ) REFERENCES Cidade ( IDCidade ) ;

ALTER TABLE Candidatos ADD CONSTRAINT Candidatos_UF_FK FOREIGN KEY ( UF_IDUf ) REFERENCES UF ( IDUf ) ;

ALTER TABLE Candidatos ADD CONSTRAINT FK_Candidatos_Partido FOREIGN KEY ( Partido_IDPartido ) REFERENCES Partido ( IDPartido ) ;

ALTER TABLE Voto ADD CONSTRAINT FK_Voto_Candidatos FOREIGN KEY ( Candidatos_IDCandidato ) REFERENCES Candidatos ( IDCandidato ) ;


-- Relatório do Resumo do Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             7
-- CREATE INDEX                             0
-- ALTER TABLE                             14
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0

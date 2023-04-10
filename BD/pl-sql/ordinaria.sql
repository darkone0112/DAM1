/* Examen 3º Evaluacicon */
alter table oficinas drop constraint fk_oficina_dir;	
drop table emplead;
drop table oficinas;
/* POR EL CULO TE LA HINCO */
CREATE TABLE oficinas (
	numofi number(2),
	ciudad varchar2(30),
	region varchar2(20),
	director number(3),
	CONSTRAINT PK_oficina_numofi PRIMARY KEY(numofi));
	

	CREATE TABLE emplead (
	numemp number(3),
	nomape varchar2(20) NOT NULL,
	edad number(2),
	numofi number(2),
	cargo varchar2(20),
	contrato DATE NOT NULL,
	jefe number(3),
	minventas number(9,2),
	ventas number(9,2),
	CONSTRAINT PK_emplead_numemp PRIMARY KEY(numemp),
	CONSTRAINT FK_emplead_numofi FOREIGN KEY(numofi)REFERENCES oficinas(numofi),
	CONSTRAINT FK_emplead_jefe FOREIGN KEY (jefe) REFERENCES emplead (numemp));

alter table oficinas add CONSTRAINT FK_oficina_dir FOREIGN KEY (director) REFERENCES emplead(numemp);

insert into oficinas values (1,'Santiago','Galicia',null);
insert into oficinas values (2,'Burgos','CastillaLeon',null);
insert into oficinas values (3,'Badalona','Cataluña',null);

insert into emplead values (100,'Laura Gómez', 44, 1, 'Director General', '13/12/2010',null,null,null);
insert into emplead values (101,'Pedro Lopez', 34, 1, 'Director Ventas', '13/12/2013',100,3000,3500);
insert into emplead values (102,'Juan García', 43, 1, 'Comercial', '13/12/2014',101,1500,950);
insert into emplead values (103,'Patricia Conde', 21, 1, 'Comercial', '17/02/2015',101,1500,1050);
insert into emplead values (104,'Raquel Cañadas', 24, 1, 'Comercial', '11/04/2015',101,1500,800);

insert into emplead values (300,'Alba Molina', 40, 3, 'Director General', '01/02/2015',null,null,null);
insert into emplead values (301,'Nerea Álvarez', 31, 3, 'Director Ventas', '23/01/2017',300,3000,4010);
insert into emplead values (302,'Ana Peinado', 19, 3, 'Comercial', '13/10/2022',301,1500,1350);

update oficinas set director=100 where numofi=1;
update oficinas set director=300 where numofi=3;

select * from oficinas;
select * from emplead;

alter session set nls_date_format = 'dd/mm/yy';
COMMIT;

/* EXAMEN 1 */
CREATE OR REPLACE PROCEDURE OFILIST
IS
CURSOR C1 IS SELECT OFI.NUMOFI AS OFICINA, OFI.CIUDAD,COUNT(EM.NUMEMP) AS EMPLEADOS FROM OFICINAS OFI
    LEFT JOIN EMPLEAD EM ON EM.NUMOFI = OFI.NUMOFI GROUP BY OFI.NUMOFI,OFI.CIUDAD ORDER BY OFICINA;
    REG C1%ROWTYPE;
BEGIN
    OPEN C1;
    FETCH C1 INTO REG;
    WHILE C1%FOUND LOOP
    DBMS_OUTPUT.PUT_LINE(REG.OFICINA || ' ' || REG.CIUDAD || ' ' || REG.EMPLEADOS);
    FETCH C1 INTO REG;
    END LOOP;
    CLOSE C1;
END OFILIST;
EXECUTE OFILIST;

/* EXAMEN 2 */
CREATE OR REPLACE FUNCTION DIFERENCIA_F
(V_DATE DATE)
RETURN NUMBER
IS
V_DIFERENCIA NUMBER(5);
BEGIN
V_DIFERENCIA := (SYSDATE - V_DATE)/365;
RETURN V_DIFERENCIA;
END DIFERENCIA_F;

DECLARE
    V_DATE DATE := &FECHA;
    V_DIFERENCIA NUMBER(5);
BEGIN
   V_DIFERENCIA := DIFERENCIA_F(V_DATE);
    DBMS_OUTPUT.PUT_LINE(V_DIFERENCIA ||' AÑOS');
END;
SHOW ERRORS;

/* EXAMEN 3*/
CREATE OR REPLACE PROCEDURE EMPOFI
(V_NUMOFI IN EMPLEAD.NUMOFI%TYPE)
IS
    CURSOR C1 IS SELECT EMPLEAD.NOMAPE AS NOMBRE, EMPLEAD.CARGO, DIFERENCIA_F(EMPLEAD.CONTRATO) AS ANIOS
        FROM EMPLEAD WHERE EMPLEAD.NUMOFI = V_NUMOFI;
    REG C1%ROWTYPE;
    NO_OFI EXCEPTION;
BEGIN
    OPEN C1;
    FETCH C1 INTO REG;
    IF C1%NOTFOUND THEN
        RAISE NO_OFI;
    END IF;
    LOOP EXIT WHEN C1%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(REG.NOMBRE || ' - ' || REG.CARGO || ' - ' || REG.ANIOS);
        FETCH C1 INTO REG;
    END LOOP;
    CLOSE C1;
    EXCEPTION WHEN NO_OFI THEN
    DBMS_OUTPUT.PUT_LINE('NO SE HA ENCONTRADO LA OFICINAS');
END EMPOFI;

DECLARE
    V_NUMOFI NUMBER(3) := &NUMERO_OFICINA;
BEGIN
    EMPOFI(V_NUMOFI);
END;
SELECT * FROM EMPLEAD;

/* EXAMEN 4 */
CREATE OR REPLACE PROCEDURE DEL_EMP
(V_NUMEMP IN EMPLEAD.NUMEMP%TYPE)
IS
    CURSOR C1 IS SELECT EMPLEAD.NUMEMP FROM EMPLEAD WHERE EMPLEAD.CARGO IN ('Director General');
    V_DIRECTOR_GENERAL EMPLEAD.NUMEMP%TYPE;
    V_TIPO EMPLEAD.CARGO%TYPE;
    /* V_PROBANDO EMPLEAD.NOMAPE%TYPE; */
    GENDIR_EXCEPTION EXCEPTION;
    NO_EMP EXCEPTION;
BEGIN
    OPEN C1;
    FETCH C1 INTO V_DIRECTOR_GENERAL;
    WHILE C1%FOUND LOOP
    IF V_NUMEMP = V_DIRECTOR_GENERAL
    THEN
        RAISE GENDIR_EXCEPTION;
    END IF;
    FETCH C1 INTO V_DIRECTOR_GENERAL;
    END LOOP;
        SELECT EMPLEAD.CARGO INTO V_TIPO FROM EMPLEAD WHERE EMPLEAD.NUMEMP = V_NUMEMP;
    /* SELECT EMPLEAD.NOMAPE INTO V_PROBANDO FROM EMPLEAD WHERE EMPLEAD.NUMEMP = V_NUMEMP; */
    IF V_TIPO = 'Director Ventas'
    THEN
        UPDATE EMPLEAD
            SET EMPLEAD.JEFE = (SELECT EMPLEAD.NUMEMP FROM EMPLEAD WHERE EMPLEAD.CARGO IN ('Director General')
                                                                    AND EMPLEAD.NUMOFI = (SELECT EMPLEAD.NUMOFI FROM EMPLEAD
                                                                        WHERE EMPLEAD.NUMEMP = V_NUMEMP))
        WHERE EMPLEAD.JEFE = V_NUMEMP;
        DELETE FROM EMPLEAD
        WHERE EMPLEAD.NUMEMP = V_NUMEMP;
        DBMS_OUTPUT.PUT_LINE('DIRECTOR DE VENTAS: ' || V_NUMEMP || ' BORRADO ' || 'COMERCIALES SUBORDINADOS PASADOS A DIRECTOR GENERAL');
    ELSE
        DELETE FROM EMPLEAD
        WHERE EMPLEAD.NUMEMP = V_NUMEMP;
        DBMS_OUTPUT.PUT_LINE('COMERCIAL: ' || V_NUMEMP || 'BORRADO');
    END IF;

    EXCEPTION WHEN GENDIR_EXCEPTION THEN
        DBMS_OUTPUT.PUT_LINE('IMPOSIBLE BORRAR UN DIRECTOR GENERAL');
             WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('NO SE HA ENCONTRADO EMPLEADO CON DICHO CODIGO');

END DEL_EMP;
SHOW ERRORS;
SELECT * FROM EMPLEAD;
ROLLBACK;
DECLARE
    V_NUMEMP EMPLEAD.NUMEMP%TYPE := &CODIGO_EMPLEADO;
BEGIN
    DEL_EMP(V_NUMEMP);
END;

/* EXAMEN 5 */
CREATE TABLE TEMPORAL(
    INFO VARCHAR2(200)
)
CREATE OR REPLACE TRIGGER TRIGGEREXAMEN
    BEFORE INSERT OR DELETE OR UPDATE ON EMPLEAD
DECLARE
V_NOMAPE EMPLEAD.NOMAPE%TYPE;
BEGIN
 IF (TO_CHAR(SYSDATE,'DD')IN (25)) THEN
    SELECT EMPLEAD.NOMAPE INTO V_NOMAPE FROM EMPLEAD WHERE EMPLEAD.VENTAS = (SELECT MAX(EMPLEAD.VENTAS) FROM EMPLEAD);
    IF UPDATING THEN
        INSERT INTO TEMPORAL VALUES('MAYOR: '|| V_NOMAPE);
    END IF;
    END IF;
END;
UPDATE 
SELECT * FROM EMPLEAD;
ROLLBACK;
UPDATE EMPLEAD
SET NOMAPE = 'ELPEPE'
WHERE NUMEMP = 100;
SELECT * FROM TEMPORAL;
/* TRIGGERS */
/* 1 */
    /* trigger 1 */
CREATE TABLE ALUMNOSTRI(
    ID NUMBER(3) PRIMARY KEY,
    NOMBRE VARCHAR2(20),
    APELLIDO VARCHAR2(20),
    NOTA NUMBER(2)
);

CREATE OR REPLACE TRIGGER CHECK_NOTA
BEFORE INSERT ON ALUMNOSTRI
FOR EACH ROW
BEGIN
    IF :NEW.NOTA < 0 THEN
        :NEW.NOTA := 0;
        ELSE IF :NEW.NOTA > 10 THEN
            :NEW.NOTA := 10;
            ELSE IF TRUNC(:NEW.NOTA,0) <> :NEW.NOTA THEN
            :NEW.NOTA := TRUNC(:NEW.NOTA,0);
    END IF;
    END IF;
    END IF;
END;
SELECT * FROM ALUMNOSTRI;
INSERT INTO ALUMNOSTRI VALUES(555,'PROBANDO','PROBANDO',7.900);
ROLLBACK;
    /* trigger 2 */
    CREATE OR REPLACE TRIGGER CHECK_UPDATE_NOTA
    BEFORE UPDATE ON ALUMNOSTRI
    FOR EACH ROW
    BEGIN
    IF :NEW.NOTA < 0 THEN
        :NEW.NOTA := 0;
    ELSE IF :NEW.NOTA > 10 THEN
        :NEW.NOTA := 10;
        ELSE IF :NEW.NOTA <> TRUNC(:NEW.NOTA) THEN
            :NEW.NOTA := TRUNC(:NEW.NOTA);
    END IF;
    END IF;
    END IF;
    END;
    UPDATE ALUMNOSTRI
    SET NOTA = 8.10
    
    delete from alumnostri;
    SHOW ERRORS;
    /* procedimiento insertar */
    CREATE OR REPLACE PROCEDURE TRITEST
    IS
    BEGIN
        INSERT INTO ALUMNOSTRI VALUES(1,'PROBANDO1','PROBANDO1',20);
        UPDATE alumnostri
        SET NOTA = -10;
    END;
    EXECUTE TRITEST;
/* mas triggers*/

/* 1 */
CREATE TABLE AUDITAR_TEMPLE(
    INFO VARCHAR2(200)
);

CREATE OR REPLACE TRIGGER AUDITORIA_TEMPLE
AFTER INSERT OR DELETE ON TEMPLE
FOR EACH ROW
BEGIN
    IF INSERTING THEN
        INSERT INTO AUDITAR_TEMPLE VALUES(:NEW.NUMEM ||' '|| :NEW.NOMEM ||' '|| '*INSERTADO*');
    ELSE IF DELETING THEN
        INSERT INTO AUDITAR_TEMPLE VALUES(:OLD.NUMEM ||' '|| :OLD.NOMEM ||' '|| '*BORRADO*');
    END IF;
    END IF;
END AUDITORIA_TEMPLE;
SELECT * FROM TEMPLE;
SELECT * FROM AUDITAR_TEMPLE;
INSERT INTO TEMPLE VALUES(123,121,555,SYSDATE,SYSDATE,2000,NULL,0,'PROBANDO');
DELETE FROM TEMPLE WHERE NUMEM = 123;


/* 2 */
CREATE TABLE AUDITAREMP(
    INFO VARCHAR2(200)
)
CREATE OR REPLACE TRIGGER AUDITAR_EMP
AFTER UPDATE ON EMP
FOR EACH ROW
BEGIN
    INSERT INTO AUDITAREMP VALUES('VALORES ANTIGUOS: '|| :OLD.EMPNO || ' ' || :OLD.ENAME ||' '|| SYSDATE || ' MODIFICADO A: ' || :NEW.ENAME || ' ' || :NEW.EMPNO);
END;
SELECT * FROM EMP;
UPDATE EMP
SET ENAME = 'SMITH MOD'
WHERE EMP.EMPNO = 7369;
SELECT * FROM AUDITAREMP;

/* 3 */
CREATE OR REPLACE TRIGGER ERROREMP
BEFORE UPDATE OF ENAME, EMPNO, SAL ON EMP
FOR EACH ROW
BEGIN
/* DBMS_OUTPUT.PUT_LINE('OJO'); */
    IF UPDATING ('ENAME') OR UPDATING ('EMPNO') OR UPDATING ('SAL') AND :NEW.SAL > :OLD.SAL*1.1 THEN
    RAISE_APPLICATION_ERROR(-20001,'MODIFICACION NO PERMITIDA');
    END IF;
END;
/* SELECT * FROM EMP;
UPDATE EMP
SET EMPNO = 500
WHERE EMPNO = 7369;
UPDATE EMP
SET ENAME = 'EL PEPE'
WHERE EMPNO = 7369;
UPDATE EMP
SET SAL = SAL * 1.2
WHERE EMPNO = 7369; */
SHOW ERRORS;

/* ASIR */
DROP TABLE ASIGNATURAS CASCADE CONSTRAINTS;
CREATE TABLE ASIGNATURAS
( COD_ASIG NUMBER(2) PRIMARY KEY,
  NOM_ASIG  VARCHAR2(20)
);

DROP TABLE ALUMNOS CASCADE CONSTRAINTS;
CREATE  TABLE ALUMNOS
(
  NOM_ALUM VARCHAR2(20) NOT NULL,
  COD_ASIG NUMBER(2) NOT NULL,
  NOTA  NUMBER(2),
  CONSTRAINT PK_ALUM PRIMARY KEY(NOM_ALUM, COD_ASIG),
  CONSTRAINT FK_ALUM FOREIGN KEY(COD_ASIG) REFERENCES ASIGNATURAS
); 

INSERT INTO ASIGNATURAS VALUES(1,'INFORMÁTICA');
INSERT INTO ASIGNATURAS VALUES(2,'MATEMÁTICAS');
INSERT INTO ASIGNATURAS VALUES(3,'FÍSICA');
INSERT INTO ASIGNATURAS VALUES(4,'LENGUA');
INSERT INTO ASIGNATURAS VALUES(5,'FRANCÉS');
INSERT INTO ASIGNATURAS VALUES(6,'INGLÉS');
INSERT INTO ASIGNATURAS VALUES(7,'HISTORIA');
INSERT INTO ASIGNATURAS VALUES(8,'BIOLOGÍA');
INSERT INTO ASIGNATURAS VALUES(9,'GEOLOGÍA');
INSERT INTO ASIGNATURAS VALUES(10,'ED. FÍSICA');

INSERT INTO ALUMNOS VALUES('JUAN',1,5);
INSERT INTO ALUMNOS VALUES('JUAN',4,7);
INSERT INTO ALUMNOS VALUES('JUAN',6,8);
INSERT INTO ALUMNOS VALUES('JUAN',2,4);

INSERT INTO ALUMNOS VALUES('ANA',2,10);
INSERT INTO ALUMNOS VALUES('ANA',3,3);
INSERT INTO ALUMNOS VALUES('ANA',1,8);
INSERT INTO ALUMNOS VALUES('ANA',5,7);

INSERT INTO ALUMNOS VALUES('PEDRO',7,6);
INSERT INTO ALUMNOS VALUES('PEDRO',8,9);
INSERT INTO ALUMNOS VALUES('PEDRO',9,5);
INSERT INTO ALUMNOS VALUES('PEDRO',10,6);

Commit;
SELECT * FROM ASIGNATURAS;
SELECT * FROM ALUMNOS;

/* ASIR 1 */
CREATE OR REPLACE PROCEDURE DETALLES_ALUMNO
(V_NOMBRE IN ALUMNOS.NOM_ALUM%TYPE)
IS
CURSOR C1 IS SELECT ASIGNATURAS.NOM_ASIG FROM ASIGNATURAS,ALUMNOS WHERE ALUMNOS.COD_ASIG = ASIGNATURAS.COD_ASIG AND ALUMNOS.NOTA < 5 AND ALUMNOS.NOM_ALUM IN (V_NOMBRE);
V_ASIGNATURAS C1%ROWTYPE;
V_VALIDAR ALUMNOS.NOM_ALUM%TYPE;
ALUMNO_NOT_FOUND EXCEPTION;
BEGIN
SELECT ALUMNOS.NOM_ALUM INTO V_VALIDAR FROM ALUMNOS WHERE ALUMNOS.NOM_ALUM = V_NOMBRE AND ROWNUM = 1;
OPEN C1;
FETCH C1 INTO V_ASIGNATURAS;
IF C1%NOTFOUND THEN
    RAISE ALUMNO_NOT_FOUND;
END IF;
DBMS_OUTPUT.PUT_LINE(V_NOMBRE || ' HA SUSPENDIDO: ');
WHILE C1%FOUND LOOP
    DBMS_OUTPUT.PUT_LINE(V_ASIGNATURAS.NOM_ASIG);
    FETCH C1 INTO V_ASIGNATURAS;
END LOOP;
CLOSE C1;
EXCEPTION WHEN ALUMNO_NOT_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('ENHORABUENA ' || V_NOMBRE || '!!');
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('NO SE HA ENCONTRADO EL ALUMNO ' ||V_NOMBRE);
END;

DECLARE
    V_NOMBRE ALUMNOS.NOM_ALUM%TYPE := &NOMBRE;
BEGIN
    DETALLES_ALUMNO(V_NOMBRE);
END;

/* ASIR 2 */
CREATE OR REPLACE PROCEDURE NOTA_MEDIA
(V_NOMBRE IN ALUMNOS.NOM_ALUM%TYPE)
IS
V_MEDIA ALUMNOS.NOTA%TYPE;
V_VALIDAR ALUMNOS.NOM_ALUM%TYPE;
BEGIN
    SELECT AVG(ALUMNOS.NOTA)AS MEDIA INTO V_MEDIA FROM ALUMNOS WHERE ALUMNOS.NOM_ALUM = V_NOMBRE;
    SELECT ALUMNOS.NOM_ALUM INTO V_VALIDAR FROM ALUMNOS WHERE ALUMNOS.NOM_ALUM = V_NOMBRE AND ROWNUM = 1;
        DBMS_OUTPUT.PUT_LINE('EL ALUMNO ' ||V_NOMBRE|| ' TIENE UNA MEDIA DE: ' || V_MEDIA);
    EXCEPTION WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('ALUMNO NO ENCONTRADO');
END;
DECLARE
    V_NOMBRE ALUMNOS.NOM_ALUM%TYPE := &NOMBRE;
BEGIN
    NOTA_MEDIA(V_NOMBRE);
END;

/* ASIR 3 */
CREATE OR REPLACE FUNCTION ALUMNOS_ASIGNATURAS
(V_ASIGNATURA ASIGNATURAS.NOM_ASIG%TYPE)
RETURN NUMBER
IS
V_MEDIA NUMBER(3);
V_VALIDARR ALUMNOS.NOM_ALUM%TYPE;
/* ASIGNATURA_NOT_FOUND EXCEPTION; */
BEGIN
    SELECT ASIGNATURAS.NOM_ASIG INTO V_VALIDARR FROM ASIGNATURAS WHERE ASIGNATURAS.NOM_ASIG = V_ASIGNATURA;
    SELECT COUNT(ALUMNOS.NOM_ALUM) INTO V_MEDIA FROM ALUMNOS WHERE ALUMNOS.COD_ASIG = (SELECT ASIGNATURAS.COD_ASIG FROM ASIGNATURAS WHERE ASIGNATURAS.NOM_ASIG = V_ASIGNATURA);
    RETURN V_MEDIA;
    EXCEPTION WHEN OTHERS THEN
        RETURN -1;
END;

DECLARE
    V_ASIGNATURA ASIGNATURAS.NOM_ASIG%TYPE:=&ASIGNATURA;
    V_ALUMNOS NUMBER(3);
BEGIN
V_ALUMNOS:=ALUMNOS_ASIGNATURAS(V_ASIGNATURA);
    IF V_ALUMNOS = -1 THEN
        DBMS_OUTPUT.PUT_LINE('NO SE HA ENCONTRADO LA ASIGNATURA ' || V_ASIGNATURA);  
    ELSE
    DBMS_OUTPUT.PUT_LINE('HAY UN TOTAL DE ' ||V_ALUMNOS || ' MATRICULADOS EN LA ASIGNATURA '|| V_ASIGNATURA );
    END IF;
END;
SELECT * FROM ASIGNATURAS;
SELECT * FROM ALUMNOS;

/* ASIR 4 */
CREATE OR REPLACE FUNCTION TO_10
(V_ASIGNATURA ASIGNATURAS.NOM_ASIG%TYPE)
RETURN VARCHAR2
IS
V_VALIDARR ASIGNATURAS.NOM_ASIG%TYPE;
BEGIN
SELECT ASIGNATURAS.NOM_ASIG INTO V_VALIDARR FROM ASIGNATURAS WHERE ASIGNATURAS.NOM_ASIG = V_ASIGNATURA;
 UPDATE ALUMNOS 
    SET ALUMNOS.NOTA = 10
WHERE ALUMNOS.COD_ASIG = (SELECT ASIGNATURAS.COD_ASIG FROM ASIGNATURAS WHERE ASIGNATURAS.NOM_ASIG = V_ASIGNATURA);
    RETURN 'SI';
    EXCEPTION WHEN OTHERS THEN
        RETURN 'NO';
END;

DECLARE
    V_ASIGNATURA ASIGNATURAS.NOM_ASIG%TYPE:=&ASIGNATURA;
    V_RESPUESTA VARCHAR2(3);
BEGIN
    V_RESPUESTA:=TO_10(V_ASIGNATURA);
    DBMS_OUTPUT.PUT_LINE(V_RESPUESTA || ' HAY ALUMNOS AFECTADOS CON EL CAMBIO DE NOTA');
END;


/* 1-SOME MORE TRIGGERS */
/* 2-JESUS CHRIST IN A MOTOCROSS BIKE E-R IS DOGSHIT*/
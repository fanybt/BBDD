* 1. Crea un procedimiento que reciba un número de empleado y una cadena
correspondiente a su nuevo oficio (job_id) como parámetros.
El procedimiento deberá localizar el empleado, modificar su oficio por el nuevo y visualizar los cambios realizados.*/
-- PROCEDURE
CREATE OR REPLACE PROCEDURE MOD_OFICIO_EMPL(
    P_EMPLEADO_ID  IN EMPLOYEES.EMPLOYEE_ID%TYPE,
    P_NUEVO_JOBID  IN EMPLOYEES.JOB_ID%TYPE) AS
BEGIN
    UPDATE EMPLOYEES
    SET JOB_ID = P_NUEVO_JOBID  
    WHERE EMPLOYEE_ID = P_EMPLEADO_ID;
 COMMIT;
    
    DBMS_OUTPUT.PUT_LINE('El trabajo del empleado ' || P_EMPLEADO_ID  || ' ha sido modificado a ' || P_NUEVO_JOBID  );
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('No se encontró ningún empleado con el ID ' || P_EMPLEADO_ID  );
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Ocurrió un error al modificar el trabajo del empleado ' || P_EMPLEADO_ID  );
        RAISE;
END;
/
/*2. El procedimiento ha de llamar a una función que deberá comprobar si
el id del oficio existe. Esta tarea la realizará una función aparte a la
que se le pasará el oficio por parámetro y retornará un booleano.
Si el oficio no existe, el procedimiento informará con un mensaje por consola.*/
-- FUNCTION
CREATE OR REPLACE FUNCTION OFICIO_EXISTE(P_JOB_ID JOBS.JOB_ID%TYPE) RETURN BOOLEAN
AS V_CUANTOS PLS_INTEGER;
BEGIN
    SELECT COUNT(*)
    INTO V_CUANTOS
    FROM JOBS
    WHERE JOB_ID = P_JOB_ID;
    
    RETURN V_CUANTOS > 0;
END OFICIO_EXISTE;
/
-- PROCEDIMIENTO LLAMANDO A LA FUNCIÓN
CREATE OR REPLACE PROCEDURE MOD_OFICIO_EMPL(P_EMPLEADO_ID IN EMPLOYEES.EMPLOYEE_ID%TYPE,P_NUEVO_JOBID IN EMPLOYEES.JOB_ID%TYPE)
AS
	V_CUANTOS BOOLEAN;
BEGIN
	V_CUANTOS := OFICIO_EXISTE(P_NUEVO_JOBID);
    
    IF V_CUANTOS THEN
		UPDATE EMPLOYEES
		SET JOB_ID = P_NUEVO_JOBID
		WHERE EMPLOYEE_ID = P_EMPLEADO_ID;
		COMMIT;
	ELSE
		DBMS_OUTPUT.PUT_LINE('El trabajo ' || P_NUEVO_JOBID || ' no existe.');
    END IF;
    DBMS_OUTPUT.PUT_LINE('El trabajo del empleado ' || P_EMPLEADO_ID || ' ha sido modificado a ' || P_NUEVO_JOBID);
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('No se encontró ningún empleado con el ID ' || P_EMPLEADO_ID);
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Ocurrió un error al modificar el trabajo del empleado ' || P_EMPLEADO_ID);
        RAISE;
END;
/
/*3. Crea también un bloque anónimo donde ejecutar el procedimiento
con los valores de los argumentos recogidos en variables de sustitución.*/
/*BLOQUE ANÓNIMO. HEMOS PUESTO UN JOB_ID QUE EXISTE Y HEMOS PROBADO CON OTRO QUE NO EXISTE Y FUNCIONA*/
SET SERVEROUTPUT ON
DECLARE
    V_JOBID JOBS.JOB_ID%TYPE;
BEGIN
    V_JOBID := 'IT_PROG';
    IF OFICIO_EXISTE(V_JOBID) THEN
		DBMS_OUTPUT.PUT_LINE('ESTE JOBID EXISTE');
	ELSE
		DBMS_OUTPUT.PUT_LINE('ESTE JOBID NO EXISTE : ');
	END IF;
EXCEPTION
	WHEN OTHERS THEN
		DBMS_OUTPUT.PUT_LINE('ERROR EN EL PROGRAMA, '||SQLERRM);
END;
/

//*4. Crea un trigger que inserte un registro en una tabla nueva llamada
EMP_AUDIT cada vez que modificamos el salario de un empleado. Sólo se
realizará la operación si el salario que se va a modificar difiere del nuevo.
La tabla EMP_AUDIT tendrá los siguientes campos:
    * Identificador del empleado que se está actualizando.
    * El momento en que se hace la actualización.
    * Un mensaje que contenga el salario anterior y el nuevo.*/
-- CREAMOS LA NUEVA TABLA QUE REGISTRARÁ LAS MODIFICACIONES DE SALARIO
CREATE TABLE EMP_AUDIT (
ID_EMP NUMBER(6),
DATE_MOMENT TIMESTAMP,
DATO_MODIFICADO VARCHAR2(50));

-- TRIGGER
CREATE OR REPLACE TRIGGER AUDIT_MODIFI_SALARIO
AFTER UPDATE OF SALARY ON EMPLOYEES
FOR EACH ROW
DECLARE
	V_USER NUMBER(6);
BEGIN
	SELECT EMPLOYEE_ID INTO V_USER FROM EMPLOYEES;
	IF :NEW.SALARY <> :OLD.SALARY THEN
		INSERT INTO EMP_AUDIT (ID_EMP,DATE_MOMENT,DATO_MODIFICADO)
        VALUES (V_USER,SYSTIMESTAMP, 'SALARIO ANTERIOR: '||:OLD.SALARY || ' Y SALARIO NUEVO: '||:NEW.SALARY);
	END IF;
END AUDIT_MODIFI_SALARIO;
/


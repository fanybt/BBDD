package daos;

import javabeans.Cliente;
import javabeans.Empleado;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDaoSQL implements EmpleadoDao{
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public EmpleadoDaoSQL() {
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AD6PPce?serverTimezone=UTC", "root", "root");
            System.out.println("conexion establecida");
        } catch (SQLException var2) {
            System.out.println("no establecida");
            var2.printStackTrace();
        }
    }

    @Override
    public List<Empleado> empleadosByDepartamento(int idDepar) {
        List<Empleado> lista = new ArrayList<Empleado>();
        this.sql = "Select * from clientes where departamento = " + idDepar;
        Empleado empleado = new Empleado();

        try {
            this.ps = this.conn.prepareStatement(this.sql);
            this.ps.setInt(1, idDepar);
            this.rs = this.ps.executeQuery();
            if (this.rs.next()) {
                empleado = new Empleado();
                empleado.setId_empl(this.rs.getInt(1));
                empleado.setNombre(this.rs.getString(2));
                empleado.setApellidos(this.rs.getString(3));
                empleado.setEmail(this.rs.getString(4));
                empleado.setPassword(this.rs.getString(5));
                empleado.setFecha_ingreso(this.rs.getDate(6));
                empleado.setFecha_nacimiento(this.rs.getDate(6));
            }
            lista.add(empleado);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return lista;
    }

    @Override
    public List<Empleado> empleadosBySexo(char sexo) {
        // en la tabla empleados no hay sexo
        return null;
    }

    @Override
    public List<Empleado> empleadosByApellido(String apellido) {
        List<Empleado> lista = new ArrayList<Empleado>();
        this.sql = "Select * from empleados where apellido = " + apellido;
        Empleado empleado = new Empleado();

        try {
            this.ps = this.conn.prepareStatement(this.sql);
            this.rs = this.ps.executeQuery();
            if (this.rs.next()) {
                empleado = new Empleado();
                empleado.setId_empl(this.rs.getInt(1));
                empleado.setNombre(this.rs.getString(2));
                empleado.setApellidos(this.rs.getString(3));
                empleado.setEmail(this.rs.getString(4));
                empleado.setPassword(this.rs.getString(5));
                empleado.setFecha_ingreso(this.rs.getDate(6));
                empleado.setFecha_nacimiento(this.rs.getDate(6));
            }
            lista.add(empleado);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return lista;
    }
// SELECT agent_code,
//SUM (advance_amount)
//FROM orders
//GROUP BY agent_code;
    @Override
    public double salarioTotal() {
        double suma = 0;
        this.sql = "Select sum(salario) from empleados";

        try {
            this.ps = this.conn.prepareStatement(this.sql);
            this.rs = this.ps.executeQuery();
            if (this.rs.next()) {
                suma = (this.rs.getDouble(1));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return suma;
    }

    @Override
    public double salarioTotal(int idDepar) {
        double suma = 0;
        this.sql = "Select sum(salario) from empleados where id_depar = " + idDepar;

        try {
            this.ps = this.conn.prepareStatement(this.sql);
            this.rs = this.ps.executeQuery();
            if (this.rs.next()) {
                suma = (this.rs.getDouble(1));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return suma;
    }
}

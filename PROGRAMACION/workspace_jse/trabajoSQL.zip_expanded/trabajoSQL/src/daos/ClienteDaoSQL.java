package daos;

import javabeans.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoSQL implements ClienteDao {
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public ClienteDaoSQL() {
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AD6PPce?serverTimezone=UTC", "root", "root");
            System.out.println("conexion establecida");
        } catch (SQLException var2) {
            System.out.println("no establecida");
            var2.printStackTrace();
        }
    }

    @Override
    public List<Cliente> buscarTodos() {
        List lista = new ArrayList<Cliente>();
        int i = 0;
        do {
            lista.add(buscarUna(i));
        }while (buscarUna(i) != null);
        return lista;
    }

    @Override
    public Cliente buscarUna(int cif) {
        this.sql = "Select * from clientes where cif=?";
        Cliente cliente = new Cliente();

        try {
            this.ps = this.conn.prepareStatement(this.sql);
            this.ps.setInt(1, cif);
            this.rs = this.ps.executeQuery();
            if (this.rs.next()) {
                cliente = new Cliente();
                cliente.setCif(this.rs.getString(1));
                cliente.setNombre(this.rs.getString(2));
                cliente.setApellidos(this.rs.getString(3));
                cliente.setDomicilio(this.rs.getString(4));
                cliente.setFacturacion_anual(this.rs.getDouble(5));
                cliente.setNumero_empleados(this.rs.getInt(6));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return cliente;
    }

    @Override
    public int altaAlojamientos(Cliente cliente) {
        this.sql = "Insert into clientes values ("+ cliente.getCif() + "," + cliente.getNombre() + "," + cliente.getApellidos() + "," + cliente.getDomicilio() + "," + cliente.getFacturacion_anual() + "," + cliente.getNumero_empleados() +")";

        try {
            this.ps = this.conn.prepareStatement(this.sql);
            this.rs = this.ps.executeQuery();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return 0;
    }
}

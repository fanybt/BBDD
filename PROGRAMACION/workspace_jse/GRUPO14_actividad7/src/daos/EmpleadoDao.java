package daos;

import java.util.List;

import javabeans.Empleado;

public interface EmpleadoDao {
    List<Empleado> empleadosByDepartamento(int idDepar);
    List<Empleado> empleadosBySexo(char sexo);
    List<Empleado> empleadosByApellido(String apellido);

    double salarioTotal();
    double salarioTotal(int idDepar);
    

}

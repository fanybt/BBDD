package daos;

import javabeans.Empleado;

import java.util.ArrayList;
import java.util.List;

public interface EmpleadoDao {
    List<Empleado> empleadosByDepartamento(int idDepar);
    List<Empleado> empleadosBySexo(char sexo);
    List<Empleado> empleadosByApellido(String apellido);

    double salarioTotal();
    double salarioTotal(int idDepar);
}

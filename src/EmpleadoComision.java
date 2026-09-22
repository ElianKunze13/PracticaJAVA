public class EmpleadoComision {
    private double ventasRealizadas;
    private double porcetajeComision;
    private Empleado empleado;

    public EmpleadoComision(){
        this.ventasRealizadas = -1;
        this.porcetajeComision= -1;
        this.empleado = new Empleado();
    }
    public EmpleadoComision(double ventasRealizadas, double porcetajeComision){
        this.ventasRealizadas = ventasRealizadas;
        this.porcetajeComision= porcetajeComision;
        this.empleado = new Empleado();
    }

}

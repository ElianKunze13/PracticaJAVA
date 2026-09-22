public class Empleado {

    private String nombre;
    private double sueldoBase;

    public Empleado(){
        this.nombre= "";
        this.sueldoBase= -1;
    }
    public Empleado(String nombre, double sueldoBase){
        this.nombre= nombre;
        this.sueldoBase= sueldoBase;
    }



    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setSueldoBase(double sueldoBase){
        this.sueldoBase= sueldoBase;
    }
    public double getSueldoBase(){
        return sueldoBase;
    }

    public void calcularSalario(){
        System.out.println("Sueldo base: " + getSueldoBase() );
    }
}

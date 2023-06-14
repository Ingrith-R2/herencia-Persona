public class Empleado extends Persona{
    private String puesto;
    private String cargo;

    public Empleado (int CI, String Nombre, String Apellido, String Direccion, String Telefono,String signo, String edad, String tiempo, String puesto, String cargo){
        super(CI, Nombre, Apellido, Direccion, Telefono, signo, Integer.parseInt(edad), tiempo);
        this.puesto = puesto;
        this.cargo = cargo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void trabaja(){
        System.out.println("El empleado trabaja");
    }

}

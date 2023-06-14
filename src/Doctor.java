public class Doctor extends Persona{
    private String especialidad;
    private int codigo;
    private String horario;
    private String hospital;

    public Doctor(){
        super();
    }

    public Doctor(int CI, String nombre, String apellido, String direccion, String telefono,String signo, int edad, String tiempo , String especialidad, int codigo, String horario, String hospital){
        super(CI, nombre, apellido, direccion, telefono,signo, edad, tiempo);
        this.especialidad = especialidad;
        this.codigo = codigo;
        this.horario = horario;
        this.hospital = hospital;

    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    public void curar(){
        System.out.println("El doctor cura");
    }
}


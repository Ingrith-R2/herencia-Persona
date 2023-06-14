public class Persona {
    private int CI;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Telefono;
    private String signo;
    private int edad;
    private String tiempo;
    private String semestre;

    public Persona(){
    }
    public Persona(int CI, String nombre, String apellido, String direccion, String telefono,String signo, int edad, String tiempo, String semestre) {
        this.CI = CI;
        Nombre = nombre;
        Apellido = apellido;
        Direccion = direccion;
        Telefono = telefono;
        signo = signo;
        edad = edad;
        tiempo = tiempo;
        semestre = semestre;
    }

    public Persona(int ci, String nombre, String apellido, String direccion, String telefono, String signo, int edad, String tiempo) {
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    //

    public void caminar(){
        System.out.println("Este es el método de caminar");
    }

    public int trabajar(){
        return 0;
    }
    public void leer(){
        System.out.println("El estudiante lee");
    }
    public void tramitar(){
        System.out.println("El empleado tramita");
    }
    public void correr(){
        System.out.println("El futbolista corre");
    }
    public void examinar(){
        System.out.println("El doctor examina");
    }
}

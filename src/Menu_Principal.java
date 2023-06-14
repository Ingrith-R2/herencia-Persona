public class Menu_Principal {
    public static void main(String[] args){

        Persona Persona2 = new Doctor(123,
                "Danny",
                "Cayo",
                "Carcelen",
                "0984623571",
                "Tauro",
                33,
                "2 horas",
                "Electricidad",
                3256987,
                "Matutina",
                "VozAndes");
        Persona Persona3 = new Empleado(123,
                "Kimberly",
                "Revelo",
                "Salinas",
                "0969966729",
                "Piscis",
                "24",
                "3 horas",
                "Docencia ",
                "Licenciada");
        Persona Persona4 = new Futbolista(123,
                "Maricruz",
                "Alta",
                "Pisuli",
                "32154789",
                "Tauro",
                14,
                "5 Horas diarias",
                "Ecuador",
                "defensa",
                2,
                "Hilda Romero");
        Persona Persona5 = new Estudiante(123,
                "Ingrith",
                "Revelo",
                "Carcelen",
                "0981402837",
                "Cancer",
                20,
                "5 minutos ",
                202020343,
                "ingirth.revelo@epn.edu.ec",
                "3er semestre",
                "Software");
        System.out.println("Persona 1");
        System.out.println("Nombre: "+ Persona2.getNombre());
        System.out.println("Edad: "+ Persona2.getEdad());
        System.out.println("Signo: "+ Persona2.getSigno());
        Persona2.examinar();
        System.out.println("Persona 2");
        System.out.println("Nombre: "+ Persona3.getNombre());
        System.out.println("Teléfono: "+ Persona3.getTelefono());
        Persona3.tramitar();
        System.out.println("Persona 3");
        System.out.println("Nombre: "+ Persona4.getNombre());
        System.out.println("Tiempo: "+ Persona4.getTiempo());
        Persona4.correr();
        System.out.println("Persona 4");
        System.out.println("Nombre: "+ Persona5.getNombre());
        System.out.println("Semestre: "+ Persona5.getSemestre());
        Persona5.leer();

    }
}

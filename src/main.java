public class main {
    public static void main(String[] args){

        Persona p = new Persona();
        p.setEdad(21);
        p.setNombre("Benjamin");
        p.setTelefono("+56 9 88959599");

        System.out.println(p.getEdad());
        System.out.println(p.getNombre());
        System.out.println(p.getTelefono());
    }

}

class Persona{

    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
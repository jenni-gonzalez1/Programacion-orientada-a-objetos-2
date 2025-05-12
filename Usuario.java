//crear una clase
public class Usuario {

    //Propiedades o atributos del objeto
    //Propiedades privadas del objeto (atributos encapsulados)
    private String nombre;
    private String apellidos;
    private int edad;
    private int fechaNacimiento;

    //metodo constructor
    public Usuario(String nombre, String apellidos, int edad, int fechaNacimiento) { 
        //this=este
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    //metodos gets ara obtener el valor de los atributos
    public int getEdad() {
        return this.edad;
    }

    public int getfechaNacimiento() {
        return this.fechaNacimiento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos () {
        return this.apellidos;
    }

    //metodos sets para modificar el valor de los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //metodos 
    //Método para mostrar los datos del objeto en consola
    public void mostrarDatos () {
        System.out.println("nombre: " + nombre);
        System.out.println("apellidos: " + apellidos);
        System.out.println("edad: " + edad);
        System.out.println("fecha nacimiento: " + fechaNacimiento);

    

    }
}
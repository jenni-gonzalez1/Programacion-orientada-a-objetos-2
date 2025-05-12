public class Main {

    public static void main(String[] args) {
        

        //usuarios
        Usuario usuario1 = new Usuario("Jennifer Paola", "Gonzalez Patzan", 16, 2009);
        Usuario usuario2 = new Usuario("Margeory Hayde", "Pacheco Lopez", 16, 2009);

        usuario1.setNombre("Jennifer Paola"); // Cambiar el nombre del usuario1 usando el método setNombre (encapsulamiento)

        usuario1.mostrarDatos(); //mostrar los datos completos del usuario
        usuario2.mostrarDatos(); //mostrar los datos completos del usuario

        
        System.out.println(usuario1.getApellidos()); // Obtener y mostrar los apellidos de usuario1 mediante el método get
        System.out.println(usuario1.getEdad()); // Obtener y mostrar la edad de usuario1
        System.out.println(usuario1.getfechaNacimiento()); // Obtener y mostrar la fecha de nacimiento de usuario1
        
        // Verificar si el usuario1 es mayor de edad y mostrar un mensaje
        if (usuario1.getEdad() >= 18) {
            System.out.println("Mayor de edad");
        }
        
        
    }
}
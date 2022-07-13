import utilitario.ProgressBar;

public class App {
    public static void main(String[] args) throws Exception {
        //INSTRUCCIONES
        //1. Leer cuidadosamente el caso práctico y las preguntas a desarrollar descritas en la presente rúbrica
        //2. El proyecto debe tener de nombre su correo electrónico (nombre apellido@epn edu ec) y subido al Teams en
        //3. Agregar la presente rúbrica en su proyecto menos 0 5 si no agrega la rúbrica y se calificará a quienes suban el proyecto en el
        //tiempo indicado 2 horas
        //4. Mantener encender la cámara encendida durante el examen Cualquier intento de copia se anula el examen

        System.out.println( "*** Menú principal ***");
        System.out.println( " 1. Mostrar una barra de carga de longitud de su correo electrónico usando el método showProgressBar SegundaVocaldeCorreo ");
        System.out.println( " 2. Mostrar la barra de carga en color Azul");
        System.out.println( " 3. Mostrar el porcentaje de carga en color rojo:");
        System.out.println( " 4. Convertir las vocales a mayúsculas y las consonantes a minúsculas");
        System.out.println( " 5. Mostrar los caracteres cargados y el total de caracteres:");
        System.out.println( " 6. Mostrar los caracteres cargados en color azul :");
        System.out.println( " 7. Mostrar el ultimo carácter cargado en color rojo:");
        System.out.println( " 8. Cada avance de cada letra debe mostrarse en una línea nueva");
        System.out.println( " 9. Crear paquete utilitario con la clase ProgressBar");
        System.out.println( " 10. Crear el método: showProgressBar SegundaVocaldeCorreo > debe tener al menos un parámetro en la clase “ ProgressBar");

        String email = "tamara.benavidez@epn.edu.ec";
        ProgressBar.showProgressBar_a(email);
        
        
}
}

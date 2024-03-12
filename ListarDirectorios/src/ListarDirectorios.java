import java.io.File;

public class ListarDirectorios {
    public static void main(String[] args) {
        // ruta especificada por el usuario
        String ruta = "C:\\Program Files";
    
        encontrarDirectorios(ruta);
    }

    public static void encontrarDirectorios(String ruta) {
        File directorio = new File(ruta);
     
        if (!directorio.isDirectory()) {
            System.out.println("la ruta especificada no es un directorio valido.");
            return;
        }
        
        File[] archivos = directorio.listFiles();
        
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    System.out.println("Directorio encontrado: " + archivo.getName());
                    encontrarDirectorios(archivo.getAbsolutePath());
                }
            }
        }
    }
}

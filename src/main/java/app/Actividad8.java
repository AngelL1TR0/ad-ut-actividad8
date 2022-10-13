package app;

import service.FileService;

public class Actividad8 {

    private static final String NOMBRE_FICHERO = "/home/angel/Documentos/prueba.txt";
    private static final String FICHERO_DIRECTORIOS = "/home/angel/Documentos/directorios.txt";
    private static final String FICHERO_FICHEROS = "/home/angel/Documentos/ficheros.txt";


    public static void main(String[] args) {

        FileService fileService = new FileService();
        fileService.splitFilesDirectories(NOMBRE_FICHERO, FICHERO_DIRECTORIOS, FICHERO_FICHEROS);
    }
}

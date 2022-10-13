package service;

import dao.FileDAO;
import dao.FileDAOImpl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    FileDAO fileDAO = new FileDAOImpl();
    public void splitFilesDirectories(String nombreFichero, String ficheroFicheros, String ficheroDirectorios) {
        File file = new File(nombreFichero);
        List<String> directoryList = new ArrayList<>();
        List<String> fileList = new ArrayList<>();
        try {
            List<String> lines = fileDAO.getLinesInFiles(file);
            for (String line:lines) {
                String[] splitLine = line.split(";");
                if (splitLine[1].equals("D")){
                    directoryList.add(line);
                } else {
                    fileList.add(line);
                }
            }
            fileDAO.writeInFile(directoryList, ficheroDirectorios);
            fileDAO.writeInFile(fileList, ficheroFicheros);
        } catch (IOException e) {
            System.err.println(e.getCause());
        }

    }
}
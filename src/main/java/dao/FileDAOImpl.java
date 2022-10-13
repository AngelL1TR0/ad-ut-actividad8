package dao;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileDAOImpl implements FileDAO{

    @Override
    public List<String> getLinesInFiles(File file) throws IOException {
        List<String> lines = new ArrayList<>();
        try(Reader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader)){
            String row;
            while((row = bufferedReader.readLine())!=null){
                lines.add(row);
            }
        }
        return lines;
    }

    @Override
    public void writeInFile(List<String> lista, String fichero) throws IOException {
        try(OutputStreamWriter outputStreamWriter =
                    new OutputStreamWriter(new FileOutputStream(fichero), StandardCharsets.ISO_8859_1);
            PrintWriter printWriter = new PrintWriter(outputStreamWriter)){

            for (String linea : lista) {
                System.out.println(linea);
                printWriter.println(linea);
            }

        }
    }
}

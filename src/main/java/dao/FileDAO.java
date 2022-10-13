package dao;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface FileDAO {
    List<String> getLinesInFiles(File file) throws IOException;

    void writeInFile(List<String> lista, String fichero) throws IOException;
}

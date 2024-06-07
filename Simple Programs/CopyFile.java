
import java.io.File;
import java.nio.file.Files;

public class CopyFile {
    public static void main(String[] args) throws Exception {
        File f = new File("CopyFile.java");
        File newFile = new File("copy1.txt");
        Files.copy(f.toPath(), newFile.toPath());
    }
}

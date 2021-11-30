package directoryReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabian
 */
public class DirectoryReader {

    private static final String fileExtension = ".txt";

    public static List<File> listFilesInDirectory(final File folder) {
        List<File> files = new ArrayList();
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                files.addAll(listFilesInDirectory(fileEntry));
            } else {
                if (fileEntry.getName().contains(fileExtension)) {
                    files.add(fileEntry);
                }
            }
        }
        return files;
    }
}

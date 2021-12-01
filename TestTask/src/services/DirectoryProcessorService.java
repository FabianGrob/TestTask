package services;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import domainLogic.PhoneNumber;
import directoryReader.DirectoryReader;
import java.util.Collections;

/**
 *
 * @author Fabian
 */
public class DirectoryProcessorService {

    private List<String> processedNumbers;
    private static DirectoryProcessorService singleton = null;

    private DirectoryProcessorService() {
        this.processedNumbers = new ArrayList();
    }

    public List<String> getProcessedNumbers() {
        return this.processedNumbers;
    }

    public static DirectoryProcessorService getDirectoryProcessorService() {
        if (singleton == null) {
            singleton = new DirectoryProcessorService();
        }
        return singleton;
    }

    public List<String> processDirectoryFiles(String directoryPath) {
        try {
            final File directory = new File(directoryPath);
            List<File> filesToProcess = DirectoryReader.listFilesInDirectory(directory);
            for (final File file : filesToProcess) {
                processFile(file);
            }

        } catch (NullPointerException e) {
            System.out.println("Folder does not exist.");
        }
        Collections.sort(processedNumbers);
        return this.processedNumbers;
    }

    private void processFile(File file) {
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String onlyNumbers = line.replaceAll("[^0-9]", "");
                if (onlyNumbers.length() == 11 || onlyNumbers.length() == 10 || onlyNumbers.length() == 8 || onlyNumbers.length() == 7) {
                    String number = new PhoneNumber(onlyNumbers).toString();

                    if (!this.processedNumbers.contains(number)) {
                        this.processedNumbers.add(number);
                    }
                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}

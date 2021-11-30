package testtask;

import java.io.File;
import java.util.List;
import services.DirectoryProcessorService;

/**
 *
 * @author Fabian
 */
public class TestTask {

    /**
     * @param args the command line arguments
     */
    private static final String path = System.getProperty("user.dir") + "/files";

    private static void printSuggestions() {
        System.out.println("\n");
        System.out.println("Hello! this are the available functionalities:\n");

        System.out.println("Process txt files:\n");
        System.out.println("The system will process files inside the given directory (including nested directories) and print its content: +A (AAA) AAA-AAAA \n");
        System.out.println("To run it you should excecute the following command:");
        System.out.println("testTask processFiles <directory_path>");

    }

    public static void main(String[] args) {

        if (args.length == 2) {
            String command = args[0];
            if (command.equals("processFiles")) {
                String directory = args[1];
                System.out.println(directory);
                DirectoryProcessorService service = DirectoryProcessorService.getDirectoryProcessorService();
                List<String> numbers = service.processDirectoryFiles(directory);
                for (final String number : numbers) {
                    System.out.println(number);
                }
            } else {
                System.out.println("Invalid command");
            }
        } else {
            System.out.println("Invalid command");
        }
        printSuggestions();

    }

}

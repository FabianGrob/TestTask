/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import org.junit.Test;
import services.DirectoryProcessorService;
import domainLogic.PhoneNumber;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Fabian
 */
public class TestDirectoryProcessorService {

    private static String directoryPath = System.getProperty("user.dir") + "/testFiles";

    public TestDirectoryProcessorService() {
    }

    @Test
    public void testListFilesInDirectory1() {
        System.out.println("listFilesInDirectory");
        DirectoryProcessorService service = DirectoryProcessorService.getDirectoryProcessorService();
        List<String> numbers = service.processDirectoryFiles(directoryPath);
        PhoneNumber number = new PhoneNumber("1234657");
        boolean expResult = true;
        boolean result = numbers.contains(number.toString());
        assertEquals(expResult, result);
    }

    @Test
    public void testListFilesInDirectory2() {
        System.out.println("listFilesInDirectory");
        DirectoryProcessorService service = DirectoryProcessorService.getDirectoryProcessorService();
        List<String> numbers = service.processDirectoryFiles(directoryPath);
        PhoneNumber number = new PhoneNumber("0000000");
        boolean expResult = true;
        boolean result = !numbers.contains(number.toString());
        assertEquals(expResult, result);
    }

}

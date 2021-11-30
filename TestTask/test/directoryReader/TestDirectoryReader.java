/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directoryReader;

import directoryReader.DirectoryReader;
import java.io.File;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Fabian
 */
public class TestDirectoryReader {

    private static String directoryPath = System.getProperty("user.dir") + "/testFiles";

    public TestDirectoryReader() {
    }

    /**
     * Test of toString method, of class PhoneNumber.
     */
    @Test
    public void testListFilesInDirectory() {
        System.out.println("toString");
        File directory = new File(directoryPath);
        List<File> txtFiles = DirectoryReader.listFilesInDirectory(directory);
        boolean expResult = true;
        boolean result = txtFiles.toArray().length > 0;
        assertEquals(expResult, result);
    }
}
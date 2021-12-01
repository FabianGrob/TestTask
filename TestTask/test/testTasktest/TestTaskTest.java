/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testTasktest;

import testtask.TestTask;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import services.DirectoryProcessorService;

/**
 *
 * @author Fabian
 */
public class TestTaskTest {

    private static final String directoryPath = System.getProperty("user.dir") + "/testFiles";
    private static final String command = "processFiles";

    public TestTaskTest() {
    }

    @Test
    public void testExcecuteCommand() {
        System.out.println("excecuteCommand2");
        TestTask.excecuteCommand("", "");
        DirectoryProcessorService service = DirectoryProcessorService.getDirectoryProcessorService();
        boolean expResult = true;
        boolean result = service.getProcessedNumbers().isEmpty();
        assertEquals(expResult, result);
    }

    @Test
    public void testExcecuteCommand2() {
        System.out.println("excecuteCommand1");
        TestTask.excecuteCommand(command, directoryPath);
        DirectoryProcessorService service = DirectoryProcessorService.getDirectoryProcessorService();
        boolean expResult = true;
        boolean result = service.getProcessedNumbers().size() > 0;
        assertEquals(expResult, result);
    }
}

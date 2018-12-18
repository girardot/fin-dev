package jgt;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.FileInputStream;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class InOutTest extends AbstractTest {

    @Test
    @Parameters({
            "src/test/resources/jgt/input1.txt,src/test/resources/jgt/output1.txt",
            "src/test/resources/jgt/input1.txt,src/test/resources/jgt/output1.txt"})
    public void should_copy_input_into_output(String inputFileName, String outputFileName) throws Exception {
        // Given
        System.setIn(new FileInputStream(inputFileName));
        Processor processor = new Processor();

        // When
        processor.process();

        //Then
        assertThat(outContent.toString().trim()).isEqualTo(readOutputFile(outputFileName));
    }

}

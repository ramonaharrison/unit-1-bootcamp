import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.*;

public class Unit0Tests {

    @Test
    public void testSorting() throws Exception {
        Boolean response= Methods.isMultiple(10, 2);
        assertTrue(response);
        //FAILS
        //assertFalse(response);
    }

}

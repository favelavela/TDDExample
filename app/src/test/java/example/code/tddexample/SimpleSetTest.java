package example.code.tddexample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleSetTest {

    private SimpleSet simpleSet;
    
    @Before
    public void setUp() {
        simpleSet = new SimpleSet();
    }

    //@Test
   // public void simpleSet_ifSimpleSetIsEmpty_returnTrue() {
     //   assertTrue(simpleSet.isEmpty());
   // }

    @Test
    public void simpleSet_ifSimpleSetIsNotEmpty_returnFalse() {
        simpleSet.addElement(6);

        assertFalse(simpleSet.isEmpty());
    }

    @Test
    public void simpleSet_ifSimpleSetIsNotEmpty_returnCount() {
        simpleSet.addElement(1);
        simpleSet.addElement(2);

        assertEquals(2, simpleSet.elementCount());
    }

    @Test
    public void simpleSet_ifSimpleSetContainsElement_returnTrue() {
        simpleSet.addElement(1);
        simpleSet.addElement(2);

        assertTrue(simpleSet.contains(1));
        assertTrue(simpleSet.contains(2));
    }

    @Test
    public void simpleSet_ifSimpleSetDoesNotContainElement_returnFalse() {
        assertFalse(simpleSet.contains(1));
    }

    @Test
    public void simpleSet_ifElementRemoved_setDoesNotContainElement() {
        simpleSet.addElement(1);

        assertTrue(simpleSet.contains(1));

        simpleSet.removeElement(1);

        assertFalse(simpleSet.contains(1));
    }

    @Test
    public void simpleSet_ifElementRemoved_returnNewCount() {
        simpleSet.addElement(1);

        assertTrue(simpleSet.contains(1));
        assertEquals(1, simpleSet.elementCount());

        simpleSet.removeElement(1);

        assertFalse(simpleSet.contains(1));
        assertEquals(0, simpleSet.elementCount());
    }

    @Test
    public void simpleSet_ifDuplicatedElementAdded_returnFalse() {
        simpleSet.addElement(1);

        assertFalse(simpleSet.addElement(1));
    }


}
package single_linked_list;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * User: Khiem
 * Date: 7/30/13
 * Time: 1:36 PM
 */
public class TestSingleLinkedList {
    @Test
    public void testCreateEmptySingleLinkedList(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        assertEquals(0, SingleLinkedList.size());
        assertTrue(singleLinkedList.isEmpty());
    }

}


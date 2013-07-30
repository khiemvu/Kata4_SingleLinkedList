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
    private SingleLinkedList singleLinkedList = new SingleLinkedList();
    @Test
    public void testCreateEmptySingleLinkedList(){
        assertEquals(0, singleLinkedList.size());
        assertTrue(singleLinkedList.isEmpty());
    }
    @Test
    public void testInsertAObjectIntoEmptySingleLinkedList(){
        singleLinkedList.append("Test");
        assertEquals(1, singleLinkedList.size());
        assertEquals("Test", singleLinkedList.last());
    }
    @Test
    public void testInsertAObjectIntoAfterNodeNInList(){
        for(int i = 0; i < 5; i++)
            singleLinkedList.append("Test"+i);
        assertEquals(5,singleLinkedList.size());
        singleLinkedList.insertAfter(4,"Check");
        assertEquals(6,singleLinkedList.size());
    }
}


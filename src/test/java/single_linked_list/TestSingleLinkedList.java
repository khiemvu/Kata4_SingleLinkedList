package single_linked_list;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * User: Khiem
 * Date: 7/30/13
 * Time: 1:36 PM
 */
public class TestSingleLinkedList {
    private SingleLinkedList singleLinkedList = new SingleLinkedList();
    private void initData() {
        for(int i = 0; i < 5; i++)
            singleLinkedList.append("Test"+i);
    }
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
        initData();
        assertEquals(5,singleLinkedList.size());
        singleLinkedList.insertAfter(4,"Check");
        assertEquals(6,singleLinkedList.size());
    }
    @Rule public ExpectedException ex = ExpectedException.none();
    @Test
    public void testInsertAObjectIntoListWithLocateGreaterSizeOfList(){
        initData();
        assertEquals(5,singleLinkedList.size());
        ex.expect(RuntimeException.class);
        ex.expectMessage("Out of size linked list");
        singleLinkedList.insertAfter(6,"haka");
    }
    @Test
    public void testReturnElementLastOfSingleList(){
        initData();
        assertEquals(5,singleLinkedList.size());
        assertEquals("Test4", singleLinkedList.last());
    }

    @Test
    public void testReturnElementFirstOfSingleList(){
        initData();
        assertEquals(5,singleLinkedList.size());
        assertEquals("Test0",singleLinkedList.first());
    }
}


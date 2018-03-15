import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class BubbleSortTest {
    private BubbleSort bubbleSort;

    @Before
    public void setUp() {
        bubbleSort = new BubbleSort();
    }


    @Test
    public void bubbleSort() {
        int[] data = {15,3,4,20,55,16,7,44,33,65,96};
        int[] expected = {3,4,7,15,16,20,33,44,55,65,96};
        bubbleSort.sort(data);
        Assert.assertArrayEquals(expected, data);
    }

}
import com.partitionImplementation.Partition;
import com.partitionImplementation.exception.NullSizeException;
import com.partitionImplementation.exception.OutOfRangeException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Mohamed ouokki on 9/15/22
 * @project positive-thinking
 */
public class TestPartition {
    List<Integer> numbers;

    @Before
    public void setUp() throws Exception {
        numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    }

    @After
    public void setDown() throws Exception {
        numbers = null;
    }


    @Test
    public void testOfOneElement() {
        assertTrue(Partition.partition(numbers, 1).size() == 6);
    }

    @Test
    public void testOfTwoElements() {
        assertTrue(Partition.partition(numbers, 2).size() == 3);
    }

    @Test
    public void testOfThreeElements() {
        assertTrue(Partition.partition(numbers, 3).size() == 2);
    }

    @Test
    public void testOfFourElements() {
        assertTrue(Partition.partition(numbers, 4).size() == 2);
    }

    @Test
    public void testOfFiveElements() {
        assertTrue(Partition.partition(numbers, 5).size() == 2);
    }

    @Test
    public void testOfSixElements() {
        assertTrue(Partition.partition(numbers, 6).size() == 1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testOfIndexOutOfRangeException()  {
        Partition<Integer> result= Partition.partition(numbers, 5);
        result.get(7);
    }


    @Test(expected = NullSizeException.class)
    public void testOfSizeEqualTo0(){
        Partition<Integer> result= Partition.partition(numbers, 0);
        result.get(1);
    }

    @Test(expected = NullPointerException.class)
    public void testOfNullList() {
        Partition<Integer> result= Partition.partition(null, 5);
        result.get(1);

    }



}
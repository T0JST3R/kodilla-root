import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;



public class ExterminateTest {
    @Before
    public void before(){
        System.out.println(":)");
    }
    @After
    public void afterr(){
        System.out.println(":)))");
    }

    @Test
    public void emptyListTest() {

        //Given
        List lista = new ArrayList();
        List list;
        OddNumbersExterminator exterminate = new OddNumbersExterminator();

        // When

        list = exterminate.exterminator(lista);

        //Then
        assertEquals(0 , list.size() , 0);

    }

    @Test
    public void  ListTest(){
        // Given
        List<Integer> list = Arrays.asList(2,3,4,23,2,1,2,3);
        OddNumbersExterminator exterminate = new OddNumbersExterminator();
        //Then

        List<Integer> result = exterminate.exterminator(list);

        assertEquals(4 , result.size() , 0);

    }

}

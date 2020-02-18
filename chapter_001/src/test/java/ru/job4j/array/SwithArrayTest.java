package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwithArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwithArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }
    @Test
    public void whenSwapSourceDest(){
        int[] input={1, 2, 3, 4, 5, 6};
        int[] expect={1, 2, 6, 4, 5, 3};
        int[] rsl=  SwithArray.swap(input,2 , 5);
        assertThat(rsl, is(expect));
    }
    @Test
    public void whenSwapSourceMoreArray() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expect = {1, 2, 3, 4, 5, 6};
        int[] rsl = SwithArray.swap(input, 7, 5);
        assertThat(rsl, is(expect));

    }
    @Test
    public void whenSwapDestMoreArray() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expect = {1, 2, 3, 4, 5, 6};
        int[] rsl = SwithArray.swap(input, 2, 75);
        assertThat(rsl, is(expect));
}
}

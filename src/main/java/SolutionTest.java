package main.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Роман Лотоцький on 29.12.2016.
 */
public class SolutionTest {

    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void solution() throws Exception {
        int[] a = {-1, 3, -4, 5, 1, -6, 2, 1};
        int[] b = {1, 2, 3, -2};
        assertEquals(solution.solution(a), 1);
        assertEquals(solution.solution(b), 1);
    }

    @Test
    public void solutionReturnArray() throws Exception {
        int[] a = {-1, 3, -4, 5, 1, -6, 2, 1};
        int[] b = {1, 2, 3, -2};
        assertEquals(solution.solutionReturnArray(a), 3);
        assertEquals(solution.solutionReturnArray(b), 1);
    }

}
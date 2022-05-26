package pl.dsw45634.solid.c_LSP.no_1;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class RectangleTest extends TestCase {

    @Parameterized.Parameter(0)
    public int width;

    @Parameterized.Parameter(1)
    public int height;

    @Parameterized.Parameter(2)
    public int modified;

    @Parameterized.Parameters(name = " {index} - width: {0}, height: {1}, changed: {3} ")
    public static List data() {
        return Arrays.asList(new Object[][] {
                {1, 1, 9}, {1, 2, 8}, {1, 3, 7}, {1, 4, 6}, {1, 5, 5}, {1, 6, 4}, {1, 7, 3}, {1, 8, 2}, {1, 9, 1},
                {2, 1, 9}, {2, 2, 8}, {2, 3, 7}, {2, 4, 6}, {2, 5, 5}, {2, 6, 4}, {2, 7, 3}, {2, 8, 2}, {2, 9, 1},
                {3, 1, 9}, {3, 2, 8}, {3, 3, 7}, {3, 4, 6}, {3, 5, 5}, {3, 6, 4}, {3, 7, 3}, {3, 8, 2}, {3, 9, 1},
                {4, 1, 9}, {4, 2, 8}, {4, 3, 7}, {4, 4, 6}, {4, 5, 5}, {4, 6, 4}, {4, 7, 3}, {4, 8, 2}, {4, 9, 1},
                {5, 1, 9}, {5, 2, 8}, {5, 3, 7}, {5, 4, 6}, {5, 5, 5}, {5, 6, 4}, {5, 7, 3}, {5, 8, 2}, {5, 9, 1},
                {6, 1, 9}, {6, 2, 8}, {6, 3, 7}, {6, 4, 6}, {6, 5, 5}, {6, 6, 4}, {6, 7, 3}, {6, 8, 2}, {6, 9, 1},
                {7, 1, 9}, {7, 2, 8}, {7, 3, 7}, {7, 4, 6}, {7, 5, 5}, {7, 6, 4}, {7, 7, 3}, {7, 8, 2}, {7, 9, 1},
                {8, 1, 9}, {8, 2, 8}, {8, 3, 7}, {8, 4, 6}, {8, 5, 5}, {8, 6, 4}, {8, 7, 3}, {8, 8, 2}, {8, 9, 1},
                {9, 1, 9}, {9, 2, 8}, {9, 3, 7}, {9, 4, 6}, {9, 5, 5}, {9, 6, 4}, {9, 7, 3}, {9, 8, 2}, {9, 9, 1}
        });
    }

    @Test
    public void shouldChangeOnlyWidth() {
        // given
        Rectangle rectangle = new Rectangle(width, height);
        // when
        rectangle.setWidth(modified);
        // then
        Assert.assertEquals(modified, rectangle.getWidth());
        Assert.assertEquals(height, rectangle.getHeight());
    }

    @Test
    public void shouldChangeOnlyHeight() {
        // given
        Rectangle rectangle = new Rectangle(width, height);
        // when
        rectangle.setHeight(modified);
        // then
        Assert.assertEquals(modified, rectangle.getHeight());
        Assert.assertEquals(width, rectangle.getWidth());
    }

}
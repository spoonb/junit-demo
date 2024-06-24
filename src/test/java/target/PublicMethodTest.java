package target;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

public class PublicMethodTest {

    @Mock
    PublicMethod target;

    /**
     * mock对象注入初始化：方式一
     */
    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void hasReturn() {
        when(target.hasReturn()).thenReturn("PublicMethodTest -> hasReturn");
        String s = target.hasReturn();
        Assert.assertEquals(s, "PublicMethodTest -> hasReturn");
    }

    @Test
    public void hasNotReturn() {
        doNothing().when(target).hasNotReturn();
    }
}

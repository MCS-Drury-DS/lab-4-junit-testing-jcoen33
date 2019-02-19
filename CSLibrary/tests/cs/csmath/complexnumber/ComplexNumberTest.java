package cs.csmath.complexnumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexNumberTest {

    static final double DELTA = 0.000001;

    @Test
    public void getRealPart()
    {
        ComplexNumber cn = new ComplexNumber(1.0,1.0);
        double realPart = cn.getRealPart();
        assertEquals(1.0, realPart, DELTA);
    }

    @Test
    public void setRealPart()
    {
        ComplexNumber cn = new ComplexNumber(1.0,1.0);
        cn.setRealPart(2.0);
        assertEquals(2.0, cn.getRealPart(), DELTA);
    }

    //@Override
    //public String toString() ( return getRealPart() + "+" + getImagPart() + "i"; )

    @Test
    public void getImagPart()
    {
        ComplexNumber cn = new ComplexNumber(1.0, 1.0);
        double imagPart = cn.getImagPart();
        assertEquals(1.0, imagPart, 0.000001);
    }

    @Test
    public void setImagPart()
    {
        ComplexNumber cn = new ComplexNumber(1.0,1.0);
        cn.setImagPart(2.0);
        assertEquals(2.0, cn.getImagPart(), DELTA);
    }

    //test 4.5+3.0i + 6.0+3.0i = 10.5+7i
    @Test
    public void add()
    {
        ComplexNumber cn1 = new ComplexNumber(4.5, 3.0);
        ComplexNumber cn2 = new ComplexNumber(6.0, 4.0);
        cn1.add(cn2);
        assertEquals(10.5, cn1.getRealPart(), DELTA);
        assertEquals(7.0, cn1.getImagPart(), DELTA);
    }

    // test
    @Test
    public void sub()
    {
        ComplexNumber cn1 = new ComplexNumber(4.5,3.0);
        ComplexNumber cn2 = new ComplexNumber(6.0, 4.0);
        cn1.sub(cn2);
        assertEquals(-1.5, cn1.getRealPart(), DELTA);
        assertEquals(-1, cn1.getImagPart(), DELTA);
    }

    @Test
    public void mult()
    {
        ComplexNumber cn1 = new ComplexNumber(2.5,3.0);
        ComplexNumber cn2 = new ComplexNumber(4.0, 1.25);
        cn1.mult(cn2);
        assertEquals(6.25, cn1.getRealPart(), DELTA);
        assertEquals(15.125, cn1.getImagPart(), DELTA);
    }

    @Test
    public void div()
    {
        ComplexNumber cn1 = new ComplexNumber(4.5,3.0);
        ComplexNumber cn2 = new ComplexNumber(6.0, 4.0);
        cn1.div(cn2);
        assertEquals(0.75, cn1.getRealPart(), DELTA);
        assertEquals(0.0, cn1.getImagPart(), DELTA);
    }

    @Test
    public void divideByZero()
    {
        ComplexNumber cn = new ComplexNumber(4.1,6.7);
        ComplexNumber cn1 = new ComplexNumber(0.0,0.0);

        try
        {
            cn.div(cn1);
            fail();
        }

        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }

    }

    @Test
    public void conj()
    {
        ComplexNumber cn = new ComplexNumber(2.5,3.0);
        cn.conj();
        assertEquals(2.5, cn.getRealPart(), DELTA);
        assertEquals(-3.0, cn.getImagPart(), DELTA);
    }

    @Test
    public void abs()
    {
        ComplexNumber cn = new ComplexNumber(2.25,2.25);
        double test = cn.abs();
    }

    //Tests 1.0+1.0i + 2.0+3.0i = 3.0+4.0i
    @Test
    public void add1()
    {
        ComplexNumber cn = new ComplexNumber(1.0,1.0);
        ComplexNumber cn1 = new ComplexNumber(2.0,3.0);
        ComplexNumber result = ComplexNumber.add(cn,cn1);

        assertEquals(3.0, result.getRealPart(),DELTA);
        assertEquals(4.0, result.getImagPart(),DELTA);
    }

    //Tests 5.0+ 4.0i - 1.0+1.0i= 4.0+3.0i
    @Test
    public void sub1()
    {
        ComplexNumber cn = new ComplexNumber(5.0,4.0);
        ComplexNumber cn1 = new ComplexNumber(1.0,1.0);
        ComplexNumber result = ComplexNumber.sub(cn,cn1);

        assertEquals(4.0, result.getRealPart(),DELTA);
        assertEquals(3.0, result.getImagPart(),DELTA);
    }

    //Tests (2.5+3.5)(6.1+3.9i) = 1.6+31.1i
    @Test
    public void mult1()
    {
        ComplexNumber cn = new ComplexNumber(2.5,3.5);
        ComplexNumber cn1 = new ComplexNumber(6.1,3.9);
        ComplexNumber result = ComplexNumber.mult(cn,cn1);

        assertEquals(1.6, result.getRealPart(),DELTA);
        assertEquals(31.1, result.getImagPart(),DELTA);
    }

    //Tests (3.0+5.0i)(4.0+2.0i) = 1.1+0.7i
    @Test
    public void div1()
    {
        ComplexNumber cn = new ComplexNumber(3.0,5.0);
        ComplexNumber cn1 = new ComplexNumber(4.0,2.0);
        ComplexNumber result = ComplexNumber.div(cn,cn1);

        assertEquals(1.1, result.getRealPart(),DELTA);
        assertEquals(0.7, result.getImagPart(),DELTA);
    }

    //@Test
    //public void testToString()
    //{
        //ComplexNumber cn = new ComplexNumber(1.0,1.0);
        //String s = cn.toString();
       //assertEquals("0.0+0.0i", s);
    //}
}
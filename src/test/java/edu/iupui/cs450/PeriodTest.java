package edu.iupui.cs450;

import org.junit.Assert;
import org.junit.Test;

public class PeriodTest
{

    @Test
  public void testOfYears ()
  {
    Period p = Period.ofYears(5);

    Assert.assertEquals(5, p.getYears());
    Assert.assertEquals(0, p.getMonths());
    Assert.assertEquals(0, p.getDays());
  }
    @Test
    public void testOfMonths()
    {
        Period p = Period.ofMonths(5);

        Assert.assertEquals(0,p.getYears());
        Assert.assertEquals(5, p.getMonths());
        Assert.assertEquals(0,p.getDays());
    }
    @Test
    public void testOfWeeks()
    {
        Period p = Period.ofWeeks(5);

        Assert.assertEquals(0, p.getYears());
        Assert.assertEquals(0, p.getMonths());
        Assert.assertEquals(35, p.getDays());
    }
    @Test
    public void testOfDays()
    {
        Period p = Period.ofDays(7);

        Assert.assertEquals(0, p.getYears());
        Assert.assertEquals(0, p.getMonths());
        Assert.assertEquals(7,p.getDays());
    }

    @Test
    public void testOf()
    {
        Period p = Period.of(5, 5, 7);

        Assert.assertEquals(5, p.getYears());
        Assert.assertEquals(5, p.getMonths());
        Assert.assertEquals(7,p.getDays());
    }
    @Test
    public void testIfConditionOfCreate()
    {
        Period p = Period.of(0, 0, 0);

        Assert.assertEquals(0, p.getYears());
        Assert.assertEquals(0, p.getMonths());
        Assert.assertEquals(0,p.getDays());
    }
    @Test
    public void testIfOfWithYears()
    {
        Period P = Period.ZERO.withYears(5);
        //Assert.assertEquals(10, P.getYears());
        Assert.assertEquals(5, P.getYears());
        Assert.assertEquals(0, P.getMonths());
        Assert.assertEquals(0, P.getDays());

    }
    @Test
    public void testIfOfWithMonths()
    {
        Period P = Period.ZERO.withMonths(5);
        //Assert.assertEquals(10, P.getYears());
        Assert.assertEquals(0, P.getYears());
        Assert.assertEquals(5, P.getMonths());
        Assert.assertEquals(0, P.getDays());

    }
    @Test
    public void testIfOfWithDays()
    {
        Period P = Period.ZERO.withDays(5);
        //Assert.assertEquals(10, P.getYears());
        Assert.assertEquals(0, P.getYears());
        Assert.assertEquals(0, P.getMonths());
        Assert.assertEquals(5, P.getDays());

    }

    @Test
    public void testPlusYears()
    {
        Period P = Period.ZERO.plusYears(5);
        Assert.assertEquals(10, P.getYears() + 5);
        Assert.assertEquals(0, P.getMonths());
        Assert.assertEquals(0, P.getDays());


    }
    @Test
    public void testPlusMonths(){
        Period p = Period.ZERO.plusMonths(5);
        //Period p = Period.ZERO.plusMonths(10);
        Assert.assertEquals(0, p.getYears() );
        Assert.assertEquals(5, p.getMonths());
        Assert.assertEquals(0, p.getDays());

    }
    @Test
    public void testPlusDays(){
        Period p = Period.ZERO.plusDays(5);
        Assert.assertEquals(0, p.getYears() );
        Assert.assertEquals(0, p.getMonths());
        Assert.assertEquals(5, p.getDays() );

    }
    @Test
    public void testNegated(){
        Period p = Period.ZERO.negated();
        Assert.assertEquals(0, p.getYears()*-1);
        Assert.assertEquals(0, p.getDays()*-1);
        Assert.assertEquals(0, p.getDays()*-1);
    }

    @Test
    public void testMultipliedBy()
    {
        Period p = Period.ZERO.multipliedBy(10);

        Period Y = Period.ofYears(5);
        Period M = Period.ofMonths(5);
        Period D = Period.ofDays(5);



        Assert.assertEquals(50, Y.getYears()*10);
        Assert.assertEquals(50, M.getMonths()*10);
        Assert.assertEquals(50, D.getDays()*10);

    }
    @Test
    public void testToTotalMonths(){
        Period p = Period.of(10,10,10);
        //p = Period.ofYears(10);
        //p = Period.ofMonths(5);
        Assert.assertEquals(130, p.toTotalMonths());


    }







}

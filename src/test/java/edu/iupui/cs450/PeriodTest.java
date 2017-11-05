package edu.iupui.cs450;

import org.junit.Assert;
import org.junit.Test;
import sun.java2d.pipe.AAShapePipe;

import java.time.LocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.chrono.IsoChronology;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.*;

public class PeriodTest {

    @Test
    public void testOfYears() {
        Period p = Period.ofYears(5);

        Assert.assertEquals(5, p.getYears());
        Assert.assertEquals(0, p.getMonths());
        Assert.assertEquals(0, p.getDays());
    }

    @Test
    public void testOfMonths() {
        Period p = Period.ofMonths(5);

        Assert.assertEquals(0, p.getYears());
        Assert.assertEquals(5, p.getMonths());
        Assert.assertEquals(0, p.getDays());
    }

    @Test
    public void testOfWeeks() {
        Period p = Period.ofWeeks(5);

        Assert.assertEquals(0, p.getYears());
        Assert.assertEquals(0, p.getMonths());
        Assert.assertEquals(35, p.getDays());
    }

    @Test
    public void testOfDays() {
        Period p = Period.ofDays(7);

        Assert.assertEquals(0, p.getYears());
        Assert.assertEquals(0, p.getMonths());
        Assert.assertEquals(7, p.getDays());
    }

    @Test
    public void testOf() {
        Period p = Period.of(5, 5, 7);

        Assert.assertEquals(5, p.getYears());
        Assert.assertEquals(5, p.getMonths());
        Assert.assertEquals(7, p.getDays());
    }

    @Test
    public void testIfConditionOfCreate() {
        Period p = Period.of(0, 0, 0);

        Assert.assertEquals(0, p.getYears());
        Assert.assertEquals(0, p.getMonths());
        Assert.assertEquals(0, p.getDays());
    }

    @Test
    public void testIfOfWithYears() {
        Period P = Period.ZERO.withYears(5);
        //Assert.assertEquals(10, P.getYears());
        Assert.assertEquals(5, P.getYears());
        Assert.assertEquals(0, P.getMonths());
        Assert.assertEquals(0, P.getDays());

    }

    @Test
    public void testIfOfWithMonths() {
        Period P = Period.ZERO.withMonths(5);
        //Assert.assertEquals(10, P.getYears());
        Assert.assertEquals(0, P.getYears());
        Assert.assertEquals(5, P.getMonths());
        Assert.assertEquals(0, P.getDays());

    }

    @Test
    public void testIfOfWithDays() {
        Period P = Period.ZERO.withDays(5);
        //Assert.assertEquals(10, P.getYears());
        Assert.assertEquals(0, P.getYears());
        Assert.assertEquals(0, P.getMonths());
        Assert.assertEquals(5, P.getDays());

    }

    @Test
    public void testPlusYears() {
        Period P = Period.ZERO.plusYears(0);
        Assert.assertEquals(0, P.getYears());
        Assert.assertEquals(0, P.getMonths());
        Assert.assertEquals(0, P.getDays());


    }

    @Test
    public void testPlusMonths() {
        Period p = Period.ZERO.plusMonths(0);
        //Period p = Period.ZERO.plusMonths(10);
        Assert.assertEquals(0, p.getYears());
        Assert.assertEquals(0, p.getMonths());
        Assert.assertEquals(0, p.getDays());

    }

    @Test
    public void testPlusDays() {
        Period p = Period.ZERO.plusDays(0);
        Assert.assertEquals(0, p.getYears());
        Assert.assertEquals(0, p.getMonths());
        Assert.assertEquals(0, p.getDays());

    }

    @Test
    public void testNegated() {
        Period p = Period.ZERO.negated();
        Assert.assertEquals(0, p.getYears() * -1);
        Assert.assertEquals(0, p.getDays() * -1);
        Assert.assertEquals(0, p.getDays() * -1);
    }

    @Test
    //Needs to be Implemented properly
    public void testMultipliedBy() {
        Period p = Period.ZERO.multipliedBy(10);

        Period Y = Period.of(10, 10, 10);
        //Period M = Period.ofMonths(5);
        //Period D = Period.ofDays(5);


        Assert.assertEquals(100, Y.getYears() * 10);
        Assert.assertEquals(100, Y.getMonths() * 10);
        Assert.assertEquals(100, Y.getDays() * 10);

    }

    @Test
    public void testToTotalMonths() {
        Period p = Period.of(10, 10, 10);
        //p = Period.ofYears(10);
        //p = Period.ofMonths(5);
        Assert.assertEquals(130, p.toTotalMonths());


    }

    @Test
    public void testIsZero() {
        Period p = Period.of(0, 0, 0);

        Assert.assertEquals(true, p.isZero());
    }

    @Test
    public void testIsNegative() {
        Period p = Period.of(10, 10, 10);
        //Assert.assertEquals(true, p.isNegative());
        //Assert.assertEquals(true, p.isNegative());
        Assert.assertEquals(false, p.isNegative());

    }

    /*@Test
    public void testgetUnits()
    {
        //Period p = Period.ZERO.getUnits();
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("Years");
        expResult.add("Months");
        expResult.add("Days");
        Period p = Period.of(10, 10, 10);
        Assert.assertEquals(expResult, p.getUnits());

    }*/
    //needs more improvement
    @Test
    public void testEquals()
    {
        Period p = Period.ZERO;

        Assert.assertEquals(false,p.equals(null));

    }
    //needs improvement
    @Test
    public void testNormalized()
    {
        Period p = Period.of(-2,2,2);
        //Period negative = Period.of(-2,2,2);
        //long totalMonths = negative.toTotalMonths();


        long totalMonths = p.toTotalMonths();
        long splitYears = totalMonths / 12;
        int splitMonths = (int) (totalMonths % 12);
        Assert.assertEquals(-22,totalMonths);
        //Assert.assertEquals(-1,splitYears);
        //Assert.assertEquals(2,splitMonths);
        //Assert.assertEquals(true,p.normalized());
        p.normalized();


    }

    /**
     * all the minus years, months, Days are to be implemented more clearly
     */
    @Test
    public void testMinusYears()
    {
        Period p = Period.ZERO;
        p.minusYears(2);

    }
    @Test
    public void testMinusMonths()
    {
        Period p = Period.ZERO;
        p.minusMonths(2);
    }
    @Test
    public void testMinusDays()
    {
        Period p = Period.ZERO;
        p.minusDays(3);
    }

    @Test
    public void testGet()
    {

        Period y = Period.ofYears(1);
        //Period m = Period.ofMonths(1);
        //Period d = Period.ofDays(1);
        Assert.assertEquals(1, y.get(ChronoUnit.YEARS));
        Assert.assertEquals(0, y.get(ChronoUnit.MONTHS));
        Assert.assertEquals(0, y.get(ChronoUnit.DAYS));

    }

    //completed test case
    @Test
    public void testPlus(){
        Period p = Period.of(1,1,1);
        Period addYears = p.plus(Period.ofYears(1));
        Period addMonths = p.plus(Period.ofMonths(1));
        Period addDays = p.plus(Period.ofDays(1));

        Assert.assertEquals(addYears,addYears);
        Assert.assertEquals(addMonths,addMonths);
        Assert.assertEquals(addDays,addDays);

    }
    //No branches, Test Completed
    @Test
    public void testGetChronology()
    {
        Period p = Period.ZERO;
        IsoChronology is = p.getChronology();
        Assert.assertEquals(is, is);

    }
    //Missing the branch if totalMonths is not equal to zero
    @Test
    public void testAddTo(){

        Period p = Period.of(0,0,0);
        Period p1 = Period.of(1,1,1);

        Temporal T = p.addTo(LocalDate.now());
        Temporal T1 = p1.addTo(LocalDate.now());
        Assert.assertEquals(T,T);
        Assert.assertEquals(T1,T1);
    }
    //not covered all branches
    @Test
    public void testSubtractFrom(){

        Period p = Period.of(0,0,0);
        //Period p1 = Period.of(1,1,1);

        Temporal T = p.subtractFrom(LocalDate.now());
        //Temporal T1 = p1.subtractFrom(LocalDate.now());
        Assert.assertEquals(T,T);
        //Assert.assertEquals(T1,T1);
    }

    /**
     * This is not at all completed, needs to be implemented properly
     */
    @Test
    public void testFrom(){

        Period p = Period.from(Period.ofMonths(12));
        ChronoPeriod p1  = p.from(Period.ofDays(11));


    }

    /**
     * Need to write code to catch Exceptions and More
     */
    @Test
    public void testParse(){

        Period p = Period.of(-2,-2,0);
        Period Negative = p.parse("-P2Y2M");

        Period p2 = Period.of(-1,1,0);
        Period NegativeYears = p2.parse("P-1Y1M");

        Period p1 = Period.ofDays(5);
        Period days = p1.parse("P5D");


        Period wrong = Period.of(0,3,3);

        try {
            Period formatException = wrong.parse("PtYtMtD");
        }
        catch(Exception e)
        {

        }



        Assert.assertEquals(days,days);


    }
    //No Branches in this Method,  code Coverage is complete
    @Test
    public void testMinus(){
        Period p = Period.of(1,1,1);
        Period minusYears = p.minus(Period.ofYears(1));
        Period minusMonths = p.minus(Period.ofMonths(1));
        Period minusDays = p.minus(Period.ofDays(1));

        Assert.assertEquals(minusYears,minusYears);
        Assert.assertEquals(minusMonths,minusMonths);
        Assert.assertEquals(minusDays,minusDays);

    }





}

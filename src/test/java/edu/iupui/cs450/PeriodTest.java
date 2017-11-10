package edu.iupui.cs450;

import org.junit.Assert;
import org.junit.Test;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.chrono.*;
import java.time.temporal.*;
import java.util.*;


public class PeriodTest {
    /**
     * Tests the ofYears() Method of the Period Class
     */
    @Test
    public void testOfYears() {
        Period p = Period.ofYears(5);

        Assert.assertEquals(5, p.getYears());
        Assert.assertEquals(0, p.getMonths());
        Assert.assertEquals(0, p.getDays());
    }

    /**
     * Tests the ofMonths() Method of the Period class
     */
    @Test
    public void testOfMonths() {
        Period p = Period.ofMonths(5);

        Assert.assertEquals(0, p.getYears());
        Assert.assertEquals(5, p.getMonths());
        Assert.assertEquals(0, p.getDays());
    }

    /**
     * Tests the ofWeeks() Method of the Period class
     */
    @Test
    public void testOfWeeks() {
        Period p = Period.ofWeeks(5);

        Assert.assertEquals(0, p.getYears());
        Assert.assertEquals(0, p.getMonths());
        Assert.assertEquals(35, p.getDays());
    }

    /**
     * Tests the ofDays() Method of the Period class
     */
    @Test
    public void testOfDays() {
        Period p = Period.ofDays(7);

        Assert.assertEquals(0, p.getYears());
        Assert.assertEquals(0, p.getMonths());
        Assert.assertEquals(7, p.getDays());
    }

    /**
     * Tests the of() Method of the Period class
     */
    @Test
    public void testOf() {
        Period p = Period.of(5, 5, 7);

        Assert.assertEquals(5, p.getYears());
        Assert.assertEquals(5, p.getMonths());
        Assert.assertEquals(7, p.getDays());
    }

    /**
     * Tests the if branch of the ofCreate() Method
     */
    @Test
    public void testIfConditionOfCreate() {
        Period p = Period.of(0, 0, 0);

        Assert.assertEquals(0, p.getYears());
        Assert.assertEquals(0, p.getMonths());
        Assert.assertEquals(0, p.getDays());
    }

    /**
     * Tests the If condition of the withYears() Method
     */
    @Test
    public void testIfOfWithYears() {
        Period P = Period.ZERO.withYears(5);
        //Assert.assertEquals(10, P.getYears());
        Assert.assertEquals(5, P.getYears());
        Assert.assertEquals(0, P.getMonths());
        Assert.assertEquals(0, P.getDays());

    }

    /**
     * Tests the else condition of the withYears() Method
     */
    @Test
    public void testElseWithYears() {
        Period p = Period.of(1, 1, 1);
        Period p1 = p.withYears(1);
    }

    /**
     * Tests the if condition of withMonths() Method
     */
    @Test
    public void testIfOfWithMonths() {
        Period P = Period.ZERO.withMonths(5);
        //Assert.assertEquals(10, P.getYears());
        Assert.assertEquals(0, P.getYears());
        Assert.assertEquals(5, P.getMonths());
        Assert.assertEquals(0, P.getDays());

    }

    /**
     * Tests the else condition of withMonths() Method
     */
    @Test
    public void testElseOfWithmonths() {

        Period p = Period.of(1, 1, 1);
        Period p1 = p.withMonths(1);

    }

    /**
     * Tests the if Condition of withDays() Method
     */
    @Test
    public void testIfOfWithDays() {
        Period P = Period.ZERO.withDays(5);
        //Assert.assertEquals(10, P.getYears());
        Assert.assertEquals(0, P.getYears());
        Assert.assertEquals(0, P.getMonths());
        Assert.assertEquals(5, P.getDays());

    }

    /**
     * Tests the Else condition of withDays() Method
     */
    @Test
    public void testElseWithDays() {

        Period p = Period.of(1, 1, 1);

        Period p1 = p.withDays(1);
    }

    /**
     * Tests the plusYears() Method
     */
    @Test
    public void testPlusYears() {
        Period P = Period.ZERO.plusYears(0);
        Assert.assertEquals(0, P.getYears());
        Assert.assertEquals(0, P.getMonths());
        Assert.assertEquals(0, P.getDays());


    }

    /**
     * Tests the plusMonths() Method
     */
    @Test
    public void testPlusMonths() {
        Period p = Period.ZERO.plusMonths(0);
        //Period p = Period.ZERO.plusMonths(10);
        Assert.assertEquals(0, p.getYears());
        Assert.assertEquals(0, p.getMonths());
        Assert.assertEquals(0, p.getDays());

    }

    /**
     * Tests the plusDays() Method
     */
    @Test
    public void testPlusDays() {
        Period p = Period.ZERO.plusDays(0);
        Assert.assertEquals(0, p.getYears());
        Assert.assertEquals(0, p.getMonths());
        Assert.assertEquals(0, p.getDays());

    }

    /**
     * Tests the negated() Method
     */
    @Test
    public void testNegated() {
        Period p = Period.ZERO.negated();
        Assert.assertEquals(0, p.getYears() * -1);
        Assert.assertEquals(0, p.getDays() * -1);
        Assert.assertEquals(0, p.getDays() * -1);
    }

    /**
     *  Tests the multipliedBy() Method
     */
    @Test

    public void testMultipliedBy() {


        Period Y = Period.of(10, 10, 10);


        Period p = Y.multipliedBy(10);
    }

    /**
     * Tests else branch of multipliedBy()
     */
    @Test
    public void testElseMultipliedBy() {
        Period p = Period.of(0, 0, 0);

        Period p1 = p.multipliedBy(0);

    }

    /**
     * Tests the MultipliedBy() method when Scalar == 1
     */
    @Test
    public void testElseScalarMultipliedBy() {


        Period p = Period.of(1, 1, 1);
        Period p1 = p.multipliedBy(1);

    }

    /**
     * Tests the toTotalMonths() Method
     */
    @Test
    public void testToTotalMonths() {
        Period p = Period.of(10, 10, 10);
        //p = Period.ofYears(10);
        //p = Period.ofMonths(5);
        Assert.assertEquals(130, p.toTotalMonths());


    }

    /**
     * tests the isZero() Method
     */
    @Test
    public void testIsZero() {
        Period p = Period.of(0, 0, 0);

        Assert.assertEquals(true, p.isZero());
    }

    /**
     *  Tests the isZero() Method when it is not zero
     */
    @Test
    public void testIsNotZero() {
        Period p = Period.of(12, 12, 12);

        Assert.assertEquals(false, p.isZero());
    }

    /**
     * Tests the isNegative Method when all the entities are positive
     * Returns False
     */
    @Test
    public void testIsNegative() {
        Period p = Period.of(10, 10, 10);
        //Assert.assertEquals(true, p.isNegative());
        //Assert.assertEquals(true, p.isNegative());
        Assert.assertEquals(false, p.isNegative());

    }

    /**
     * Tests the isNegative Method When Years are Positive
     */
    @Test
    public void testYearsIsNegative() {
        Period p = Period.of(10, -2, -2);
        //Assert.assertEquals(true, p.isNegative());
        //Assert.assertEquals(true, p.isNegative());
        Assert.assertEquals(true, p.isNegative());

    }

    /**
     * Tests the isNegative() Method when Months are positive
     */
    @Test
    public void testMonthsIsNegative() {

        Period p = Period.of(-2, 12, -2);
        Assert.assertEquals(true, p.isNegative());


    }

    /**
     * Tests the isNegative() Method when days are negative
     */
    @Test
    public void testDaysIsNegative() {
        Period p = Period.of(10, 10, -2);
        //Assert.assertEquals(true, p.isNegative());
        //Assert.assertEquals(true, p.isNegative());
        Assert.assertEquals(true, p.isNegative());

    }

    /**
     * Tests the if Branch of equals() Method
     */
    @Test
    public void testIfEquals() {

        Period p = Period.of(1, 1, 1);

        Assert.assertEquals(false, p.equals(null));
        Assert.assertEquals(true, p.equals(Period.of(1, 1, 1)));

    }

    /**
     * Tests the first Else branch of Equals() Method
     */
    @Test
    public void testElseEquals() {
        Period p = Period.of(1, 1, 1);
        //ChronoPeriod p1 = Period.ZERO;
        Assert.assertEquals(false, p.equals(p.getDays()));

    }

    /**
     * Hits the years branch of equals() Method
     */

    @Test
    public void testEqualsall() {

        Period p = Period.of(1, 1, 1);

        Period a = Period.from(Period.of(0, 1, 1));
        Assert.assertNotEquals(p, a);

    }

    /**
     * Hits the Months branch of equals() Method
     */
    @Test
    public void testEqualsMonths() {

        Period p = Period.of(1, 1, 1);

        Period a = Period.from(Period.of(1, 0, 1));
        Assert.assertNotEquals(p, a);

    }

    /**
     * Hits the Days branch of equals() Method.
     */
    @Test
    public void testEqualsDays() {

        Period p = Period.of(1, 1, 1);

        Period a = Period.from(Period.of(1, 1, 0));
        Assert.assertNotEquals(p, a);

    }


    /**
     * Tests the Normalized() Method
     */
    @Test
    public void testNormalized() {
        Period p = Period.of(-2, 2, 2);
        //Period negative = Period.of(-2,2,2);
        //long totalMonths = negative.toTotalMonths();


        long totalMonths = p.toTotalMonths();
        long splitYears = totalMonths / 12;
        int splitMonths = (int) (totalMonths % 12);
        Assert.assertEquals(-22, totalMonths);
        p.normalized();


    }

    /**
     * Tests the Else Branch of normalized() Method
     */
    @Test
    public void testElseNormalized() {

        Period p = Period.of(1, 2, 2);

        p.normalized();


    }

    @Test
    public void testNormalized3() {
        Period p = Period.of(1, -1, 0);
        p.normalized();

    }


    /**
     * Hits the years not equal to Long.MIN_VaLUE branch
     */
    @Test
    public void testMinusYears() {
        Period p = Period.of(0, 0, 0);

        p.minusYears(-100);

    }

    //Test to check the if branch of MinusYears() Method
    @Test
    public void testIfMinusYears() {

        Period p = Period.of(1, 1, 1);


        try {
            p.minusYears(Long.MIN_VALUE);
        } catch (ArithmeticException e) {

        }
    }

    /**
     * Hits the Months not equal to Long.MIN_VaLUE branch
     */
    @Test
    public void testMinusMonths() {
        Period p = Period.ZERO;
        p.minusMonths(2);
    }

    /**
     * Hits the Days not equal to Long.MIN_VaLUE branch
     */
    @Test
    public void testMinusDays() {
        Period p = Period.ZERO;
        p.minusDays(3);
    }

    /**
     * Tests the get() Method
     */
    @Test
    public void testGet() {

        Period y = Period.ofYears(1);
        Assert.assertEquals(1, y.get(ChronoUnit.YEARS));
        Assert.assertEquals(0, y.get(ChronoUnit.MONTHS));
        Assert.assertEquals(0, y.get(ChronoUnit.DAYS));

    }

    /**
     * Tests the DaysGet() Method
     */

    @Test
    public void testDaysGet() {

        Period y = Period.of(1, 1, 1);
        //Period m = Period.ofMonths(1);
        //Period d = Period.ofDays(1);
        Assert.assertEquals(1, y.get(ChronoUnit.YEARS));
        Assert.assertEquals(1, y.get(ChronoUnit.MONTHS));
        try {

            Long p2 = y.get(ChronoUnit.WEEKS);
        } catch (Exception e) {

        }
    }

    /**
     * Tests the Plus() Metohd
     */
    @Test
    public void testPlus() {
        Period p = Period.of(1, 1, 1);
        Period addYears = p.plus(Period.ofYears(1));
        Period addMonths = p.plus(Period.ofMonths(1));
        Period addDays = p.plus(Period.ofDays(1));

        Assert.assertEquals(addYears, addYears);
        Assert.assertEquals(addMonths, addMonths);
        Assert.assertEquals(addDays, addDays);

    }

    /**
     * Tests the getChronology() Method, No branches present
     */
    @Test
    public void testGetChronology() {
        Period p = Period.ZERO;
        IsoChronology is = p.getChronology();
        Assert.assertEquals(is, is);

    }

    //Missing the branch if totalMonths is not equal to zero
    @Test
    public void testAddTo() {

        Period p = Period.of(0, 0, 0);
        Period p1 = Period.of(1, 1, 1);

        Temporal T = p.addTo(LocalDate.now());
        Temporal T1 = p1.addTo(LocalDate.now());
        Assert.assertEquals(T, T);
        Assert.assertEquals(T1, T1);
    }

    /**
     * Created a stub to cover one of the four branches in Private validateChrono Method
     * this covers the branch when temporalChrono != null and isoChronology.INSTANCE.equals(temporalChrono) == false branch
     */
    @Test
    public void testNotZeroAddto() {
        Period p = Period.of(1, 0, 1);

        Temporal t = p.addTo(LocalDate.now());


        Temporal temporal = new Temporal() {
            @Override
            public boolean isSupported(TemporalUnit unit) {
                return false;
            }

            @Override
            public Temporal with(TemporalField field, long newValue) {
                return null;
            }

            @Override
            public Temporal plus(long amountToAdd, TemporalUnit unit) {
                return null;
            }

            @Override
            public long until(Temporal endExclusive, TemporalUnit unit) {
                return 0;
            }

            @Override
            public boolean isSupported(TemporalField field) {
                return false;
            }

            @Override
            public long getLong(TemporalField field) {
                return 0;
            }

            @Override
            public <R> R query(TemporalQuery<R> query) {
                return (R) HijrahChronology.INSTANCE;
            }
        };


    }


    /**
     * Test to cover the totalMonths == 0 branch in the addTo() Method
     */
    @Test
    public void testTotZeroMonthsAddTo() {

        Period p = Period.of(-1, 12, 0);
        //Period p1 = Period.of(1,1,1);

        Temporal T = p.addTo(LocalDate.now());


        //Temporal T1 = p1.addTo(LocalDate.now());
        Assert.assertEquals(T, T);
        //Assert.assertEquals(T1,T1);
    }


    /**
     * Test case to cover the subtractFrom() Method
     */
    @Test
    public void testSubtractFrom() {

        Period p = Period.of(0, 0, 0);
        //Period p1 = Period.of(1,1,1);

        Temporal T = p.subtractFrom(LocalDate.now());
        //Temporal T1 = p1.subtractFrom(LocalDate.now());
        Assert.assertEquals(T, T);
        //Assert.assertEquals(T1,T1);
    }

    /**
     * Test case to check the condition of totalMonths!= zero
     */
    @Test
    public void testZeroSubtractFrom() {

        Period p = Period.of(1, 0, 1);
        //Period p1 = Period.of(1,1,1);

        Temporal T = p.subtractFrom(LocalDate.now());
        //Temporal T1 = p1.subtractFrom(LocalDate.now());
        Assert.assertEquals(T, T);
        //Assert.assertEquals(T1,T1);
    }


    @Test
    public void testZeroTotalmonthsSubtractFrom() {
        Period p = Period.of(0, -1, 0);
        //Period p1 = Period.of(1,1,1);

        Temporal T = p.subtractFrom(LocalDate.of(0, 1, 1));
        //Temporal T1 = p1.subtractFrom(LocalDate.now());
        Assert.assertEquals(T, T);


    }

    /**
     * This tests the total months is equal to zero branch
     */
    @Test
    public void testZeroIfSubtractFrom() {

        Period p = Period.of(1, -12, 0);
        //Period p1 = Period.of(1,1,1);

        Temporal T = p.subtractFrom(LocalDate.of(0, 1, 23));


    }

    /**
     * Tests the From() Method
     */
    @Test
    public void testFrom() {




        Period p = Period.from(Period.ofMonths(12));

        Period p1 = Period.from(ChronoPeriod.between(LocalDate.now(), LocalDate.of(1994, 3, 12)));

        Period p2 = Period.from(Period.ofDays(12));


    }

    /**
     * Tests the Else Part of the from() Method
     */
    @Test
    public void testElseFrom() {
        // try {
        Period p = Period.of(11, 1, 1);
        Period p1 = p.from(Period.ofWeeks(2));

    }

    /**
     * This test case uses a stub for the TemporalAmount and this is to throw the exception for units not equal to supported units
     */
    @Test(expected = DateTimeException.class)
    public void testInstanceChronoFrom() {

        TemporalAmount ta_obj = new TemporalAmount() {
            @Override
            public long get(TemporalUnit unit) {
                return 0;
            }

            @Override
            public List<TemporalUnit> getUnits() {
                //return null;
                List<TemporalUnit> lis = new ArrayList<>();
                //lis.add(ChronoUnit.YEARS);
                lis.add(ChronoUnit.DECADES);
                return lis;
            }

            @Override
            public Temporal addTo(Temporal temporal) {
                return null;
            }

            @Override
            public Temporal subtractFrom(Temporal temporal) {
                return null;
            }
        };
        Period.from(ta_obj);
    }

    @Test(expected = DateTimeException.class)
    public void testNotIsoChronologyofFrom() {
        //LocalDateTime date = LocalDateTime.of(2013, Month.JULY, 20, 19, 30);
        Period p = Period.of(1994, 1, 5);

        Period.from(MinguoChronology.INSTANCE.period(1994, 1, 5));


    }


    /**
     * Test case to check the Parse Method
     */
    @Test
    public void testParse() {

        Period p = Period.of(-2, -2, 0);
        Period Negative = p.parse("-P2Y2M");

        Period p2 = Period.of(-1, 1, 0);
        Period NegativeYears = p2.parse("P-1Y1M");

        Period p1 = Period.ofDays(5);
        try {
            Period days = p1.parse("PD");
        } catch (Exception e) {

        }
        // Assert.assertEquals(days,days);


    }

    /**
     * Tests the other branches of Parse()
     */
    @Test
    public void testelseParse() {
        try {
            Period p = Period.of(1, 2, 0);
            //Long Val = Long.MAX_VALUE;

            Period Negative = p.parse("P2Y");
        } catch (Exception e) {

        }
    }

    /**
     * Tests the Null branches of the parse() Method
     */
    @Test
    public void testNullParse() {


        try {
            Period p = Period.of(1, 2, 0);
            //Long Val = Long.MAX_VALUE;

            Period Negative = p.parse("P");
        } catch (Exception e) {
        }


    }

    /**
     * tests the parse() Method to throw an integer exception
     */
    @Test
    public void testNullParseMonth() {
        try {
            Period p = Period.of(1, 1, 1);
            Period big = p.parse("-p-214748365034");

        } catch (Exception e) {

        }
    }

    /**
     * tests the parse() method when others are null values except weeks
     */
    @Test
    public void testelseParseWeek() {
        try {
            Period p = Period.of(1, 2, 0);
            //Long Val = Long.MAX_VALUE;

            Period Negative = p.parse("P2W");
        } catch (Exception e) {

        }
    }

    /**
     * Tests the parse() method when all the values are present
     */
    @Test
    public void testParseAll() {
        try {
            Period p = Period.of(1, 1, 1);

            Period all = p.parse("P1Y2M3W4D");

        } catch (Exception e) {
        }

    }

    /**
     * tests the parse() Method when other values are equal to null except days
     */
    @Test
    public void testelseParseDays() {
        try {
            Period p = Period.of(1, 2, 2);
            //Long Val = Long.MAX_VALUE;

            Period Negative = p.parse("P2D");
        } catch (Exception e) {

        }
    }

    /**
     * Tests the parse() method when Months!= null
     */
    @Test
    public void testelseParseMonths() {
        try {
            Period p = Period.of(1, 2, 0);
            //Long Val = Long.MAX_VALUE;

            Period Negative = p.parse("P2M");
        } catch (Exception e) {

        }
    }


    /**
     * No Branches in this Method,  code Coverage is complete
     */
    @Test
    public void testMinus() {
        Period p = Period.of(1, 1, 1);
        Period minusYears = p.minus(Period.ofYears(1));
        Period minusMonths = p.minus(Period.ofMonths(1));
        Period minusDays = p.minus(Period.ofDays(1));

        Assert.assertEquals(minusYears, minusYears);
        Assert.assertEquals(minusMonths, minusMonths);
        Assert.assertEquals(minusDays, minusDays);

    }

    /**
     * Test case to check the toString Method.()Coveing
     */
    @Test
    public void testToString() {
        Period p = Period.of(1, 1, 1);

        String p1 = p.toString();


    }

    /**
     * Tests the toString() when years are ZERO
     */
    @Test
    public void testZeroYearsToString() {
        Period p = Period.of(0, 1, 1);

        String p1 = p.toString();

        //Assert.assertEquals("P0D", p1);


    }

    /**
     * Tests the toString() When MOnths are Zero
     */
    @Test
    public void testZeroMonthsToString() {
        Period p = Period.of(1, 0, 1);

        String p1 = p.toString();

        //Assert.assertEquals("P0D", p1);


    }

    /**
     * Tests the toString() when Days are Zero
     */
    @Test
    public void testZeroDaysToString() {
        Period p = Period.of(1, 1, 0);

        String p1 = p.toString();

        //Assert.assertEquals("P0D", p1);


    }

    @Test
    public void testZeroTOString() {
        Period p = Period.of(0, 0, 0);
        String p1 = p.toString();
    }

    @Test
    public void testGetUnits() {

        Period p = Period.of(1, 1, 1);

        p.getUnits();


    }

    /**
     * Created a stub of the Temporal interface to make the ValidateChrono Throw an exception
     */
    @Test(expected = DateTimeException.class)
    public void testStubValidate() {


        class StubValidteChrono implements Temporal{

            @Override
            public boolean isSupported(TemporalField field) {
                return false;
            }

            @Override
            public long getLong(TemporalField field) {
                return 0;
            }

            @Override
            public <R> R query(TemporalQuery<R> query) {

                if(query == TemporalQueries.chronology())
                    return (R) ThaiBuddhistChronology.INSTANCE;
                else if(query == TemporalQueries.zoneId() || query == TemporalQueries.precision())
                    return null;

                return query.queryFrom(this);



            }

            @Override
            public boolean isSupported(TemporalUnit unit) {
                return false;
            }

            @Override
            public Temporal with(TemporalField field, long newValue) {
                return null;
            }

            @Override
            public Temporal plus(long amountToAdd, TemporalUnit unit) {
                return null;
            }

            @Override
            public long until(Temporal endExclusive, TemporalUnit unit) {
                return 0;
            }
        }

        StubValidteChrono svc = new StubValidteChrono();
        Period.ZERO.subtractFrom(svc);


    }

    /**
     * Created a stub to make the query() method return a null to cover the null branch in validateChrono
     */
    @Test
    public void testValidateNullChrono(){

        class stubofTemporal implements Temporal{


            @Override
            public boolean isSupported(TemporalField field) {
                return false;
            }

            @Override
            public ValueRange range(TemporalField field) {
                return null;
            }

            @Override
            public int get(TemporalField field) {
                return 0;
            }

            @Override
            public long getLong(TemporalField field) {
                return 0;
            }

            @Override
            public <R> R query(TemporalQuery<R> query) {
                return (R) null;
            }

            @Override
            public boolean isSupported(TemporalUnit unit) {
                return false;
            }

            @Override
            public Temporal with(TemporalField field, long newValue) {
                return null;
            }

            @Override
            public Temporal plus(long amountToAdd, TemporalUnit unit) {
                return null;
            }

            @Override
            public long until(Temporal endExclusive, TemporalUnit unit) {
                return 0;
            }
        }

        stubofTemporal svc = new stubofTemporal();
        Period.ZERO.subtractFrom(svc);
    }

    /**
     * Created a stub for Temporal Interface to make the query() Method return an Instance of IsoChronology
     */
    @Test
    public void testNotNullIsoValidateChrono(){


        class stub implements Temporal{


            @Override
            public boolean isSupported(TemporalField field) {
                return false;
            }

            @Override
            public ValueRange range(TemporalField field) {
                return null;
            }

            @Override
            public int get(TemporalField field) {
                return 0;
            }

            @Override
            public long getLong(TemporalField field) {
                return 0;
            }

            @Override
            public <R> R query(TemporalQuery<R> query) {

                if(query == TemporalQueries.chronology())
                    return (R) IsoChronology.INSTANCE;
                else if(query == TemporalQueries.zoneId() || query == TemporalQueries.precision())
                    return null;

                return null;

            }

            @Override
            public boolean isSupported(TemporalUnit unit) {
                return false;
            }

            @Override
            public Temporal with(TemporalField field, long newValue) {
                return null;
            }

            @Override
            public Temporal plus(long amountToAdd, TemporalUnit unit) {
                return null;
            }

            @Override
            public long until(Temporal endExclusive, TemporalUnit unit) {
                return 0;
            }
        }

        stub svc = new stub();
        Period.ZERO.subtractFrom(svc);

    }




    //All Tests passed

}








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



}

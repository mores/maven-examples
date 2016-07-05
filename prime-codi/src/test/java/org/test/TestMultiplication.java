package org.test;

import javax.inject.Inject;

import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertTrue;

@RunWith(CdiTestRunner.class)
public class TestMultiplication {

  @Inject
  Multiplicand multiplicand;

  @Inject
  Multiplier multiplier;
 
  @Inject
  Product product;
 
  @Test
  public void testMultiply() {

    multiplicand.setValue( new java.math.BigDecimal( "3" ) );

    multiplier.setValue( new java.math.BigDecimal( "7" ) );

    java.math.BigDecimal value = product.getValue(); 
    System.out.println( "value: " + value );

    assertTrue( value.compareTo( new java.math.BigDecimal( "21" ) ) == 0 );

  }
}

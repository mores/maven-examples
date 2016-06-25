package org.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertTrue;

import org.jglue.cdiunit.AdditionalClasses;
import org.jglue.cdiunit.CdiRunner;
import org.jglue.cdiunit.ContextController;
import org.jglue.cdiunit.InRequestScope;
import org.jglue.cdiunit.InSessionScope;

@RunWith(CdiRunner.class)
public class TestMultiplication {

  @Inject
  ContextController contextController; //Obtain an instance of the context controller.

  @Inject
  Multiplicand multiplicand;

  @Inject
  Multiplier multiplier;
 
  @Inject
  Product product;
 
  @Test
  @InSessionScope
  public void testMultiply() {

    contextController.openRequest();

    //Multiplicand multiplicand = new Multiplicand();
    multiplicand.setValue( new java.math.BigDecimal( "3" ) );

    //Multiplier multiplier = new Multiplier();
    multiplier.setValue( new java.math.BigDecimal( "7" ) );

    java.math.BigDecimal value = product.getValue(); 
    System.out.println( "value: " + value );

    assertTrue( value.compareTo( new java.math.BigDecimal( "21" ) ) == 0 );

    contextController.closeRequest(); //Close the current request.
  }
}

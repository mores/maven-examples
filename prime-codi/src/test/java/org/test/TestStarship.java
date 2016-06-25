package org.test;

import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.jglue.cdiunit.CdiRunner;

@RunWith(CdiRunner.class)
public class TestStarship {
 
  @Inject
  Starship starship;
 
  @Test
  public void testStart() {
    starship.start(); // Going to warp!
  }
}

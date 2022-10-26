package io.github.rkraneis.treereporter;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class OuterTest {

  @Test public void test() {}
  
  @Nested public class Inner1 { @Test public void testInner1(){} }
  @Nested public class Inner2 { @Test public void testInner2(){} }
  @Nested public class InnerSub1 extends Base { @Test public void testInnerSub1(){} }
  @Nested public class InnerSub2 extends Base { @Test public void testInnerSub2(){}  }
  
  public abstract class Base { @Test public void testFromBase(){} }
}

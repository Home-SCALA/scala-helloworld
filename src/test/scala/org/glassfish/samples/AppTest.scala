package org.glassfish.samples

import org.junit._
import Assert._

@Test
class AppTest {

  @Test
  def testOK() = assertTrue(true)

  @Test
//    def testKO() = assertTrue(false)
  def testKO() = assertFalse(false)

}



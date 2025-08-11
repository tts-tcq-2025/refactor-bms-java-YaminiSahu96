package vitals;

import static org.junit.Assert.*;

import org.junit.Test;

public class VitalsCheckerTest {

  @Test
  public void testTemperatureChecks() {
    assertTrue(VitalsChecker.isTemperatureOk(95));
    assertTrue(VitalsChecker.isTemperatureOk(102));
    assertFalse(VitalsChecker.isTemperatureOk(94.9f));
    assertFalse(VitalsChecker.isTemperatureOk(102.1f));
  }

  @Test
  public void testPulseRateChecks() {
    assertTrue(VitalsChecker.isPulseRateOk(60));
    assertTrue(VitalsChecker.isPulseRateOk(100));
    assertFalse(VitalsChecker.isPulseRateOk(59));
    assertFalse(VitalsChecker.isPulseRateOk(101));
  }

  @Test
  public void testSpo2Checks() {
    assertTrue(VitalsChecker.isSpo2Ok(90));
    assertTrue(VitalsChecker.isSpo2Ok(100));
    assertFalse(VitalsChecker.isSpo2Ok(89));
  }

  // Main vitalsOk tests
  @Test
  public void testVitalsOk() throws InterruptedException {
    // All good
    assertTrue(VitalsChecker.vitalsOk(98f, 70, 98));
    
    // Temperature bad
    assertFalse(VitalsChecker.vitalsOk(94f, 70, 98));

    // Pulse bad
    assertFalse(VitalsChecker.vitalsOk(98f, 59, 98));

    // Spo2 bad
    assertFalse(VitalsChecker.vitalsOk(98f, 70, 89));
  }
}

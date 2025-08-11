package vitals;

public abstract class VitalsChecker {

  // Pure functions: check individual vitals
  public static boolean isTemperatureOk(float temperature) {
    return temperature >= 95 && temperature <= 102;
  }

  public static boolean isPulseRateOk(float pulseRate) {
    return pulseRate >= 60 && pulseRate <= 100;
  }

  public static boolean isSpo2Ok(float spo2) {
    return spo2 >= 90;
  }
}

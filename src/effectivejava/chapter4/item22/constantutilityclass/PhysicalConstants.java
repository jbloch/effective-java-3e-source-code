package effectivejava.chapter4.item22.constantutilityclass;

// Constant utility class (Page 108)
public class PhysicalConstants {
  private PhysicalConstants() { }  // Prevents instantiation

  // Avogadro's number (1/mol)
  public static final double AVOGADROS_NUMBER = 6.022_140_857e23;

  // Boltzmann constant (J/K)
  public static final double BOLTZMANN_CONST  = 1.380_648_52e-23;

  // Mass of the electron (kg)
  public static final double ELECTRON_MASS    = 9.109_383_56e-31;
}

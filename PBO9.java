/*
 * Nama    : Roihan Kusuma Wardana
 * NIM     : 20200040049
 * Kelas   : TI20A
 */
package pbo9;

/**
 *
 * @author ZRX1204
 */
public class PBO9 {
    public static void main(String[] args) {
    Cars Ford = null;
    Cars FordMustang = new Race("Ford Mustang", 100);

    Cars FordGT = new Cars("Ford GT", 100);
    Endurance won = new Endurance("Won", 1000, "Im fast as hell yeah");

    Ford = won;

    System.out.println(won.getSuperPower());
    System.out.println(Ford.getSuperPower());
  }
}

class Cars {
  protected String name;
  protected int torque;
  protected String superPower = "I dont have any power";

  Cars(String name, int torque) {
    this.name = name;
    this.torque = torque;
  }

  Cars(String name, int torque, String superPower) {
    this.name = name;
    this.torque = torque;
    this.superPower = superPower;
  }
  
  public String getSuperPower() {
    return this.superPower;
  }

  public String RunnerUP() {
    return "Maybe next race";
  }

  public String Lost() {
    return "Hmmmm";
  }
}

class Race extends Cars {
  Race(String name, int torque) {
    super(name, torque);
  }

  Race(String name, int torque, String superPower) {
    super(name, torque, superPower);
  }

  @Override
  public String RunnerUP() {
    return "Im a Race";
  }

  @Override
  public String Lost() {
    return "Im fool, sorry...";
  }
}

class Endurance extends Race{
  Endurance(String name, int torque, String superPower) {
    super(name, torque, superPower);
  }

  @Override
  public String RunnerUP() {
    return "Im a Endurance";
  }

  @Override
  public String Lost() {
    return "arrgghhhh";
  }
}
package pl.dsw45634.solid.e_DIP.no_2;

class Button {

  private Switchable switchable;

  public void pool() {
    if (switchable.isTurned()) {
      switchable.turnOff();
    } else {
      switchable.turnOn();
    }
  }
}

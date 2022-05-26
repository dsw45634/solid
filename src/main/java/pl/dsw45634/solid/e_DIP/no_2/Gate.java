package pl.dsw45634.solid.e_DIP.no_2;

class Gate implements Switchable {

  private boolean turned;

  @Override
  public boolean isTurned() {
    return this.turned;
  }

  @Override
  public void turnOff() {
    this.turned = false;
  }

  @Override
  public void turnOn() {
    this.turned = true;
  }
}

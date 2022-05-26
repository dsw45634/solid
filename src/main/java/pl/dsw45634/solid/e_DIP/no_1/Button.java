package pl.dsw45634.solid.e_DIP.no_1;

class Button {

  private Gate gate;

  public void pool() {
    if (this.gate.isOpen()) {
      gate.lock();
    } else {
      gate.unlock();
    }
  }
}

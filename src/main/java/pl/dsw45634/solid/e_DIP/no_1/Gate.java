package pl.dsw45634.solid.e_DIP.no_1;

class Gate {

  private boolean isOpen;

  public boolean isOpen() {
    return isOpen;
  }

  public void unlock() {
    this.isOpen = false;
  }

  public void lock() {
    this.isOpen = true;
  }

}

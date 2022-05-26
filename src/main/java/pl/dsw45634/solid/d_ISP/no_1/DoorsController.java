package pl.dsw45634.solid.d_ISP.no_1;

import pl.dsw45634.solid.b_OCP.no_2.utils.InputReader;

class DoorsController {

    private final static String MESSAGE = "Otwórz / zamknij:\nN - drzwi normalne\nA - drzwi z alarmem\nQ - wyjdź";
    private final Door[] doors = {new NormalDoor(), new TimedDoor()};

    void manipulate() {
        String input = "";
        while (!input.equals("Q")) {
            input = InputReader.read(MESSAGE).toUpperCase();
            switch (input) {
                case "N":
                    openClose(0);
                    break;
                case "A":
                    openClose(1);
                    break;
            }
        }
    }

    private void openClose(int i) {
        Door door = doors[i];
        if (door.isDoorOpen()) {
            door.lock();
        } else {
            door.unlock();
        }
    }

    public static void main(String[] args) {
        new DoorsController().manipulate();
    }
}

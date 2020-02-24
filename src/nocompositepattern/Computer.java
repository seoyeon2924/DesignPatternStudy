package nocompositepattern;

public class Computer{

    private Keyboard keyboard;
    private Monitor monitor;

    public void addKeyboard(Keyboard keyboard) {
      this.keyboard = keyboard;
    }
    public void addMonitor(Monitor monitor) {
      this.monitor = monitor;
    }

    public int getPrice() {
      int keyboardPrice = keyboard.getPrice();
      int monitorPrice = monitor.getPrice();
      return keyboardPrice  + monitorPrice;
    }

    public int getPower() {
      int keyboardPower = keyboard.getPower();
      int monitorPower = monitor.getPower();
      return keyboardPower + monitorPower;
    }
}

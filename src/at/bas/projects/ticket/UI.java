package at.bas.projects.ticket;

public class UI {
    Controller controller;
    Scanner scanner;
    CashDispenser cashDispenser;
    private double moneyInserted;

    public UI(Controller controller, Scanner scanner, CashDispenser cashDispenser) {
        this.controller = controller;
        this.scanner = scanner;
        this.cashDispenser = cashDispenser;
    }

    public void ButtonPressed() {
        System.out.println("Pressed the Button:     ");
        controller.CreateTicket();
    }

    public void InsertMoney(double betrag) {
        moneyInserted += betrag;
        System.out.println(betrag + "€ eingeschmissen");
        if (moneyInserted >= scanner.getPrice()) {
            scanner.getTicket().setPayedTimeStamp(System.currentTimeMillis());
            cashDispenser.returnChange((scanner.getPrice() - moneyInserted) * -1);
        } else {
            System.out.println("Zu zahlen: " + (scanner.getPrice() - moneyInserted));
        }
    }
}
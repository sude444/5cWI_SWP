package at.bas.projects.ticket;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Scanner scanner = new Scanner();
        Controller controller = new Controller(printer);
        CashDispenser geldausgabe = new CashDispenser();
        UI ui = new UI(controller, scanner, geldausgabe);

        ui.ButtonPressed();
        Ticket testTicket = controller.getTickets().get(0);
        scanner.InsertTicket(testTicket);
        System.out.println(scanner.getPrice() + "Euro");
        ui.InsertMoney(0.50);
        ui.InsertMoney(2.00);

        // scanner.InsertTicket(controller.getTickets().get(0));
    }
}
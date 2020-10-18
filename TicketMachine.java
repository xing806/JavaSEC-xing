import java.util.Scanner;

public class TicketMachine {
    private int price;
    private int balance;
    private int total;

    public void insertMoney(int amount) {
        balance += amount;
    }

    public void printTicket() {
        if (balance < price) {
            System.out.println("balance is not enough!");
        } else {
            System.out.println("########################");
            System.out.println("This is a ticket");
            System.out.println("price:" + price + "Yuan");
            System.out.println("########################");
            balance = balance - price;
            total += price;
        }

    }

    public int refundBalance() {
        int amountRefunded = balance;
        balance = 0;
        return amountRefunded;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        int price = 2;
        TicketMachine ticketMachine = new TicketMachine();
        ticketMachine.setPrice(price);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean quitFlag = false;
            System.out.println("===============欢迎使用自动售票机===============");
            System.out.println("本机销售固定票价 " + price + " 元的车票");
            while (true) {
                System.out.println("请选择服务...");
                System.out.println("1、投币");
                System.out.println("2、打印车票");
                System.out.println("3、找零");
                int type = scanner.nextInt();

                switch (type) {
                    case 1:
                        int amount = scanner.nextInt();
                        scanner.nextLine();
                        if (amount < 0) {
                            System.out.println("请正常投币...");
                        } else {
                            ticketMachine.insertMoney(amount);
                        }
                        System.out.println("当前余额：" + ticketMachine.getBalance() + " 元");
                        break;
                    case 2:
                        ticketMachine.printTicket();
                        System.out.println("当前余额：" + ticketMachine.getBalance() + " 元");
                        if (ticketMachine.getBalance() == 0) {
                            quitFlag = true;
                        }
                        break;
                    case 3:
                        System.out.println("请收好找零 " + ticketMachine.refundBalance() + " 元");
                        quitFlag = true;
                        break;
                    default:
                        System.out.println("请输入正确选项");
                }
                if (quitFlag) {
                    break;
                }
            }
        }

    }
}


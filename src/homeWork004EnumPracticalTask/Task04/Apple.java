package homeWork004EnumPracticalTask.Task04;

public class Apple {
    public static void main(String[] args) {
        Product Apple1 = new Product("Apple1", 10, 100);
        Product Apple2 = new Product("Apple2", 20, 50);
        Product Apple3 = new Product("Apple3", 15, 80);
        Product Apple4 = new Product("Apple4", 11, 200);

        int max_price = 0;
        String max_name = "lol";
        if ((Apple1.getPrice() > Apple2.getPrice() && Apple1.getPrice() > Apple3.getPrice() && Apple1.getPrice() > Apple4.getPrice())) {
            max_price = Apple1.getPrice();
            max_name = Apple1.getName();
        } else if ((Apple2.getPrice() > Apple1.getPrice() && Apple2.getPrice() > Apple3.getPrice() && Apple2.getPrice() > Apple4.getPrice())) {
            max_price = Apple2.getPrice();
            max_name = Apple2.getName();
        } else if ((Apple3.getPrice() > Apple1.getPrice() && Apple3.getPrice() > Apple2.getPrice() && Apple3.getPrice() > Apple4.getPrice())) {
            max_price = Apple3.getPrice();
            max_name = Apple3.getName();
        } else if ((Apple4.getPrice() > Apple1.getPrice() && Apple4.getPrice() > Apple2.getPrice() && Apple4.getPrice() > Apple3.getPrice())) {
            max_price = Apple4.getPrice();
            max_name = Apple4.getName();
        } else {
            System.out.println("Щось пішло не так =(");
        }
        System.out.println("Назва " + max_name + " Найдорощий товар (Ціна): " + max_price);


        int max_quantity = 0;
        String name_quantity = "lol";

        if ((Apple1.getQuantity() > Apple2.getQuantity() && Apple1.getQuantity() > Apple3.getQuantity() && Apple1.getQuantity() > Apple4.getQuantity())) {
            max_quantity = Apple1.getQuantity();
            name_quantity = Apple1.getName();
        } else if ((Apple2.getQuantity() > Apple1.getQuantity() && Apple2.getQuantity() > Apple3.getQuantity() && Apple2.getQuantity() > Apple4.getQuantity())) {
            max_quantity = Apple2.getQuantity();
            name_quantity = Apple2.getName();
        } else if ((Apple3.getQuantity() > Apple1.getQuantity() && Apple3.getQuantity() > Apple2.getQuantity() && Apple3.getQuantity() > Apple4.getQuantity())) {
            max_quantity = Apple3.getQuantity();
            name_quantity = Apple3.getName();
        } else if ((Apple4.getQuantity() > Apple1.getQuantity() && Apple4.getQuantity() > Apple2.getQuantity() && Apple4.getQuantity() > Apple3.getQuantity())) {
            max_quantity = Apple4.getQuantity();
            name_quantity = Apple4.getName();
        } else {
            System.out.println("Щось пішло не так =(");
        }
        System.out.println("Найбільша кількість продуктів у розділі: " + name_quantity);
    }
}

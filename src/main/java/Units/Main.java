package Units;

public class Main {
    public static void main(String[] args) {

        try{
            Player player1 = new Player(23, 15, 140, 2);
            Monster monster1 = new Monster();
            System.out.print(player1.getInfo());
            System.out.println(monster1.getInfo());
            player1.attack(monster1);
            monster1.attack(player1);
            System.out.println("----");
            System.out.print(player1.getInfo());
            System.out.println(monster1.getInfo());
            player1.heal();
            System.out.print(player1.getInfo());
        } catch (InvalidValueException e){
            System.out.printf("Исключение при попытке создания экземпляра класса. %s%d", e.getMessage(), e.getValue());
        }
    }
}

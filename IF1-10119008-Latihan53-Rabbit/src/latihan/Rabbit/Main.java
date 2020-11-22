package latihan.Rabbit;

/*
 * @author Raihan Giffari
 *
 * Nama  : Raihan Giffari
 * Nim   : 10119008
 * Kelas : IF1
 */

public class Main {

        public static void main(String[] args) {
            Rabbit rabbit1 = new Rabbit("Peter", false, "grass", 4, "grey");
            System.out.printf("Hello, His name is %s", rabbit1.getName());
            System.out.printf("\n%s is Vegetarian? %b", rabbit1.getName(), rabbit1.isVegetarian());
            System.out.printf("\n%s eats %s", rabbit1.getName(), rabbit1.getEats());
            System.out.printf("\n%s has %d", rabbit1.getName(), rabbit1.getNoOfLegs());
            System.out.printf("\n%s color is %s", rabbit1.getName(),rabbit1.getColor());
        }
    }
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int option;

        String brand;
        String model;
        int age;

        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> carsArray = new ArrayList<>();

        do {
            System.out.println("(------------ MENU ------------)");
            System.out.println("1. Cadastrar novo carro");
            System.out.println("2. Listar carros cadastrados");
            System.out.println("3. Mostrar o carro mais antigo");
            System.out.println("4. Sair");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.println("Digite o marca do carro");
                    brand = scanner.next();
                    System.out.println("Digite o modelo do carro");
                    model = scanner.next();
                    System.out.println("Digite o ano do carro");
                    age = scanner.nextInt();

                    Car newCar = new Car(brand, model, age);

                    carsArray.add(newCar);
                    break;
                case 2:
                    for (Car c : carsArray){
                        System.out.println(c);
                    }
                    break;
                case 3:
                    Car carLowAge = carsArray.stream()
                            .min(Comparator.comparingInt(Car::getAge))
                            .orElseThrow();
                    System.out.println("Carro mais antigo: " + carLowAge);
                    break;

            }
        } while (option != 4);
        scanner.close();
    }
}

public class Car {
    String brand;
    String model;
    int age;

    public Car(String brand, String model, int age){
        this.brand = brand;
        this.model = model;
        this.age = age;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Marca: " + brand + "| Modelo: " + model + "| Ano: " + age;
    }
}

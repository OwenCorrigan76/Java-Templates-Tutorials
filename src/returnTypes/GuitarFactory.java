package returnTypes;


public class GuitarFactory {
    public static Guitar makeGuitar(String brand, String model, int year) {
        return new Guitar(brand, model, year);
    }

    public static Guitar makeGuitar(String brand, String model, int year, int strings) {
        return new Guitar(brand, model, year, strings);
    }

    public static Guitar makeGuitar(String brand, String model, int year, int strings, String factory) {
        return new Guitar(brand, model, year, strings, factory);
    }
}


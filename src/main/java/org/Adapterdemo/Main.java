package org.Adapterdemo;

// Client class that uses the Adapter
public class Main {
    public static void main(String[] args) {
        // Create an object of the Adaptee (Imperial system)
        ImperialSystem imperialSystem = new ImperialSystem();

        // Create the Adapter to connect MetricConverter with ImperialSystem
        MetricConverter adapter = new UnitAdapter(imperialSystem);

        // Example input values
        double meters = 10;
        double kilograms = 5;

        // Using adapter to perform conversions
        System.out.println(meters + " meters = " + adapter.convertLength(meters) + " feet");
        System.out.println(kilograms + " kilograms = " + adapter.convertWeight(kilograms) + " pounds");
    }
}

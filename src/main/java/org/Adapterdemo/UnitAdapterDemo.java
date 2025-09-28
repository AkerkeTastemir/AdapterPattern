package org.Adapterdemo;

// Target interface (the interface the client expects to use)
interface MetricConverter {
    double convertLength(double meters);    // method to convert meters to feet
    double convertWeight(double kilograms); // method to convert kilograms to pounds
}

// Adaptee (the existing system that works with Imperial units only)
class ImperialSystem {
    // Converts meters to feet
    public double getLengthInFeet(double meters) {
        return meters * 3.28084; // 1 meter = 3.28084 feet
    }

    // Converts kilograms to pounds
    public double getWeightInPounds(double kilograms) {
        return kilograms * 2.20462; // 1 kilogram = 2.20462 pounds
    }
}

// Adapter (makes ImperialSystem compatible with MetricConverter interface)
class UnitAdapter implements MetricConverter {
    private ImperialSystem imperialSystem;

    // Constructor: adapter takes an object of ImperialSystem
    public UnitAdapter(ImperialSystem imperialSystem) {
        this.imperialSystem = imperialSystem;
    }

    // Adapts meter-to-feet conversion
    @Override
    public double convertLength(double meters) {
        return imperialSystem.getLengthInFeet(meters);
    }

    // Adapts kilogram-to-pound conversion
    @Override
    public double convertWeight(double kilograms) {
        return imperialSystem.getWeightInPounds(kilograms);
    }
}


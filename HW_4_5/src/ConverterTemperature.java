public class ConverterTemperature {
    public static float CelsiusToKelvin(float in){
        return in + 273.15F;
    }

    public static float CelsiusToFahrenheit(float in){
        return in * 1.8F + 32F;
    }

}

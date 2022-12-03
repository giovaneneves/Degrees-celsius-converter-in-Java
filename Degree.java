import java.util.Scanner;

public class Degree {
    private float celsius;
    private float kelvin;
    private float fahrenheit;
    private float reaumur;
    private float rankine;

    public void setCelsius()
    {
        Scanner scanner = new Scanner(System.in);
        this.celsius = Integer.parseInt(scanner.nextLine());
    }

    public float getCelsius()
    {
        return celsius;
    }
    public void setKelvin(float celsius)
    {
        this.kelvin = celsius + 273.15f;
    }

    public float getKelvin()
    {
        return kelvin;
    }

    public void setReaumur(float celsius)
    {
        this.reaumur = celsius * 0.8f;
    }

    public float getReaumur()
    {
        return reaumur;
    }

    public void setFahrenheit(float celsius)
    {
        this.fahrenheit = (celsius * 1.8f) + 32f;
    }

    public float getFahrenheit()
    {
        return fahrenheit;
    }

    public void setRankine(float celsius)
    {
        this.rankine = (celsius * 1.8f) + 32f + 459.67f;
    }

    public float getRankine()
    {
        return rankine;
    }
}

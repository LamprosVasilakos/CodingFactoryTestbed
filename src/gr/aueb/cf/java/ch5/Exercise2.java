package gr.aueb.cf.java.ch5;

public class Exercise2 {

    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(36));
    }

    public static double celsiusToFahrenheit(double tempCelcius){
        return tempCelcius*9/5 + 32;
    }

}

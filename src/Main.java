public class Main {

    public static void main(String[] args) {
        String trafficLightColor = "green"; //Переменная для хранения сигнала светофора
        switch (trafficLightColor) {
            case "red":
                System.out.println("Остановится!");
                break;
            case "yellow":
                System.out.println("Подождать.");
                break;
            case "green":
                System.out.println("Ехать.");
                System.out.println("Ехать.");
                break;
        }
    }
}

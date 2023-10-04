package weather_api;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Connection {
    private static final String apiKey = "0175a990e5f72f0ce6ce791b3fd77980";

    public String getJson(String city) throws Exception {
        StringBuilder sb = new StringBuilder();

        URL url = new URL("http://api.weatherstack.com/current?access_key=" + apiKey + "&query=" + city);
        URLConnection connection = url.openConnection();
        Scanner scanner = new Scanner(connection.getInputStream());
        while(scanner.hasNextLine()) {
            sb.append(scanner.nextLine());
        }

        System.out.println("От Сервера Пришел Ответ: " + sb);
        return sb.toString();
    }
}

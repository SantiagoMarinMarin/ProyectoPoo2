
package com.mycompany.proyectopoo2;

import java.net.http.*;
import java.net.URI;
import com.google.gson.Gson;
import java.nio.charset.StandardCharsets;

public class MethodHireEmployee {

    private static final String URL = "http://localhost:8000/employes";
    private static final HttpClient client = HttpClient.newHttpClient();
    private static final Gson gson = new Gson();

    public static void crearEmpleado(Empleado emp) throws Exception {
    Gson gson = GsonConfig.getGson(); // Usa el Gson con adaptador para LocalDate

    String json = gson.toJson(emp);

    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(URL))
        .header("Content-Type", "application/json")
        .POST(HttpRequest.BodyPublishers.ofString(json, StandardCharsets.UTF_8))
        .build();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println("Respuesta: " + response.body());
}
    public class MethoddefinidoHireEmployee {

    private static final String URL = "http://localhost:8000/definidoemployes";
    private static final HttpClient client = HttpClient.newHttpClient();
    private static final Gson gson = new Gson();

    public static void crearEmpleado(Empleado emp) throws Exception {
    Gson gson = GsonConfig.getGson(); // Usa el Gson con adaptador para LocalDate

    String json = gson.toJson(emp);

    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(URL))
        .header("Content-Type", "application/json")
        .POST(HttpRequest.BodyPublishers.ofString(json, StandardCharsets.UTF_8))
        .build();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println("Respuesta: " + response.body());
}
}
}
package metodos;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import moedas.Moeda;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.InputMismatchException;

public class Conversor {

    private double valorParaConverter;

    public void setValorParaConverter(double valorParaConverter) {
        this.valorParaConverter = valorParaConverter;
    }

    public void realParaDolar() throws IOException, InterruptedException {

        String endereco = "https://v6.exchangerate-api.com/v6/3257fe25bb65af9c427e4b5c/pair/BRL/USD/" + valorParaConverter;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        String json = response.body();
        Gson gson = new Gson();

        Moeda convertida = gson.fromJson(json, Moeda.class);
        System.out.println("Valor convertido é de $" + convertida.getConversion_result()+" DOLARES");

    }

    public void dolarParaReal() throws IOException, InterruptedException {
try{
    String endereco = "https://v6.exchangerate-api.com/v6/3257fe25bb65af9c427e4b5c/pair/USD/BRl/" + valorParaConverter;

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();

    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());


    String json = response.body();
    Gson gson = new Gson();

    Moeda convertida = gson.fromJson(json, Moeda.class);
    System.out.println("Valor convertido é de R$" + convertida.getConversion_result() +" REAIS");

}catch (JsonSyntaxException e){
    System.out.println("Aconteceu um erro: Valor muito alto. ");
    System.out.println(e.getMessage());
}


    }

    public void dolarParaEuro() throws IOException, InterruptedException {

        String endereco = "https://v6.exchangerate-api.com/v6/3257fe25bb65af9c427e4b5c/pair/USD/EUR/" + valorParaConverter;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        String json = response.body();
        Gson gson = new Gson();

        Moeda convertida = gson.fromJson(json, Moeda.class);
        System.out.println("Valor convertido é: €" + convertida.getConversion_result());

    }

    public void dolarParaPeso() throws IOException, InterruptedException {

        String endereco = "https://v6.exchangerate-api.com/v6/3257fe25bb65af9c427e4b5c/pair/USD/ARS/" + valorParaConverter;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        String json = response.body();
        Gson gson = new Gson();

        Moeda convertida = gson.fromJson(json, Moeda.class);
        System.out.println("Valor convertido é: $" + convertida.getConversion_result());

    }

    public void pesoParaDolar() throws IOException, InterruptedException {

        String endereco = "https://v6.exchangerate-api.com/v6/3257fe25bb65af9c427e4b5c/pair/ARS/USD/" + valorParaConverter;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        String json = response.body();
        Gson gson = new Gson();

        Moeda convertida = gson.fromJson(json, Moeda.class);
        System.out.println("Valor convertido é de $" + convertida.getConversion_result()+" DOLARES");

    }

    public void euroParaDolar() throws IOException, InterruptedException {

        String endereco = "https://v6.exchangerate-api.com/v6/3257fe25bb65af9c427e4b5c/pair/EUR/USD/" + valorParaConverter;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        String json = response.body();
        Gson gson = new Gson();

        Moeda convertida = gson.fromJson(json, Moeda.class);
        System.out.println("Valor convertido é de $" + convertida.getConversion_result()+" DOLARES");

    }


}

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

    public void valorConvertido(String de, String para) throws IOException, InterruptedException {

        String apiKey = System.getenv("EXCHANGE_RATE_API_KEY");
        if (apiKey == null || apiKey.isBlank()) {
            System.out.println("Defina a variável de ambiente EXCHANGE_RATE_API_KEY com a sua chave da ExchangeRate-API.");
            return;
        }

        String endereco = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + de +"/"+ para +"/"+ valorParaConverter;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        String json = response.body();
        Gson gson = new Gson();

        Moeda convertida = gson.fromJson(json, Moeda.class);
        System.out.println("Valor convertido é de $" + convertida.getConversion_result());

    }

}

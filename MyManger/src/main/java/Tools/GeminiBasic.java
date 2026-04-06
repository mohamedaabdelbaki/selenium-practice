package Tools;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GeminiBasic {
    public static void main(String[] args) {
        String apiKey = "AIzaSyA0Zv9pFv6gNml734Y_WW2wKqMdVp-qMdg"; // replace with your key
        String modelName = "models/gemini-2.5-flash";

        try {
            HttpClient client = HttpClient.newHttpClient();
            ObjectMapper mapper = new ObjectMapper();

            // The prompt to send
            String prompt = "Generate 3 test cases for login feature";

            String requestBody = """
                {
                  "prompt": "%s"
                }
                """.formatted(prompt);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://generativelanguage.googleapis.com/v1beta/" + modelName + ":generateText?key=" + apiKey))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonNode root = mapper.readTree(response.body());

            if (root.has("candidates") && root.get("candidates").size() > 0) {
                String result = root.get("candidates").get(0).get("content").get(0).get("text").asText();
                System.out.println("AI Response:\n" + result);
            } else {
                System.out.println("No text found in response:");
                System.out.println(response.body());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
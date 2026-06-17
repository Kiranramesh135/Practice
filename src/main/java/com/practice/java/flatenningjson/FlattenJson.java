package com.practice.java.flatenningjson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class FlattenJson {

    public static void main(String[] args) throws IOException, JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        // Example JSON as a String, or you can read from a file
        String json = "{\n" +
                "  \"company\": {\n" +
                "    \"name\": \"TechCorp\",\n" +
                "    \"departments\": [\n" +
                "      {\n" +
                "        \"name\": \"Engineering\",\n" +
                "        \"employees\": [\n" +
                "          {\"id\": 101, \"name\": \"Alice\", \"skills\": [\"Python\", \"Spark\"]},\n" +
                "          {\"id\": 102, \"name\": \"Bob\", \"skills\": [\"Java\", \"Kubernetes\"]}\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Marketing\",\n" +
                "        \"employees\": [\n" +
                "          {\"id\": 201, \"name\": \"Charlie\", \"skills\": [\"SEO\", \"Content\"]},\n" +
                "          {\"id\": 202, \"name\": \"David\", \"skills\": [\"PPC\", \"Analytics\"]}\n" +
                "        ]\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"locations\": [\"New York\", \"San Francisco\", {\"HQ\": \"London\"}]\n" +
                "}";

        JsonNode root = mapper.readTree(json);
        Map<String, String> flatMap = new LinkedHashMap<>();
        flatten("", root, flatMap);

        flatMap.forEach((k, v) -> System.out.println(k + " = " + v));
    }

    private static void flatten(String prefix, JsonNode node, Map<String, String> flatMap) {
        if (node.isObject()) {
            node.fieldNames().forEachRemaining(field -> {
                String newPrefix = prefix.isEmpty() ? field : prefix + "." + field;
                flatten(newPrefix, node.get(field), flatMap);
            });
        } else if (node.isArray()) {
            int index = 0;
            for (JsonNode item : node) {
                String newPrefix = prefix + "[" + index + "]";
                flatten(newPrefix, item, flatMap);
                index++;
            }
        } else {
            flatMap.put(prefix, node.asText());
        }
    }
}


package com.example.generics;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProductCounter {
// Create a Counting Map
// Create a Name Mapping Map
    private Map<String, String> productNames;
    private Map<String, Integer> productCounts;

    public static void main(String[] args) {
        // List of part data
        String[] parts = new String[]{
            "1S01", "1S01", "1S01", "1S01", "1S01", 
            "1S02", "1S02", "1S02", "1H01", "1H01", 
            "1S02", "1S01", "1S01", "1H01", "1H01", 
            "1H01", "1S02", "1S02", "1M02", "1M02", "1M02"
        };

        // Create Product Name Part Number map
        Map<String, String> productNames = new TreeMap<>();
        productNames.put("Blue Polo Shirt", "1S01");
        productNames.put("Black Polo Shirt", "1S02");
        productNames.put("Red Ball Cap", "1H01");
        productNames.put("Duke Mug", "1M02");

        // Create Product Counter Object and process data
        ProductCounter counter = new ProductCounter(productNames);
        counter.processList(parts);
        counter.printReport();
    }

    public ProductCounter(Map<String, String> productNames) {
        this.productNames = new TreeMap<>(productNames);
        this.productCounts = new HashMap<>();
    }

    public void processList(String[] list) {
        for (String part : list) {
            productCounts.put(part, productCounts.getOrDefault(part, 0) + 1);
        }
    }

    public void printReport() {
        System.out.println("Product Report:");
        for (Map.Entry<String, String> entry : productNames.entrySet()) {
            String productName = entry.getKey();
            String partNumber = entry.getValue();
            int count = productCounts.getOrDefault(partNumber, 0);
            System.out.printf("%s (Part #: %s): %d%n", productName, partNumber, count);
        }
    }
}

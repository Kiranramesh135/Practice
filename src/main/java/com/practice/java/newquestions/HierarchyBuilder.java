package com.practice.java.newquestions;

import java.util.*;

public class HierarchyBuilder {

    public static void main(String[] args) {
        // Define employee -> manager relationships
        Map<String, String> managerMap = new HashMap<>();
        managerMap.put("F", "B");
        managerMap.put("D", "C");
        managerMap.put("C", "F");
        managerMap.put("A", "E");
        managerMap.put("X", "W");
        managerMap.put("B", "A");

        // Step 1: Find all top-level managers
        Set<String> allEmployees = managerMap.keySet();
        Set<String> allManagers = new HashSet<>(managerMap.values());

        // Top-level managers are those who are never employees
        List<String> topManagers = new ArrayList<>();
        for (String manager : allManagers) {
            if (!allEmployees.contains(manager)) {
                topManagers.add(manager);
            }
        }

        // Step 2: Build and print hierarchy from each root
        for (String top : topManagers) {
            List<String> hierarchy = new ArrayList<>();
            buildHierarchy(top, managerMap, hierarchy);
            System.out.println(String.join("->", hierarchy));
        }
    }

    // Recursive function to build hierarchy
    private static void buildHierarchy(String current, Map<String, String> managerMap, List<String> result) {
        result.add(current);
        for (Map.Entry<String, String> entry : managerMap.entrySet()) {
            if (entry.getValue().equals(current)) {
                buildHierarchy(entry.getKey(), managerMap, result);
            }
        }
    }
}


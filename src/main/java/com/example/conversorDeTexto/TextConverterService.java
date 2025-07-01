package com.example.conversorDeTexto;

import org.springframework.stereotype.Service;

@Service
public class TextConverterService {
    public String convert(String text, String mode) {
        return switch (mode.toLowerCase()) {
            case "upper"      -> text.toUpperCase();
            case "lower"      -> text.toLowerCase();
            case "capitalize" -> capitalizeWords(text);
            default           -> "Modo inválido";
        };
    }

    private String capitalizeWords(String input) {
        String[] words = input.toLowerCase().split("\\s+");
        StringBuilder capitalized = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1))
                           .append(" ");
            }
        }
        return capitalized.toString().trim();
    }
}


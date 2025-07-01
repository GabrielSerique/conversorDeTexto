package com.example.conversorDeTexto;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*") 
public class TextConverterController {

    @PostMapping("/convert")
    public Map<String, String> convertText(@RequestBody Map<String, String> request) {
        String text = request.get("text");
        String mode = request.get("mode");

        String result = "invalid mode";
        if ("upper".equalsIgnoreCase(mode)) {
            result = text.toUpperCase();
        } else if ("lower".equalsIgnoreCase(mode)) {
            result = text.toLowerCase();
        }

        return Map.of("convertedText", result);
    }
}


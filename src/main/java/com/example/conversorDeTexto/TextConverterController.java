package com.example.conversorDeTexto;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class TextConverterController {

    private final TextConverterService service;

    public TextConverterController(TextConverterService service) {
        this.service = service;
    }

    @PostMapping("/convert")
    public Map<String, String> convertText(@RequestBody Map<String, String> request) {
        String text = request.get("text");
        String mode = request.get("mode");

        String result = service.convert(text, mode);
        return Map.of("convertedText", result);
    }
}



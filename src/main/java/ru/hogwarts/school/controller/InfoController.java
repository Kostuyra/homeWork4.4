package ru.hogwarts.school.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.service.InfoService;

@RestController
@RequestMapping("getPort")
public class InfoController {
    private final InfoService infoService;

   public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    @GetMapping
    public ResponseEntity<String> getPort() {
        return ResponseEntity.ok(infoService.getPort());
    }
}

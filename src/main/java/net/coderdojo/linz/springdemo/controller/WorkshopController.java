package net.coderdojo.linz.springdemo.controller;

import net.coderdojo.linz.springdemo.model.Workshop;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/workshops")
public class WorkshopController {

    private List<Workshop> workshops = new ArrayList<>();

    public WorkshopController() {
        workshops.add(new Workshop(1,"Ein Blick hinter die Kulissen der Microsoft Cloud: Wie sieht so eine Cloud denn tatsächlich aus?", "Thomas"));
        workshops.add(new Workshop(2, "Was Brawl Stars so über dich weiß", "Markus"));
        workshops.add(new Workshop(3, "RESTful Web Services with Spring Boot", "Katharina"));
    }

    @GetMapping
    public ResponseEntity<List<Workshop>> getWorkshops() {
        return ResponseEntity.status(HttpStatus.OK).body(workshops);
    }

    @PostMapping
    public ResponseEntity<Void> addWorkshop(@RequestParam String name, @RequestParam String speaker) {
        workshops.add(new Workshop(workshops.size() + 1, name, speaker));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorkshop(@PathVariable int id) {
        workshops.removeIf(workshop -> workshop.getId() == id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}

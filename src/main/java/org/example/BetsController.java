package org.example;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/bets")
@AllArgsConstructor
public class BetsController {

    @PostMapping()
    public ResponseEntity postBet(@RequestParam Long userId, @RequestBody Object betInfo){
        // Abstract Factory Bet logic
        return (ResponseEntity) ResponseEntity.ok();
    }
}

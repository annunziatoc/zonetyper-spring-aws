package zonetyper.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.RequiredArgsConstructor;
import zonetyper.dto.UserStatsDto;
import zonetyper.service.TypingSessionService;
import org.springframework.web.bind.annotation.PostMapping;
import zonetyper.model.TypingSession;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/sessions")
@RequiredArgsConstructor
public class TypingSessionController {

    private final TypingSessionService service;

    @PostMapping
    public ResponseEntity<TypingSession> create(@RequestBody TypingSession session) {
        return ResponseEntity.ok(service.save(session));
    }

    @GetMapping("/stats")
    public ResponseEntity<UserStatsDto> getStats() {
        return ResponseEntity.ok(service.getStats());
    }

    @GetMapping("/leaderboard")
    public ResponseEntity<List<TypingSession>> getLeaderboard() {
        return ResponseEntity.ok(service.getLeaderboard());
    }
}



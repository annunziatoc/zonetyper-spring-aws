package zonetyper.service;
import zonetyper.dto.UserStatsDto;
import zonetyper.model.TypingSession;
import zonetyper.repository.TypingSessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TypingSessionService {

    private final TypingSessionRepository repository;

    public TypingSession save(TypingSession session) {
        return repository.save(session);
    }

    public List<TypingSession> getAll() {
        return repository.findAll();
    }


    public List<TypingSession> getLeaderboard() {
        return repository.getLeaderboard();
    }

    public UserStatsDto getStats() {
        double topSpeed = repository.getTopSpeed();
        double lastFiveAvgWpm = repository.getLastFiveAvgWpm();
        List<TypingSession> allStats = repository.findAll();
        return new UserStatsDto(topSpeed,  lastFiveAvgWpm, allStats);
    }
}

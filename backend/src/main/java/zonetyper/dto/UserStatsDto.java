package zonetyper.dto;

import java.util.List;
import zonetyper.model.TypingSession;

public record UserStatsDto(
    double topSpeed,
    List<TypingSession> recentStats
) {}
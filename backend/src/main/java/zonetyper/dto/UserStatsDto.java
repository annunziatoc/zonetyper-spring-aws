package zonetyper.dto;

import java.util.List;
import zonetyper.model.TypingSession;

public record UserStatsDto(
    double topSpeed,
    double lastFiveAvgWpm,
    List<TypingSession> allStats
) {}
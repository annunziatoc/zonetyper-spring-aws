package zonetyper.repository;
import zonetyper.model.TypingSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface TypingSessionRepository extends JpaRepository<TypingSession, Integer> {

    @Query(value = "SELECT * FROM typing_sessions ORDER BY wpm DESC LIMIT 10", nativeQuery = true)
    List<TypingSession> getLeaderboard();

    @Query(value = "SELECT COALESCE(MAX(wpm), 0) FROM typing_sessions", nativeQuery = true)
    double findTopSpeed();
}

package zonetyper.model;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "typing_sessions")

public class TypingSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int sourceTextId;
    private String sourceText;
    private double wpm;
    private double accuracy;
    private int duration;
    private int errorCount;
    private Instant completedAt;

}




package.com.example.demo.model;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CrimeReport {

    @Id
    private Long Id;
    private String name;
    @Column(unique=true)
    private String crimeType;
    private String description;
    private Double latitude;
    private Double longitude;
    private LocalDateTime createdAt;

    
}
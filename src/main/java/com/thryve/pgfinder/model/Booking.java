package com.thryve.pgfinder.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "bookings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String bookingId;

    private String roomId;
    private String userId;
    private String pgId;

    private LocalDate visitDate;
}

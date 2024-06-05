package org.example.airbnbcloneback.booking.repository;

import org.example.airbnbcloneback.booking.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}

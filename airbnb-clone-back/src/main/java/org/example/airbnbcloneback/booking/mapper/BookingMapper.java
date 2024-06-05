package org.example.airbnbcloneback.booking.mapper;

import org.example.airbnbcloneback.booking.application.dto.BookedDateDTO;
import org.example.airbnbcloneback.booking.application.dto.NewBookingDTO;
import org.example.airbnbcloneback.booking.domain.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    Booking newBookingToBooking(NewBookingDTO newBookingDTO);

    BookedDateDTO bookingToCheckAvailability(Booking booking);
}

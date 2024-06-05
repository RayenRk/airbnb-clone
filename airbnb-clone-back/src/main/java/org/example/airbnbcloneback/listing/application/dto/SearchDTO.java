package org.example.airbnbcloneback.listing.application.dto;

import org.example.airbnbcloneback.booking.application.dto.BookedDateDTO;
import org.example.airbnbcloneback.listing.application.dto.sub.ListingInfoDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

public record SearchDTO(@Valid BookedDateDTO dates,
                        @Valid ListingInfoDTO infos,
                        @NotEmpty String location) {
}

package org.example.airbnbcloneback.listing.application.dto;

import org.example.airbnbcloneback.listing.application.dto.vo.PriceVO;

import java.util.UUID;

public record ListingCreateBookingDTO(
        UUID listingPublicId, PriceVO price) {
}

package org.example.airbnbcloneback.listing.application.dto;

import org.example.airbnbcloneback.listing.application.dto.sub.PictureDTO;
import org.example.airbnbcloneback.listing.application.dto.vo.PriceVO;
import org.example.airbnbcloneback.listing.domain.BookingCategory;

import java.util.UUID;

public record DisplayCardListingDTO(PriceVO price,
                                    String location,
                                    PictureDTO cover,
                                    BookingCategory bookingCategory,
                                    UUID publicId) {
}

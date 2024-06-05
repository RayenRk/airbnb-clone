package org.example.airbnbcloneback.listing.application.dto.vo;

import jakarta.validation.constraints.NotNull;

public record BedroomsVO(@NotNull(message = "Bedroom value must be present") int value) {
}

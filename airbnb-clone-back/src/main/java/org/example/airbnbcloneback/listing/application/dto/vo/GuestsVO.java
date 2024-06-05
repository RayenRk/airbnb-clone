package org.example.airbnbcloneback.listing.application.dto.vo;

import jakarta.validation.constraints.NotNull;

public record GuestsVO(@NotNull(message = "Guests value must be present") int value) {
}

package org.example.airbnbcloneback.listing.application.dto.sub;

import org.example.airbnbcloneback.listing.application.dto.vo.DescriptionVO;
import org.example.airbnbcloneback.listing.application.dto.vo.TitleVO;
import jakarta.validation.constraints.NotNull;

public record DescriptionDTO(
        @NotNull TitleVO title,
        @NotNull DescriptionVO description
) {
}

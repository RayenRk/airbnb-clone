package org.example.airbnbcloneback.listing.repository;

import org.example.airbnbcloneback.listing.domain.ListingPicture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingPictureRepository extends JpaRepository<ListingPicture, Long> {
}

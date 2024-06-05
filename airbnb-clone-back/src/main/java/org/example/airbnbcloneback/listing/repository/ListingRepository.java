package org.example.airbnbcloneback.listing.repository;

import org.example.airbnbcloneback.listing.domain.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingRepository extends JpaRepository<Listing, Long> {
}

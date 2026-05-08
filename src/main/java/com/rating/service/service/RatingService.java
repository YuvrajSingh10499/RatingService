package com.rating.service.service;


import com.rating.service.entities.Rating;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RatingService {

    Rating createRating(Rating rating);
    List<Rating> getAllRatings();
    List<Rating> getRatingByUserId(String userId);

    List<Rating> getRatingByHotelId( String hotelId);

}

package com.rating.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RatingDTO {

    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;
}

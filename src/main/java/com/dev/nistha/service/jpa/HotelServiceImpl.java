package com.dev.nistha.service.jpa;

import com.dev.nistha.dto.HotelDTO;

import com.dev.nistha.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class HotelServiceImpl implements HotelService {

    @Override
    public HotelDTO createHotel(HotelDTO hotelDTO) {
        return null;
    }
}

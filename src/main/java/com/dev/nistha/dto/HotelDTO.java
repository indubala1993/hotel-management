package com.dev.nistha.dto;

import com.dev.nistha.entity.Room;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class HotelDTO {

    private String name;
    private List<RoomDTO> room;

}

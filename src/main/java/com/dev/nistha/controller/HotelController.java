package com.dev.nistha.controller;
import com.dev.nistha.service.HotelService;
import com.dev.nistha.dto.HotelDTO;
import com.dev.nistha.dto.ResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/hotel")
public class HotelController {
    private final HotelService hotelService;

     @GetMapping("/detail")
    public String getHotel() {
        return "Raddison Blu";
    }
    @PostMapping
    public ResponseEntity<ResponseDTO> addNewHotel(@RequestBody HotelDTO hotelDTO) {
        HotelDTO hotel = hotelService.createHotel(hotelDTO);

        if (hotel != null) {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(ResponseDTO.builder()
                            .code("201")
                            .message("Hotel Created")
                            .build());
        }

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ResponseDTO.builder()
                        .code("500")
                        .message("Hotel Creation Failed")
                        .build());
    }

}

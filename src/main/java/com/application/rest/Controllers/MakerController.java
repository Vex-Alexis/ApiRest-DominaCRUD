package com.application.rest.Controllers;

import com.application.rest.Controllers.dto.MakerDTO;
import com.application.rest.entities.Maker;
import com.application.rest.service.impl.MakerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/maker")
public class MakerController {

    @Autowired
    private MakerServiceImpl makerService;

    public ResponseEntity<?> findById(Long id){
        Optional<Maker> makerOptional = makerService.finById(id);

        if (makerOptional.isPresent()){

            Maker maker = makerOptional.get();

            MakerDTO makerDTO = MakerDTO.builder()
                    .id(maker.getId())
                    .name(maker.getName())
                    .productList(maker.getProductList())
                    .build();


            return ResponseEntity.ok(makerDTO);
        }

        return ResponseEntity.notFound().build();
    }
}

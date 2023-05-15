package com.deboramendes.observability.controller;

import com.deboramendes.observability.domain.dto.ObservabilityRequestDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("v1")
@RequiredArgsConstructor
public class ObservabilityControllerImpl implements IObservabilityController {
    @Override
    @PostMapping
    public void create(@RequestBody final ObservabilityRequestDTO observabilityRequestDTO) {
        log.info("POST [{}]", observabilityRequestDTO.getMessage());
    }
}

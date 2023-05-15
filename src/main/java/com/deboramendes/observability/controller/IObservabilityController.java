package com.deboramendes.observability.controller;

import com.deboramendes.observability.domain.dto.ObservabilityRequestDTO;

public interface IObservabilityController {
    void create(final ObservabilityRequestDTO observabilityRequestDTO);
}

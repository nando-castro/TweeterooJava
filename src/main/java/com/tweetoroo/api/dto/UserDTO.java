package com.tweetoroo.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserDTO(
    @NotNull @NotBlank String username,
    @NotNull @NotBlank String avatar
){}

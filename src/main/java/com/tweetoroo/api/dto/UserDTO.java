package com.tweetoroo.api.dto;

import jakarta.validation.constraints.NotNull;

public record UserDTO(
    @NotNull String username,
    @NotNull String avatar
){}

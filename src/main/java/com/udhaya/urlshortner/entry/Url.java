package com.udhaya.urlshortner.dao;


import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
@Builder
@JsonNaming(PropertyNamingStrategy.class)
public class Url {
    @NonNull
    private Integer key;

    @NonNull
    private String url;

    private LocalDateTime createdAt;
}


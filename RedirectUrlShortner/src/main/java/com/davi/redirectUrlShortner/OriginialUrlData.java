package com.davi.redirectUrlShortner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OriginialUrlData {
    private String originalUrl;
    private long expirationTime;

}

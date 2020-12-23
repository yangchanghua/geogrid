package com.zlh.catalog.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kitchen {
    private Long id;
    private String name;
    private String city;
    private String district;
    private String address;
    private Double longitude;
    private Double latitude;

}

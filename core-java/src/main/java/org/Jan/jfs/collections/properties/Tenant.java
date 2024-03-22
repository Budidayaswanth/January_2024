package org.Jan.jfs.collections.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
@AllArgsConstructor
@Data
public class Tenant {
    private String name;
    private String email;
    private String city;
    private Address address;
}

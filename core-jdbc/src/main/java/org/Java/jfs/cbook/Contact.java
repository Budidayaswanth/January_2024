package org.Java.jfs.cbook;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contact {
    private Long cid;
    private String name;
    private String email;
    private String mobile;
}

package org.mpei.HomeWork_7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Platform {
    private String name;
    private boolean isRoscomnadzored;

    @Override
    public String toString() {
        return "Platform{" +
                "name='" + name + '\'' +
                '}';
    }
}

package dz.ava.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LimitConfiguration {

    private int maximum;
    private int minimum;
}

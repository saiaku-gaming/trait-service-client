package com.valhallagame.traitserviceclient.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkilledTraitData {
    private TraitType trait;
    private AttributeType selectedAttribute;
    private Integer position;
    private Boolean purchased;
    private Integer specialization;
    private Integer specializationPosition;
}

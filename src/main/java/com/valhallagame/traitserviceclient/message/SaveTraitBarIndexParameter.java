package com.valhallagame.traitserviceclient.message;

import javax.validation.constraints.NotNull;

import com.valhallagame.common.validation.CheckLowercase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveTraitBarIndexParameter {

	@NotNull
	@CheckLowercase
	private String username;

	@NotNull
	private TraitType name;

	private int barIndex;
}

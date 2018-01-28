package com.valhallagame.traitserviceclient.message;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TraitData {
	
	@NotNull
	List<TraitType> traits;
	
	@NotNull
	List<TraitBarItem> traitBarItems;

}

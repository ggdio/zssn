package br.com.ggdio.zssn.application.view;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;

import br.com.ggdio.zssn.domain.model.LastLocation;
import br.com.ggdio.zssn.domain.model.Survivor;
import br.com.ggdio.zssn.shared.Item;

public class SurvivorView {

	private final Survivor survivor;

	@JsonCreator
	public SurvivorView(Survivor survivor) {
		this.survivor = survivor;
	}
	
	public String getName() {
		return survivor.getName();
	}
	
	public int getAge() {
		return survivor.getBirthday().until(LocalDate.now()).getYears();
	}
	
	public String getGender() {
		return survivor.getGender().toString();
	}
	
	public LocationView getLastLocation() {
		LastLocation location = survivor.getLastLocation();
		return new LocationView(location.getLatitude(), location.getLongitude());
	}
	
	public Map<String, Integer> getInventory() {
		Map<String, Integer> inventory = new HashMap<>();
		
		for (Item item : survivor.getInventoryItems()) {
			Integer qtt = inventory.get(item.getType().getKey());
			if(qtt != null) qtt += item.getQuantity();
			inventory.put(item.getType().getKey(), qtt);
		}
		
		return inventory;
	}
	
}
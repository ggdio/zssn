package br.com.ggdio.zssn.application.view;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.ggdio.zssn.domain.enumeration.Gender;
import br.com.ggdio.zssn.domain.enumeration.ItemType;
import br.com.ggdio.zssn.domain.survivor.Item;
import br.com.ggdio.zssn.domain.survivor.Location;
import br.com.ggdio.zssn.domain.survivor.Survivor;

/**
 * Input Data for New Survivors
 * @author Dio
 *
 */
public class SurvivorModel {
	
	private final Survivor survivor;
	
	public SurvivorModel(Survivor wrap) {
		this.survivor = wrap;
	}
	
	@JsonCreator
	public SurvivorModel(@JsonProperty("name") String name, @JsonProperty("age") int age, @JsonProperty("gender") String gender, @JsonProperty("lastLocation") Location lastLocation, @JsonProperty("inventory") Map<String, Object> inventory) {
		survivor = new Survivor(name, Gender.valueOf(gender.toUpperCase()), lastLocation, parse(inventory));
		survivor.setAge(age);
	}
	
	private Set<Item> parse(Map<String, Object> inventory) {
		Set<Item> items = new HashSet<>();
		
		for (String key : inventory.keySet()) {
			ItemType type = ItemType.valueOf(key.toUpperCase());
			if(type == null) continue;
			
			try {
				items.add(new Item(type, (int) inventory.get(key)));
				
			} catch(NumberFormatException e) {
				// I dont fucking care about it
				
			}
		}
		
		return items;
	}
	
	public String getName() {
		return survivor.getName();
	}
	
	public int getAge() {
		return survivor.getAge();
	}
	
	public Location getLastLocation() {
		return survivor.getLastLocation();
	}
	
	public Map<String, Integer> getInventory() {
		Map<String, Integer> inventory = new HashMap<>();
		for (Item item : survivor.getInventoryItems()) {
			String key = item.getType().toString().toLowerCase();
			Integer qtt = inventory.get(key);
			if(qtt == null) qtt = 0;
			inventory.put(key, qtt + item.getQuantity());
		}
		return inventory;
	}
	
	public Survivor unwrap() {
		return survivor;
	}
	
}
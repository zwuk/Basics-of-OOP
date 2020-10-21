package by.zvv.javaonline.part05.task04.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DragonCave implements Serializable{

	private static final long serialVersionUID = -1825054065303802842L;
	
	private List<Treasure> treasures;
	
	{
		treasures = new ArrayList<Treasure>();
	}
	
	public DragonCave() {
	}

	public List<Treasure> getTreasures() {
		return treasures;
	}

	public void setTreasures(List<Treasure> treasures) {
		this.treasures = treasures;
	}

	@Override
	public int hashCode() {
		return Objects.hash(treasures);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		DragonCave other = (DragonCave) obj;
		return Objects.equals(treasures, other.treasures);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getSimpleName());
		builder.append(" [treasures=");
		builder.append(treasures);
		builder.append("]");
		return builder.toString();
	}
	
	
}

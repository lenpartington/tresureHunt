package com.tresor.carte;

import java.util.ArrayList;
import java.util.List;

import com.tresor.carte.cellule.Cellule;

public class Carte {

	private List<Cellule> cells ;

	public Carte(String line) {
		super();
		String[] splitted = line.split(" - ");
		int x = Integer.valueOf(splitted[1]);
		int y = Integer.valueOf(splitted[2]);
		processCells(x, y);

	}

	public Carte(int x, int y) {
		super();
		processCells(x, y);

	}

	private void processCells(int x, int y) {
		cells = new ArrayList();
		for (int j = 0; j < y; j++) {
			for (int i = 0; i < x; i++) {
				cells.add(new Cellule(i, j));
			}

		}
	}

	
	public List<Cellule> getCells() {
		return cells;
	}

	public void setCells(List<Cellule> cells) {
		this.cells = cells;
	}
	
	

	
}

package it.unipv.ingsw.alchemicalbank.wizards;

import it.unipv.ingsw.alchemicalbank.Decision;
import it.unipv.ingsw.alchemicalbank.Wizard;

// Vergine Andrea

public class Wizard101 extends Wizard {

	public Wizard101() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Decision askKeepOrLiquidate(int fundValue, int timespan) {
		if(fundValue < 100) {
			return Decision.KEEP_FUND;
		} else {
			return Decision.LIQUIDATE_FUND;
		}
	}

}

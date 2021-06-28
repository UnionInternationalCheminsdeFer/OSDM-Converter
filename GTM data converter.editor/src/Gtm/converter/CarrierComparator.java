package Gtm.converter;

import java.util.Comparator;

import Gtm.LegacyCarrier;

public class CarrierComparator implements Comparator<LegacyCarrier> {


		@Override
		public int compare(LegacyCarrier o1, LegacyCarrier o2) {
			return o1.getCarrierCode().compareTo(o2.getCarrierCode());
		}

		
}

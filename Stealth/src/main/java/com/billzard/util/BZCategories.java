package com.billzard.util;

public enum BZCategories {

	BZ_FOOD(1),BZ_CLOTHES(2),BZ_SHOES(3);
	
	private int categoryCode;

	private BZCategories(int category) {
		this.categoryCode = category;
	}
	
	public BZCategories getCategory(int categoryCode){
		for(BZCategories category : BZCategories.values()){
			if(category.categoryCode == categoryCode){
				return category;
			}
		}
		return null;
	}
	
}

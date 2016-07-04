package com.main;




	import com.main.DessertItem;

	public class IceCream extends DessertItem{
		private int price;
		public IceCream(String iceCreamName, int price) {
			super(iceCreamName);
			setPrice(price);
		}

		@Override
		public int getCost() {
			int cost=0;
				cost=getPrice();
			return cost;
		}
		
		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

	}



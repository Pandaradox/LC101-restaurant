import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class restaurantControllers {
	
	public class MenuItems {
		public Map<String,String> item(String aName, String aDesc, String aCategory,
				double aPrice, boolean aFresh) {
			private String name = aName;
			private String desc = aDesc;
			private String category = aCategory;
			private String price = (String) aPrice;
			private String fresh = (String) aFresh;
			item.put("name",name);
			item.put("desc",desc);
			if (category.contains("appetizer") || category.contains("main") || category.contains("dessert")) {
				item.put("name",cat);
			}	
			item.put("price",price);
			item.put("fresh",fresh);
		}
		public Map<String,String> item(String aName, String aDesc, String aCategory,
				double aPrice) {
			this.item(aName, aDesc, aCategory, aPrice,false);
		}
	}
	
	public class Menu {
		private List<HashMap<String,String>> menu  = new ArrayList<>();
		
		
		public List loadData() {
			HashMap<String,String> item = new HashMap<String,String>();
			item.put("name","Mozzarella Stixz");
			menu.add(item);
			return menu;
		}
		
		public List appMenu(int date) {
			loadData();
			List<HashMap<String,String>> apps = new ArrayList<>();
			for (HashMap<String, String> item : menu) {
				if (item.get("category").equals("appetizer")) {
					item.put("age", "false");
					apps.add(item);
				}
			}
			return apps;
		}
	}
}

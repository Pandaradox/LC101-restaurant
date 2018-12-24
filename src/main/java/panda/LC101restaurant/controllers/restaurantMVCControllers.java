import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class restaurantControllers {
	
	
	public class MenuItems {
		
		//item constructor with name, desc, type, price, and freshness (optional)
		public MenuItems(String aName, String aDesc, String aType,
				double aPrice, String aFresh) {
			
			Map<String,String> item = new HashMap<>();
			private String name = aName;
			private String desc = aDesc;
			private String type = aType;
			private String price = (String) aPrice;
			private String fresh = aFresh;

			item.put("name",name);
			item.put("desc",desc);
			if (type.equals("app") || type.equals("main") || type.equals("des")) {
				item.put("type",aType);
			}	
			item.put("price",price);
			item.put("fresh",fresh);
		}
		
		public MenuItem(String aName, String aDesc, String atype,
				double aPrice) {
			this.item(aName, aDesc, atype, aPrice, false);
		}
		
		@Override
		public toString() {
			if (this.fresh = "new") {
				return name + " : " + price + "/n NEW! /n" + desc + "/n";
			}else {
				return name + " : " + price + "/n" + desc + "/n";
			}
		}
	}
	
	public class Menu {
		private List<HashMap<String,String>> menu  = new ArrayList<>();
		
		
		public List loadData() {
			
			HashMap<String,String> item = new HashMap<String,String>();
			item dish = new item("Mozzarella Stixz","Cheesey Batons","appetizer",4.50);
			menu.add(dish);
			return menu;
		}
		
		public List appMenu(int date) {
			loadData();
			List<HashMap<String,String>> apps = new ArrayList<>();
			for (HashMap<String, String> item : menu) {
				if (item.get("type").equals("appetizer")) {
					item.put("age", "false");
					apps.add(item);
				}
			}
			return apps;
		}
	}
	
	public static void main(String[] args) {
		Map<String,String> item = new MenuItem("Mozz","Cheese","app",4.50);
		System.out.println(item.toString());
	}
}

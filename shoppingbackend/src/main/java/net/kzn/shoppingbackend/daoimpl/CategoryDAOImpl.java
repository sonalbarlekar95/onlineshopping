package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	public static List<Category> categories = new ArrayList<>();

		static{
			
			Category category = new Category();
			category.setId(1);
			category.setName("Television");
			category.setDescription("This is some dēscription about TV");
			category.setImageURL("CAT_1.png");
			categories.add(category);
			
		    category = new Category();
			category.setId(2);
			category.setName("Mobile");
			category.setDescription("This is some dēscription about Mobile");
			category.setImageURL("CAT_2.png");
			categories.add(category);
			
			category = new Category();
			category.setId(3);
			category.setName("laptop");
			category.setDescription("This is some dēscription about Laptop");
			category.setImageURL("CAT_3.png");
			categories.add(category);
			
		}

		@Override
		public List<Category> list() {
			// TODO Auto-generated method stub
			return categories;
		}

		@Override
		public Category get(int id) {
			//for each loop
			for(Category category : categories) {
				if(category.getId() == id) 
					return category;
				
			}
			
			
			return null;
		}
		
		
	

}

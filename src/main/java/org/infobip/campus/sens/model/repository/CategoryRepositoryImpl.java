package org.infobip.campus.sens.model.repository;

import org.infobip.campus.sens.model.Category;
import org.infobip.campus.sens.model.data.DataLists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyRepositoryImpl.class);

    DataLists data;
    public CategoryRepositoryImpl(DataLists data){
        this.data=data;
    }

    public void addCategory(Category category) {
        List<Category>categories=data.getCategories();
        categories.add(category);
        data.setCategories(categories);

        LOGGER.info("Category added: ", category);
    }
}

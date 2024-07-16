package src.ss15.ra.business;

import jdk.jfr.Category;

public interface ICategories extends IGenericDesign <Category, String>{
    //cập nhật trạng thái danh mục
    void updateCatalogStatus(String categoryId, boolean catalogStatus);
}

package com.kurdestanbootcamp.categoryservice.category;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-21T01:04:26+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category toCategory(CategoryDTO categoryDTO) {
        if ( categoryDTO == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( categoryDTO.getId() );
        category.setVersion( categoryDTO.getVersion() );
        category.setCreatedDat( categoryDTO.getCreatedDat() );
        category.setCreatedBy( categoryDTO.getCreatedBy() );
        category.setLastModifiedDate( categoryDTO.getLastModifiedDate() );
        category.setLastModifiedBy( categoryDTO.getLastModifiedBy() );
        category.setTitle( categoryDTO.getTitle() );
        category.setImage( categoryDTO.getImage() );
        category.setType( categoryDTO.getType() );

        return category;
    }

    @Override
    public CategoryDTO toCategoryDTO(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setId( category.getId() );
        categoryDTO.setVersion( category.getVersion() );
        categoryDTO.setCreatedDat( category.getCreatedDat() );
        categoryDTO.setCreatedBy( category.getCreatedBy() );
        categoryDTO.setLastModifiedDate( category.getLastModifiedDate() );
        categoryDTO.setLastModifiedBy( category.getLastModifiedBy() );
        categoryDTO.setTitle( category.getTitle() );
        categoryDTO.setImage( category.getImage() );
        categoryDTO.setType( category.getType() );

        return categoryDTO;
    }

    @Override
    public List<Category> toCategoryList(List<CategoryDTO> categoryDTOS) {
        if ( categoryDTOS == null ) {
            return null;
        }

        List<Category> list = new ArrayList<Category>( categoryDTOS.size() );
        for ( CategoryDTO categoryDTO : categoryDTOS ) {
            list.add( toCategory( categoryDTO ) );
        }

        return list;
    }

    @Override
    public List<CategoryDTO> toCategortDTOs(List<Category> categoryList) {
        if ( categoryList == null ) {
            return null;
        }

        List<CategoryDTO> list = new ArrayList<CategoryDTO>( categoryList.size() );
        for ( Category category : categoryList ) {
            list.add( toCategoryDTO( category ) );
        }

        return list;
    }
}

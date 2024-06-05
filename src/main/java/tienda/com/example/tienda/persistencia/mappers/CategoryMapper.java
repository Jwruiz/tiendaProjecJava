package tienda.com.example.tienda.persistencia.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import tienda.com.example.tienda.dominio.Category;
import tienda.com.example.tienda.persistencia.entities.Categoria;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "estado", target = "state"),
            @Mapping(source = "descripcion", target = "description"),
    })
    Category  toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria (Category category);
}

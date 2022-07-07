package victor.javabeerapi;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}

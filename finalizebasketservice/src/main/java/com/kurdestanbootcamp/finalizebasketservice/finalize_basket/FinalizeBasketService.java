package com.kurdestanbootcamp.finalizebasketservice.finalize_basket;

import com.kurdestanbootcamp.finalizebasketservice.common.SearchCriteria;
import com.kurdestanbootcamp.finalizebasketservice.common.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FinalizeBasketService implements IFinalizeBasketService{

    private final FinalizeBasketRepository repository;

    @Override
    public FinalizeBasket save(FinalizeBasket finalizeBasket) {

       return repository.save(finalizeBasket);

    }

    @Override
    public void delete(Long id) {
        getById(id);
        repository.deleteById(id);
    }

    @Override
    public FinalizeBasket getById(Long id) {
        Optional<FinalizeBasket> optionalFinalizeBasket=repository.findById(id);
        if (!optionalFinalizeBasket.isPresent()){
            throw  new NotFoundException("Not Found Basket");
        }
        return optionalFinalizeBasket.get();
    }

    @Override
    public List<FinalizeBasket> getAll() {
        return (List<FinalizeBasket>) repository.findAll();
    }

    @Override
    public List<FinalizeBasket> getAllByUserId(Long userId) {
        List<FinalizeBasket> finalizeBaskets=repository.findAllByUserId(userId);
        return finalizeBaskets;
    }

    @Override
    public Page<FinalizeBasket> paging(Integer page, Integer size) {
        return repository.findAll(PageRequest.of(page,size, Sort.by("id").descending()));
    }

    @Override
    public List<FinalizeBasket> search(List<SearchCriteria> searchCriteria) {
        FinalizeBasketSpecification finalizeBasketSpecification = new FinalizeBasketSpecification();
        searchCriteria.forEach(criteria -> finalizeBasketSpecification.add(criteria));
        return repository.findAll(finalizeBasketSpecification);
    }
}

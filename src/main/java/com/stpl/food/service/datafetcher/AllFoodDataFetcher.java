package com.stpl.food.service.datafetcher;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.stpl.food.model.Food;
import com.stpl.food.repository.FoodRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class AllFoodDataFetcher implements DataFetcher<List<Food>> {

  @Autowired
  private FoodRepository foodRepository;

  @Override
  public List<Food> get(DataFetchingEnvironment environment) {
    return foodRepository.findAll();
  }
}

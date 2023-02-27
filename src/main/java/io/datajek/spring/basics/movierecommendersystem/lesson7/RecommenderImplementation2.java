package io.datajek.spring.basics.movierecommendersystem.lesson7;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {
    private Filter filter;

    // Setter injection
    @Autowired
    @Qualifier("CBF")
    public void setFilter(Filter filter) {
        this.filter = filter;
        System.out.println("Setter method invoked...");
    }

    public String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] result = filter.getRecommendations(movie);
        return result;
    }
}

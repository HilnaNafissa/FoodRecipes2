package com.example.foodrecipes2.Listeners;

import com.example.foodrecipes2.Models.RandomRecipeApiResponse;

public interface RandomRecipeResponseListener {
    void didFetch(RandomRecipeApiResponse response, String message);
    void didError(String message);
}

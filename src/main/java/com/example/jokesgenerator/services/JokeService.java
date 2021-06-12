package com.example.jokesgenerator.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public interface JokeService {
   String getJoke();
}

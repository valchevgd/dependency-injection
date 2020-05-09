package com.github.valchevgd.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("BG")
@Service("i18nService")
public class I18nBulgarianService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "\"Здравейте, българи!\" by Жорж Ганчев";
    }
}

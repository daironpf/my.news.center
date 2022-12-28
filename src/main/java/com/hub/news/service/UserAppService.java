package com.hub.news.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hub.news.model.UserApp;
import com.hub.news.repository.UserAppRepository;

@Service
public class UserAppService {
    private final UserAppRepository userAppRepository;

    public UserAppService(UserAppRepository userAppRepository) {
        this.userAppRepository = userAppRepository;
    }

    @Transactional
    public UserApp add(UserApp userApp){
        return userAppRepository.save(userApp);
    }
}

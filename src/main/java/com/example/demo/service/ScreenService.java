package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.demo.dao.Dao;
import com.example.demo.model.Screen;

@Component(value = "screenService")
public class ScreenService {

    @Autowired
    private Dao<Screen> screenDao;
    private Screen screen = new Screen();

    public void save() {
        screenDao.save(screen);
        screen = new Screen();
    }

    public Collection<Screen> getAllScreens() {
        return screenDao.getAll();
    }

    public int saveScreen(Screen screen) {
        validate(screen);
        return screenDao.save(screen);
    }

    private void validate(Screen screen) {
        // Details omitted
    }

    public Screen getScreen() {
        return screen;
    }
}
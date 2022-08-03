package com.example.demo.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.demo.model.Screen;

@Component
public class ScreenDao implements Dao<Screen> {

    private List<Screen> ScreenList = new ArrayList<>();

    @Override
    public Optional<Screen> get(int id) {
        return Optional.ofNullable(ScreenList.get(id));
    }


    @Override
    public Collection<Screen> getAll() {
        return ScreenList.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
    }

    @Override
    public int save(Screen Screen) {
        ScreenList.add(Screen);
        int index = ScreenList.size() - 1;
        Screen.setId(index);
        return index;
    }

    @Override
    public void update(Screen Screen) {
        ScreenList.set(Screen.getId(), Screen);
    }

    @Override
    public void delete(Screen Screen) {
        ScreenList.set(Screen.getId(), null);
    }
}

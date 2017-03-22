package com.hand.ssm.mapper;

import java.util.List;

import com.hand.ssm.dto.Film;

public interface FilmMapper {
    public List<Film> select(Film film);
    
    public int insertOneItem(Film film);
    
}

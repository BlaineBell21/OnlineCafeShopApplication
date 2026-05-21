package com.cafeapp.interfaces;

import java.util.List;

public interface Repositorable<T> {
    List<T> getAll();
}

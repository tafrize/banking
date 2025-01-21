package com.project.bankingserver.services;

import java.util.List;

public interface AbstractService<T> {

    Integer save (T t);

    List<T> findAll ();

    T findById (Integer id);

    void update (T t);

    void delete (Integer id);


}

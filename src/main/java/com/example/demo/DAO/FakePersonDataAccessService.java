package com.example.demo.DAO;

import com.example.demo.Model.Person;

import java.util.UUID;

public class FakePersonDataAccessService implements PersonDAO {

    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }


}

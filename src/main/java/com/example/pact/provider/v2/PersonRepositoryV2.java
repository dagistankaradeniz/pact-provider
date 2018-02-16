package com.example.pact.provider.v2;

import com.example.pact.provider.SsnValidator;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PersonRepositoryV2 {

    private static int ID_COUNTER = 1;

    Map<Integer, PersonV2> map = new HashMap<>();

    public void add(PersonV2 person) {
        SsnValidator.validate(person.getSocialSecurityNumber());
        person.setId(ID_COUNTER++);
        map.put(person.getId(), person);
    }

    public PersonV2 get(Integer id) {
        return map.get(id);
    }

    public PersonV2 getBySSn(String ssn) {
        return map.values().stream()
                .filter(person -> person.getSocialSecurityNumber().equals(ssn))
                .findFirst().orElse(null);
    }
}

package com.companyname.Friends.service;

import com.companyname.Friends.model.Friend;
import org.springframework.data.repository.CrudRepository;

public interface FriendService extends CrudRepository<Friend, Integer> {
    //Spring Data JPA will generate code for us
    Iterable<Friend> findByFirstNameAndLastName(String firstName, String lastName);
}

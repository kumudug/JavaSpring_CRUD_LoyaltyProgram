package com.companyname.Friends.controller;

import com.companyname.Friends.model.Friend;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.assertj.core.api.Assertions;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntegrationTests {

    @Autowired
    FriendController friendController;

    @Test
    public void testCreateReadDelete() throws Exception {
        Friend friend = new Friend("Fname", "LName");

        Friend friendResult = friendController.create(friend);

        Iterable<Friend> friends = friendController.read();
        Assertions.assertThat(friends).first()
                .hasFieldOrPropertyWithValue("firstName", "Fname");

        friendController.delete(friendResult.getId());
        Assertions.assertThat(friendController.read()).isEmpty();
    }
}

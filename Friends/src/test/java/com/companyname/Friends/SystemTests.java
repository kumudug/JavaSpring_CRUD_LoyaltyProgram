package com.companyname.Friends;

import com.companyname.Friends.model.Friend;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class SystemTests {

    @Test
    public void testCreateReadDelete() {
        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:8080/friend";

        Friend friend = new Friend("FName", "LName");
        ResponseEntity<Friend> entity = restTemplate.postForEntity(url, friend, Friend.class);

        Friend[] friends = restTemplate.getForObject(url, Friend[].class);
        Assertions.assertThat(friends).extracting(Friend::getFirstName).containsOnly("FName");

        restTemplate.delete(url + "/" + entity.getBody().getId());
        Assertions.assertThat(restTemplate.getForObject(url, Friend[].class)).isEmpty();
    }
}

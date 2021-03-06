package org.licket.demo.service;

import org.licket.demo.model.Contact;
import org.springframework.stereotype.Service;
import com.google.common.collect.Lists;

import java.util.List;

@Service
public class ContactsService {

    public List<Contact> getAllContacts() {
        return Lists.newArrayList(contact("picture1.jpg", "Andrew Golota", "Ble ble ble ble ble"),
            contact("picture2.jpg", "Jonh Doe", "Trala la lalalal ala"),
            contact("picture3.jpg", "Chuck Norris", "Trolololo!"));
    }

    private Contact contact(String pictureUrl, String name, String description) {
        Contact contact = new Contact();
        contact.setPictureUrl(pictureUrl);
        contact.setName(name);
        contact.setDescription(description);
        return contact;
    }
}

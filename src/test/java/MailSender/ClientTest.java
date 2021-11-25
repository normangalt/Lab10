package MailSender;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    private static Client client1;
    private static Client client2;

    @org.junit.jupiter.api.BeforeAll
    static void setUp() {
        client1 = new Client("David", 30, Sex.MALE);
        client2 = new Client("Eva", 30, Sex.FEMALE);
    }

    @org.junit.jupiter.api.Test
    void getId() {
        assertEquals(client1.getId(), 1);
        assertEquals(client2.getId(), 2);
    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals(client2.getName(), "Eva");
        assertEquals(client1.getName(), "David");
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        assertEquals(client2.getAge(), 30);
        assertEquals(client1.getAge(), 30);
    }

    @org.junit.jupiter.api.Test
    void getSex() {
        assertEquals(client2.getSex(), Sex.FEMALE);
        assertEquals(client1.getSex(), Sex.MALE);
    }
}
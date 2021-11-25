package MailSender;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    private Integer id;
    private String name;
    private Integer age;
    private Sex sex;
    Client(String name, Integer age, Sex sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.id = ClientIdGenerator.generateId();
    }
    public static class ClientIdGenerator{
        public static Integer id = 0;
        public static Integer generateId(){
            id++;
            return id;
        }
    }
}

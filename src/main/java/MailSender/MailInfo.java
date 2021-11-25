package MailSender;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class MailInfo {
    private Client client;
    private mail_sender.MailCode mailCode;
    MailInfo(Client client, mail_sender.MailCode mailCode){
        this.client = client;
        this.mailCode = mailCode;

    }
    public String getMAilText() throws FileNotFoundException {
        String text = mailCode.generateText();
        HashMap<String, String> templates = new HashMap<>();
        templates.put("%NAME%", client.getName());
        for (String key: templates.keySet()){
            text.replace(key, templates.get(key));
        }
        return text;
    }
}

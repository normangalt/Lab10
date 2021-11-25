package MailSender;

import java.util.Iterator;
import java.util.LinkedList;

public class MailBox {
    private LinkedList infos;

    public MailBox(LinkedList infos) {
        this.infos = infos;
    }
    public void addMailInfo(MailInfo mailInfo){
        this.infos.add(mailInfo);
    };
    public void sendAll(){
        for (Iterator i = infos.iterator();i.hasNext();){
            MailSender.sendEmail((MailInfo) i.next());
        }
    }
}

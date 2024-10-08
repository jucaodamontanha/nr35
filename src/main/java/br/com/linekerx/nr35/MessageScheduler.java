package br.com.linekerx.nr35;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageScheduler {

    @Autowired
    private PhoneNumberService phoneNumberService;

    @Autowired
    private WhatsAppService whatsAppService;

    @Scheduled(fixedRate = 3600000) // 1 hora em milissegundos
    public void sendMessages() {
        List<PhoneNumber> phoneNumbers = phoneNumberService.findAll();
        for (PhoneNumber phoneNumber : phoneNumbers) {
            whatsAppService.sendWhatsAppMessage(phoneNumber.getNumber(), "Sua mensagem automática aqui");
        }
    }
}


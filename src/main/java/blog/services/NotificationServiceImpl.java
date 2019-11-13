package blog.services;

import blog.constant.NotificationMessageType;
import blog.models.NotificationMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {
    public static final String NOTIFY_MSG_SESSION_KEY = "siteNotificationMessages";
    @Autowired
    private HttpSession httpSession;
    @Override
    public void addErrorMessage(String message) {
        addMessage(NotificationMessageType.ERROR, message);
    }
    @Override
    public void addInfoMessage(String message) {
        addMessage(NotificationMessageType.INFO, message);
    }
    public void addMessage(NotificationMessageType type, String message)
    {
        List<NotificationMessage> notificationMessage = (List<NotificationMessage>)
        httpSession.getAttribute(NOTIFY_MSG_SESSION_KEY);
        if (notificationMessage == null) {
            notificationMessage = new ArrayList<NotificationMessage>();
        }
        notificationMessage.add(new NotificationMessage(type, message));
        httpSession.setAttribute(NOTIFY_MSG_SESSION_KEY, notificationMessage);
    }
}

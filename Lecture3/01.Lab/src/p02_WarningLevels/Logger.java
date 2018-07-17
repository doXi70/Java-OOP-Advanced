package p02_WarningLevels;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private List<Message> messages;
    private Importance importanceLevel;

    public Logger(Importance importanceLevel) {
        this.importanceLevel = importanceLevel;
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        if (this.importanceLevel.ordinal() <= message.getImportance().ordinal()) {
            this.messages.add(message);
        }
    }

    public Iterable<Message> getMessages() {
        return this.messages;
    }
}

package observer;

import subject.Subject;

public interface Observer {
    void setSubject(Subject subject);
    void update();
}

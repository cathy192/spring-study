package java8to11.spring;

import java.time.Duration;

public class Progress {
    private Duration StudyDuration;


    public void setStudyDuration(Duration studyDuration) {
        this.StudyDuration = studyDuration;
    }

    public Duration getStudyDuration() {
        return StudyDuration;
    }

    private boolean finished;

}

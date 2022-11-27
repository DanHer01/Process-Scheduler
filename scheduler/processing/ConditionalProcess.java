package scheduler.processing;

import scheduler.processing.SimpleProcess;

public class ConditionalProcess extends SimpleProcess {
    // Attributes
    double duration;

    // Constructors
    public ConditionalProcess(int id, double duration) {
        super(id);
        this.duration = duration;
    }

    // Methods
    public String getType() {
        return "C";
    }
}


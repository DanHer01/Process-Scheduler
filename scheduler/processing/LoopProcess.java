package scheduler.processing;

import scheduler.processing.SimpleProcess;

public class LoopProcess extends SimpleProcess {
    // Attributes
    double duration;

    // Constructors
    public LoopProcess(int id, double duration) {
        super(id);
        this.duration = duration;
    }

    // Methods
    public String getType() {
        return "L";
    }
}


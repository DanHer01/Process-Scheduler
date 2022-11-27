package scheduler.processing;

import scheduler.processing.SimpleProcess;

public class InputOutputProcess extends SimpleProcess {
    // Attributes
    double duration;

    // Constructors
    public InputOutputProcess(int id, double duration) {
        super(id);
        this.duration = duration;
    }

    // Methods
    public String getType() {
        return "IO";
    }
}


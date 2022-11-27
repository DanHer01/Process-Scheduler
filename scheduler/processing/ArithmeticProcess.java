package scheduler.processing;

import scheduler.processing.SimpleProcess;

public class ArithmeticProcess extends SimpleProcess {
    // Attributes
    double duration;

    // Constructors
    public ArithmeticProcess(int id, double duration) {
        super(id);
        this.duration = duration;
    }

    // Methods
    public String getType() {
        return "A";
    }
}

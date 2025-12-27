public class PriorityTreatmentQueue {

    private TreatmentQueue priorityQueue;
    private TreatmentQueue normalQueue;

    public PriorityTreatmentQueue() {
        priorityQueue = new TreatmentQueue();
        normalQueue = new TreatmentQueue();
    }

    public void enqueue(TreatmentRequest request) {
        if (request.priority) {
            priorityQueue.enqueue(request);
        } else {
            normalQueue.enqueue(request);
        }
    }

    public TreatmentRequest dequeue() {
        if (priorityQueue.size() > 0) {
            return priorityQueue.dequeue();
        }
        return normalQueue.dequeue();
    }
}


package org.test;

public class MultiReceiver implements javax.sound.midi.Receiver {
    private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(MultiReceiver.class);

    private final java.util.List<javax.sound.midi.Receiver> receivers = new java.util.ArrayList<>();

    public void addReceiver(javax.sound.midi.Receiver receiver) {
        receivers.add(receiver);
    }

    public void removeReceiver(javax.sound.midi.Receiver receiver) {
        receivers.remove(receiver);
    }

    @Override
    public void send(javax.sound.midi.MidiMessage message, long timeStamp) {

        for (javax.sound.midi.Receiver receiver : receivers) {
            receiver.send(message, timeStamp);
        }
    }

    @Override
    public void close() {
        for (javax.sound.midi.Receiver receiver : receivers) {
            receiver.close();
        }
        receivers.clear();
    }
}

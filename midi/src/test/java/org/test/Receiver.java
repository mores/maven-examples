package org.test;

public class Receiver implements javax.sound.midi.Receiver {
    private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Receiver.class);

    private int minNote = 999;
    private int maxNote = -999;
    private java.util.Set<Integer> velocities = new java.util.HashSet<>();

    @Override
    public void send(javax.sound.midi.MidiMessage message, long timeStamp) {

        if (message instanceof javax.sound.midi.ShortMessage) {
            javax.sound.midi.ShortMessage shortMessage = (javax.sound.midi.ShortMessage) message;

            int channel = shortMessage.getChannel();
            int command = shortMessage.getCommand();
            int key = shortMessage.getData1();
            int velocity = shortMessage.getData2();

            if (command == javax.sound.midi.ShortMessage.NOTE_ON) {
                log.info("ON: " + channel + "\t" + key + "\t" + velocity);
            } else if (command == javax.sound.midi.ShortMessage.NOTE_OFF) {
                log.info("OFF: " + channel + "\t" + key + "\t" + velocity);
            }

            if (key > maxNote) {
                maxNote = key;
            }

            if (key < minNote) {
                minNote = key;
            }

            velocities.add(velocity);

        } else {
            log.info("MidiMessage: " + message);
        }
    }

    @Override
    public void close() {

        log.info("Min Note: " + minNote);
        log.info("Max Note: " + maxNote);
        log.info("velocities: " + velocities);
    }
}

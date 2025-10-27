package org.test;

public class Receiver implements javax.sound.midi.Receiver {
    private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Receiver.class);

    @Override
    public void send(javax.sound.midi.MidiMessage message, long timeStamp) {

        if (message instanceof javax.sound.midi.ShortMessage) {
            javax.sound.midi.ShortMessage shortMessage = (javax.sound.midi.ShortMessage) message;
            log.info("Short: " + shortMessage);

            int channel = shortMessage.getChannel();
            int command = shortMessage.getCommand();
            int key = shortMessage.getData1();
            int velocity = shortMessage.getData2();

            log.info(channel + "\t" + command + "\t" + key + "\t" + velocity);
        }
    }

    @Override
    public void close() {
    }
}
